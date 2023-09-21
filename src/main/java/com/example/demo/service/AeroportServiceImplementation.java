package com.example.demo.service;

import com.example.demo.domain.Aeroport;
import com.example.demo.exceptions.AeroportIdNotFoundException;
import com.example.demo.request.CreateAeroportRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Service
public class AeroportServiceImplementation implements AeroportService {
    List<Aeroport> aeroporturi = new ArrayList<>();
    @Override
    public Aeroport createAeroport(CreateAeroportRequest request) {
        String idAeroport = UUID.randomUUID().toString();
        Aeroport aeroport = new Aeroport(request.getNumeAeroport(),idAeroport);
        aeroporturi.add(aeroport);
        return aeroport;
    }
    public Aeroport getAeroportById(String id) {
        var aeroportCurent = aeroporturi.stream().filter(aeroport -> aeroport.getIdAeroport().equals(id)).findFirst();
        if(aeroportCurent.isPresent()) {
            return aeroportCurent.get();
        } else {
            throw new AeroportIdNotFoundException();
        }
    }
}
