package com.example.demo.service;

import com.example.demo.domain.Plata;
import com.example.demo.request.CreatePlataRequest;

public interface PlataService {
    Plata createPlata(CreatePlataRequest request);
    Plata getPlataById(String id);
}
