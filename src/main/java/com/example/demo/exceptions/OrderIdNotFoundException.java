package com.example.demo.exceptions;

public class OrderIdNotFoundException extends RuntimeException{
    public OrderIdNotFoundException() {
        super("Order Id not found");
    }
}
