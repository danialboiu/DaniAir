package com.example.demo.exceptions;

public class CardIdNotFoundException extends RuntimeException{
    public CardIdNotFoundException() {
        super("Card Id not found");
    }
}
