package com.example.demo.controller;

import com.example.demo.domain.Cursa;
import com.example.demo.domain.CursaDetails;
import com.example.demo.request.CreateCursaDetailsRequest;
import com.example.demo.request.CreateCursaRequest;
import com.example.demo.service.CursaDetailsService;
import com.example.demo.service.CursaService;
import org.springframework.web.bind.annotation.*;

@RestController
public class CursaDetailsController {
    CursaDetailsService cursaDetailsService;
    public CursaDetailsController(CursaDetailsService cursaDetailsService) {
        this.cursaDetailsService = cursaDetailsService;
    }
    @PostMapping("/curse-details")
    CursaDetails createCursaDetails(@RequestBody CreateCursaDetailsRequest request) {
        return cursaDetailsService.createCursaDetails(request);
    }
}
