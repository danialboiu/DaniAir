package com.example.demo.controller;

import com.example.demo.domain.Aeroport;
import com.example.demo.request.CreateAeroportRequest;
import com.example.demo.service.AeroportService;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/aeroporturi")
    Aeroport createAeroport(@RequestBody CreateAeroportRequest request) {
        return aeroportService.createAeroport(request);
    }
}
