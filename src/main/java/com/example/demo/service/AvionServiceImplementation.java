package com.example.demo.service;

import com.example.demo.domain.Avion;
import com.example.demo.exceptions.AvionIdNotFoundException;
import com.example.demo.request.CreateAvionRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Service
public class AvionServiceImplementation implements AvionService {
    List<Avion> avioane = new ArrayList<>();

    @Override
    public Avion createAvion(CreateAvionRequest request) {
        String idAvion = UUID.randomUUID().toString();
        Avion avion = new Avion(request.getTipAvion(), request.getKmAutonomie(), request.getCapacitatePasageri(), idAvion);
        avioane.add(avion);
        return avion;
    }
    public Avion getAvionById(String id) {
        var avionCurent = avioane.stream().filter(avion -> avion.getIdAvion().equals(id)).findFirst();
        if(avionCurent.isPresent()) {
            return avionCurent.get();
        } else {
            throw new AvionIdNotFoundException();
        }
    }

    @Override
    public List<Avion> getAvioane() {
        return avioane;
    }
}
