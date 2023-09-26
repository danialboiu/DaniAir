package com.example.demo.service;

import com.example.demo.domain.Order;
import com.example.demo.exceptions.OrderIdNotFoundException;
import com.example.demo.request.CreateOrderRequest;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class OrderServiceImplementation implements OrderService{
    CursaDetailsService cursaDetailsService;
    List<Order> ordere = new ArrayList<>();
    public OrderServiceImplementation(CursaDetailsService cursaDetailsService) {
        this.cursaDetailsService = cursaDetailsService;
    }
    @Override
    public Order createOrder(CreateOrderRequest request) {
        String idOrder = UUID.randomUUID().toString();
        float pretCursa = cursaDetailsService.getPretCursa(request.getIdCursa());
        Order order = new Order(request.getIdCursa(), request.getIdUser(), pretCursa, request.getDataAchizitiei(), idOrder);
        ordere.add(order);
        cursaDetailsService.addCalator(request.getIdCursa(),request.getIdUser());
        return order;
    }

    @Override
    public Order getOrderByID(String idORder) {
        var orderCurent = ordere.stream().filter(order -> order.getIdOrder().equals(idORder)).findFirst();
        if(orderCurent.isPresent()) {
            return orderCurent.get();
        } else {
            throw new OrderIdNotFoundException();
        }
    }

    @Override
    public List<Order> getOrdere() {
        return ordere;
    }
}
