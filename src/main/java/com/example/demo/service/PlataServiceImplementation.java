package com.example.demo.service;

import com.example.demo.domain.Plata;
import com.example.demo.exceptions.PlataIdNotFoundException;
import com.example.demo.exceptions.UserIdNotFoundException;
import com.example.demo.request.CreatePlataRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class PlataServiceImplementation implements PlataService {
    List<Plata> plati = new ArrayList<>();
    CursaService cursaService;
    CursaDetailsService cursaDetailsService;
    private static final String INIT = "init";

    public PlataServiceImplementation(CursaService cursaService, CursaDetailsService cursaDetailsService) {
        this.cursaService = cursaService;
        this.cursaDetailsService = cursaDetailsService;
    }

    @Override
    public Plata createPlata(CreatePlataRequest request) {
        String idPlata = UUID.randomUUID().toString();
        float suma = cursaDetailsService.getCursaDetails(request.getIdCursa()).getPret();
        Plata plata = new Plata(INIT, idPlata, suma, request.getIdCursa());
        plati.add(plata);
        return plata;
    }

    @Override
    public Plata getPlataById(String id) {
        var plataCurenta = plati.stream().filter(plata -> plata.getIdPlata().equals(id)).findFirst();
        if(plataCurenta.isPresent()) {
            return plataCurenta.get();
        } else {
            throw new PlataIdNotFoundException();
        }
    }

    @Override
    public List<Plata> getPlati() {
        return plati;
    }
}
