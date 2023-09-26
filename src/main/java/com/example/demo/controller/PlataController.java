package com.example.demo.controller;

import com.example.demo.domain.Aeroport;
import com.example.demo.domain.Card;
import com.example.demo.domain.Plata;
import com.example.demo.request.CreateCardRequest;
import com.example.demo.request.CreatePlataRequest;
import com.example.demo.service.CardService;
import com.example.demo.service.PlataService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlataController {
    PlataService plataService;
    public PlataController(PlataService plataService) {
        this.plataService = plataService;
    }
    @GetMapping("/plati/{id}")
    Plata getPlataById(@PathVariable String id) {
        return plataService.getPlataById(id);
    }
    @PostMapping("/plati")
    Plata createPlata(@RequestBody CreatePlataRequest request) {
        return plataService.createPlata(request);
    }
    @GetMapping("/plati")
    List<Plata> getPlata() {
        return plataService.getPlati();
    }
}
