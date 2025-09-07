package com.proyectott2.spring.apienergia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyectott2.spring.apienergia.model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long>{

    public UserModel findByEmail(String email);
}
