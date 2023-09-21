package com.example.demo.controller;

import com.example.demo.domain.Aeroport;
import com.example.demo.domain.Card;
import com.example.demo.request.CreateAeroportRequest;
import com.example.demo.request.CreateCardRequest;
import com.example.demo.service.AeroportService;
import com.example.demo.service.CardService;
import org.springframework.web.bind.annotation.*;

@RestController
public class CardController {
    CardService cardService;
    public CardController(CardService cardService) {
        this.cardService = cardService;
    }
    @GetMapping("/carduri/{id}")
    Card getCardById(@PathVariable String id) {
        return cardService.getCardById(id);
    }
    @PostMapping("/carduri")
    Card createCard(@RequestBody CreateCardRequest request) {
        return cardService.createCard(request);
    }
}
