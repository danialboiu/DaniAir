package com.example.demo.controller;

import com.example.demo.domain.Cursa;
import com.example.demo.request.CreateCursaRequest;
import com.example.demo.service.CursaService;
import org.springframework.web.bind.annotation.*;

@RestController
public class CursaController {
    CursaService cursaService;
    public CursaController(CursaService cursaService) {
        this.cursaService = cursaService;
    }
    @GetMapping("/curse/{id}")
    Cursa getCursaById(@PathVariable String id) {
        return cursaService.getCursaById(id);
    }
    @PostMapping("/curse")
    Cursa createCursa(@RequestBody CreateCursaRequest request) {
        return cursaService.createCursa(request);
    }
}
