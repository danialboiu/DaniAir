package com.example.demo.exceptions;

public class AvionIdNotFoundException extends RuntimeException{
    public AvionIdNotFoundException() {
        super("Avion Id not found");
    }
}
