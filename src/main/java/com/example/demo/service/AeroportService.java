package com.example.demo.service;

import com.example.demo.domain.Aeroport;
import com.example.demo.request.CreateAeroportRequest;

public interface AeroportService {
     Aeroport createAeroport(CreateAeroportRequest request);
     Aeroport getAeroportById(String id);
}
