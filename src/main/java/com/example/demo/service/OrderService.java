package com.example.demo.service;

import com.example.demo.domain.Order;
import com.example.demo.request.CreateOrderRequest;

import java.util.List;

public interface OrderService {
    Order createOrder(CreateOrderRequest request);
    Order getOrderByID(String idORder);
    List<Order> getOrdere();

}
