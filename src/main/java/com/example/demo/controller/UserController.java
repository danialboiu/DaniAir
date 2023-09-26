package com.example.demo.controller;

import com.example.demo.domain.Aeroport;
import com.example.demo.domain.User;
import com.example.demo.request.CreateUserRequest;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    UserService userService;
    public UserController(UserService userService) { this.userService = userService; }


    @PostMapping("/useri")
    User createUser(@RequestBody CreateUserRequest request) {
       return userService.createUser(request);
    }

    @GetMapping("/useri/{id}")
    User getUserById(@PathVariable String id) {
        return userService.getUserById(id);
    }

    @GetMapping("/useri")
    List<User> getUseri() {
        return userService.getUseri();
    }
}
