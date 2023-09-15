package com.example.demo.service;

import com.example.demo.domain.User;
import com.example.demo.request.CreateUserRequest;

public interface UserService {
    User createUser(CreateUserRequest request);
    User getUserById(String id);
}
