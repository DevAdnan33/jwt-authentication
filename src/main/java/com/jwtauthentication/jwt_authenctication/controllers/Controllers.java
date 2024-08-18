package com.jwtauthentication.jwt_authenctication.controllers;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jwtauthentication.jwt_authenctication.Services.UserService;

import org.springframework.web.bind.annotation.RestController;

import com.jwtauthentication.jwt_authenctication.model.User;

@RestController
@RequestMapping("/home")
public class Controllers {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/current-user")
    public String getCurrentUser(Principal principal) {
        return principal.getName();
    }
}
