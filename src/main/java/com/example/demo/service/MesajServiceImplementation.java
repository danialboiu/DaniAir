package com.example.demo.service;

import com.example.demo.domain.Mesaj;
import com.example.demo.request.CreateMesajRequest;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class MesajServiceImplementation implements MesajService {
    OrderService orderService;
    public MesajServiceImplementation(OrderService orderService) {
        this.orderService = orderService;
    }
    @Override
    public Mesaj createMesaj(CreateMesajRequest request) {
        String idMesaj = UUID.randomUUID().toString();

        Mesaj mesaj = new Mesaj(idMesaj,request.getContinutMesaj(),orderService.)
    }

    @Override
    public Mesaj getMesajById(String idMesaj) {
        return null;
    }
}
