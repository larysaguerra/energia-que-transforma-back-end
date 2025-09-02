package com.proyectott2.spring.apienergia.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.proyectott2.spring.apienergia.model.UserModel;
import com.proyectott2.spring.apienergia.service.UserService;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


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
}
