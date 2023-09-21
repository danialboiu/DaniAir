package com.example.demo.service;

import com.example.demo.domain.Order;
import com.example.demo.request.CreateOrderRequest;

import java.util.*;

public class OrderServiceImplementation implements OrderService{
    CursaDetailsService cursaDetailsService;
    List<Order> ordere = new ArrayList<>();
    public OrderServiceImplementation(CursaDetailsService cursaDetailsService) {
        this.cursaDetailsService = cursaDetailsService;
    }
    @Override
    public Order createOrder(CreateOrderRequest request) {
        String idOrder = UUID.randomUUID().toString();
        Order order = new Order(request.getIdCursa(),request.getIdUser(), cursaDetailsService.getPretCursa(request.getIdCursa()),request.getDataAchizitiei(),idOrder);
        ordere.add(order);
        cursaDetailsService.addCalator(request.getIdCursa(),request.getIdUser());
        return order;
    }
}
