package com.example.demo.exceptions;

public class MesajIdNotFoundException extends RuntimeException{
    public MesajIdNotFoundException() {
        super("Mesaj Id not found");
    }
}
