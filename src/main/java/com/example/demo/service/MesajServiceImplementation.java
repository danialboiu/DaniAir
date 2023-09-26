package com.example.demo.service;

import com.example.demo.domain.Mesaj;
import com.example.demo.exceptions.MesajIdNotFoundException;
import com.example.demo.request.CreateMesajRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class MesajServiceImplementation implements MesajService {
    List<Mesaj> mesaje = new ArrayList<>();
    OrderService orderService;
    CursaDetailsService cursaDetailsService;
    public MesajServiceImplementation(OrderService orderService, CursaDetailsService cursaDetailsService) {
        this.orderService = orderService;
        this.cursaDetailsService = cursaDetailsService;
    }
    @Override
    public Mesaj createMesaj(CreateMesajRequest request) {
        String idMesaj = UUID.randomUUID().toString();
        Mesaj mesaj = new Mesaj(idMesaj,request.getContinutMesaj(), cursaDetailsService.getUsersByIdCursa(request.getIdCursa()));
        return mesaj;
    }

    @Override
    public Mesaj getMesajById(String idMesaj) {
        var mesajCurent = mesaje.stream().filter(mesaj -> mesaj.getIdMesaj().equals(idMesaj)).findFirst();
        if(mesajCurent.isPresent()) {
            return mesajCurent.get();
        } else {
            throw new MesajIdNotFoundException();
        }

    }

    @Override
    public List<Mesaj> getMesaje() {
        return mesaje;
    }
}
