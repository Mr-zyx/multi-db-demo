package com.example.controller;

import com.example.model.secondary.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/primary")
    public List<User> getPrimaryUsers() {
        return userService.getPrimaryUsers();
    }

    @GetMapping("/secondary")
    public List<User> getSecondaryUsers() {
        return userService.getSecondaryUsers();
    }
}
