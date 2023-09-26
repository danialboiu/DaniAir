package com.example.demo.service;

import com.example.demo.domain.Card;
import com.example.demo.domain.Mesaj;
import com.example.demo.request.CreateCardRequest;
import com.example.demo.request.CreateMesajRequest;

import java.util.List;

public interface MesajService {
    Mesaj createMesaj(CreateMesajRequest request);
    Mesaj getMesajById(String idMesaj);
    List<Mesaj> getMesaje();
}
