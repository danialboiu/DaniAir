package com.example.demo.exceptions;

public class PlataIdNotFoundException extends RuntimeException{
    public PlataIdNotFoundException() {
        super("Plata Id not found");
    }
}
