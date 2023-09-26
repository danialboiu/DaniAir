package com.example.demo.service;

import com.example.demo.domain.Avion;
import com.example.demo.request.CreateAeroportRequest;
import com.example.demo.request.CreateAvionRequest;

import java.util.List;

public interface AvionService {
    Avion createAvion(CreateAvionRequest request);
    Avion getAvionById(String id);
    List<Avion> getAvioane();

}
