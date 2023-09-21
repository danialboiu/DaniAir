package com.example.demo.service;

import com.example.demo.domain.Order;
import com.example.demo.request.CreateOrderRequest;

public interface OrderService {
    Order createOrder(CreateOrderRequest request);

}
