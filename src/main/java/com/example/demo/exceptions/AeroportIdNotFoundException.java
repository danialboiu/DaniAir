package com.example.demo.exceptions;

public class AeroportIdNotFoundException extends RuntimeException{
    public AeroportIdNotFoundException() {
        super("Aeroport Id not found");
    }
}
