package com.example.demo.service;

import com.example.demo.domain.Plata;
import com.example.demo.request.CreatePlataRequest;

import java.util.List;

public interface PlataService {
    Plata createPlata(CreatePlataRequest request);
    Plata getPlataById(String id);
    List<Plata> getPlati();

}
