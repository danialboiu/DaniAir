package com.example.demo.controller;

import com.example.demo.domain.Aeroport;
import com.example.demo.request.CreateAeroportRequest;
import com.example.demo.service.AeroportService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AeroportController {
    AeroportService aeroportService;
    public AeroportController(AeroportService aeroportService) {
        this.aeroportService = aeroportService;
    }
    @GetMapping("/aeroporturi/{id}")
    Aeroport getAeroportById(@PathVariable String id) {
        return aeroportService.getAeroportById(id);
    }
    @GetMapping("/aeroporturi")
    List<Aeroport> getAeroporturi() {
        return aeroportService.getAeroporturi();
    }
    @PostMapping("/aeroporturi")
    Aeroport createAeroport(@RequestBody CreateAeroportRequest request) {
        return aeroportService.createAeroport(request);
    }
}
