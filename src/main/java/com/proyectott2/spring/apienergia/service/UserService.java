package com.proyectott2.spring.apienergia.service;

import java.security.Key;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

import com.proyectott2.spring.apienergia.request.LoginRequest;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectott2.spring.apienergia.model.UserModel;
import com.proyectott2.spring.apienergia.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    private static final Key hashKey = Keys.secretKeyFor(SignatureAlgorithm.HS256);

    public ArrayList<UserModel> getUsers() {
        return (ArrayList<UserModel>) userRepository.findAll();
    }

    public UserModel saveUser(UserModel user) {
        return userRepository.save(user);
    }

    public UserModel getById(Long id) {
        return this.userRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
    }

    public UserModel login(LoginRequest request) {
        UserModel user = this.userRepository.findByEmail(request.email);
        if (!Objects.equals(user.getPassword(), request.password)) {
            throw new RuntimeException("Fallo al iniciar sesion");
        }
        user.setToken(generateToken(request.email));
        return this.userRepository.save(user);
    }

    public UserModel updateUser(Long id, UserModel userDetails) {
        UserModel existingUser = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        existingUser.setNombre(userDetails.getNombre());
        existingUser.setEmail(userDetails.getEmail());
        existingUser.setPassword(userDetails.getPassword());

        return userRepository.save(existingUser);
    }

    public UserModel checkAuth(String token) {
        if (isLogin(token)) {
            return this.userRepository.findByEmail(getEmail(token));
        } else {
            throw new RuntimeException("Usuario no autorizado");
        }
    }

    private static String generateToken(String email) {
        Date now = new Date();
        Date expired = new Date(now.getTime() + 60 * 60 * 1000);
        return Jwts.builder().setSubject(email).setIssuedAt(now).setExpiration(expired).signWith(hashKey).compact();
    }

    private static boolean isLogin(String token) {
        try {
            Jwts.parserBuilder().setSigningKey(hashKey).build().parseClaimsJws(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private static String getEmail(String token) {
        try {
            Claims claims = Jwts.parserBuilder().setSigningKey(hashKey).build().parseClaimsJws(token).getBody();
            return claims.getSubject();
        } catch (Exception e) {
            throw new RuntimeException("Usuario no autorizado");
        }
    }

}
