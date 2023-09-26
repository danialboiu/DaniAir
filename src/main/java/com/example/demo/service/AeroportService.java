package com.example.demo.service;

import com.example.demo.domain.Aeroport;
import com.example.demo.request.CreateAeroportRequest;

import java.util.List;

public interface AeroportService {
     Aeroport createAeroport(CreateAeroportRequest request);
     Aeroport getAeroportById(String id);
     List<Aeroport> getAeroporturi();
}
