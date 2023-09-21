package com.example.demo.service;

import com.example.demo.domain.Card;
import com.example.demo.request.CreateCardRequest;

public interface CardService {
    Card createCard(CreateCardRequest request);
    Card getCardById(String idCard);
}
