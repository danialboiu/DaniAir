package com.example.demo.service;

import com.example.demo.domain.Avion;
import com.example.demo.request.CreateAeroportRequest;
import com.example.demo.request.CreateAvionRequest;

public interface AvionService {
    Avion createAvion(CreateAvionRequest request);
    Avion getAvionById(String id);
}
