package com.example.demo.service;

import com.example.demo.domain.CursaDetails;
import com.example.demo.exceptions.CursaIdNotFoundException;
import com.example.demo.request.CreateCursaDetailsRequest;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class CursaDetailsServiceImplementation implements CursaDetailsService{

    Map<String, CursaDetails> curseDetalii = new HashMap<>();

    public List<String> getUsersByIdCursa(String idCursa) {
        if(curseDetalii.containsKey(idCursa)) {
            return curseDetalii.get(idCursa).getCalatori();
        } else {
            throw new CursaIdNotFoundException();
        }
    }
    public CursaDetails getCursaDetails(String idCursa) {
       if(curseDetalii.containsKey(idCursa)) {
           return curseDetalii.get(idCursa);
       } else {
           throw new CursaIdNotFoundException();
       }
    }

    @Override
    public List<String> addCalator(String idCursa, String idCalator) {
        curseDetalii.get(idCursa).getCalatori().add(idCalator);
        return curseDetalii.get(idCursa).getCalatori();
    }

    @Override
    public CursaDetails createCursaDetails(CreateCursaDetailsRequest request) {
        CursaDetails cursaDetails = new CursaDetails(request.getNrLocuriDisponibile(), request.getPret(),request.getIdCursa());
        curseDetalii.put(request.getIdCursa(),cursaDetails);
        return cursaDetails;
    }

    @Override
    public float getPretCursa(String idCursa) {
        return curseDetalii.get(idCursa).getPret();
    }

}
