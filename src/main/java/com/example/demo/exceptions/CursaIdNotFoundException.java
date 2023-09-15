package com.example.demo.exceptions;

public class CursaIdNotFoundException extends RuntimeException{
    public CursaIdNotFoundException() {
        super("Cursa Id not found");
    }
}
