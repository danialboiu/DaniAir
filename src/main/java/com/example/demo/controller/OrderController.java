package com.example.demo.controller;

import com.example.demo.domain.Aeroport;
import com.example.demo.domain.Mesaj;
import com.example.demo.domain.Order;
import com.example.demo.request.CreateMesajRequest;
import com.example.demo.request.CreateOrderRequest;
import com.example.demo.service.MesajService;
import com.example.demo.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    OrderService orderService;
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    @GetMapping("/ordere/{id}")
    Order getOrderByID(@PathVariable String id) {
        return orderService.getOrderByID(id);
    }
    @PostMapping("/ordere")
    Order createORder(@RequestBody CreateOrderRequest request) {
        return orderService.createOrder(request);
    }
    @GetMapping("/ordere")
    List<Order> getOrdere() {
        return orderService.getOrdere();
    }

}
