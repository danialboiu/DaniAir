package com.example.demo.controller;

import com.example.demo.domain.Avion;
import com.example.demo.request.CreateAvionRequest;
import com.example.demo.service.AvionService;
import org.springframework.web.bind.annotation.*;

@RestController
public class AvionController {
    AvionService avionService;

    public AvionController(AvionService avionService) {
        this.avionService = avionService;
    }
    @PostMapping("/avioane")
    Avion createAvion(@RequestBody CreateAvionRequest request) {
        return avionService.createAvion(request);
    }

    @GetMapping("/avioane/{id}")
    Avion getAvionById(@PathVariable String id) {
        return avionService.getAvionById(id);
    }

}
