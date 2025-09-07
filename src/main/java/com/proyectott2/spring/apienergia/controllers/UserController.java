package com.proyectott2.spring.apienergia.controllers;

import com.proyectott2.spring.apienergia.request.LoginRequest;
import org.springframework.web.bind.annotation.*;

import com.proyectott2.spring.apienergia.model.UserModel;
import com.proyectott2.spring.apienergia.service.UserService;

import java.util.ArrayList;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import io.jsonwebtoken.Jwts;


@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getusers")
    public ArrayList<UserModel> getUser() {
        return this.userService.getUsers();
    }

    @PostMapping("/saveusers")
    public UserModel saveUser(@RequestBody UserModel user) {
        return this.userService.saveUser(user);
    }


    @PostMapping("/login")
    public UserModel login(@RequestBody LoginRequest request) {
        return this.userService.login(request);
    }

    @PostMapping("/checkAuth")
    public UserModel checkLogin(@RequestHeader("token") String token) {
        return this.userService.checkAuth(token);
    }



}
