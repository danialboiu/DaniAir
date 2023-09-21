package com.example.demo.service;

import com.example.demo.domain.Cursa;
import com.example.demo.exceptions.CursaIdNotFoundException;
import com.example.demo.request.CreateCursaRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class CursaServiceImplementation implements CursaService{
    List<Cursa> curse = new ArrayList<>();
    AvionService avionService;
    AeroportService aeroportService;
    public CursaServiceImplementation(AeroportService aeroportService, AvionService avionService) {
        this.aeroportService = aeroportService;
        this.avionService = avionService;
    }
    @Override
    public Cursa createCursa(CreateCursaRequest request) {
        String idCursa = UUID.randomUUID().toString();
        avionService.getAvionById(request.getIdAvion());
        aeroportService.getAeroportById(request.getIdAeroportDestinatie());
        aeroportService.getAeroportById(request.getIdAeroportPlecare());
        Cursa cursa = new Cursa(request.getOraPlecare(),
                request.getDurataInOre(),
                request.getIdAeroportPlecare(),
                request.getIdAeroportDestinatie(),
                idCursa,
                request.getIdAvion(),
                request.getStatus());
        curse.add(cursa);
        return cursa;
    }

    @Override
    public Cursa getCursaById(String id) {
        var cursaCurenta = curse.stream().filter(cursa -> cursa.getIdCursa().equals(id)).findFirst();
        if(cursaCurenta.isPresent()) {
            return cursaCurenta.get();
        } else {
            throw new CursaIdNotFoundException();
        }
    }
}
