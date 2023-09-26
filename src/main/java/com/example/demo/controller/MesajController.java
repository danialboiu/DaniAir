package com.example.demo.controller;

import com.example.demo.domain.Aeroport;
import com.example.demo.domain.Card;
import com.example.demo.domain.Mesaj;
import com.example.demo.request.CreateCardRequest;
import com.example.demo.request.CreateMesajRequest;
import com.example.demo.service.CardService;
import com.example.demo.service.MesajService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MesajController {
    MesajService mesajService;
    public MesajController(MesajService mesajService) {
        this.mesajService = mesajService;
    }
    @GetMapping("/mesaje/{id}")
    Mesaj getMesajById(@PathVariable String id) {
        return mesajService.getMesajById(id);
    }
    @PostMapping("/mesaje")
    Mesaj createMesaj(@RequestBody CreateMesajRequest request) {
        return mesajService.createMesaj(request);
    }
    @GetMapping("/mesaje")
    List<Mesaj> getMesaje() {
        return mesajService.getMesaje();
    }
}
