package com.example.demo.exceptions;

public class UserIdNotFoundException extends RuntimeException{
    public UserIdNotFoundException() {
        super("User Id not found");
    }
}
