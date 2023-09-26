package com.example.demo.service;

import com.example.demo.domain.Card;
import com.example.demo.exceptions.AvionIdNotFoundException;
import com.example.demo.exceptions.CardIdNotFoundException;
import com.example.demo.request.CreateCardRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Service
public class CardServiceImplementation implements CardService{
    List<Card> carduri = new ArrayList<>();
    @Override
    public Card createCard(CreateCardRequest request) {
        String idCard = UUID.randomUUID().toString();
        Card card = new Card(request.getNumeDetinator(), request.getNumarCard(), idCard);
        carduri.add(card);
        return card;
    }

    @Override
    public Card getCardById(String id) {
        var cardCurent = carduri.stream().filter(card -> card.getIdCard().equals(id)).findFirst();
        if(cardCurent.isPresent()) {
            return cardCurent.get();
        } else {
            throw new CardIdNotFoundException();
        }
    }

    @Override
    public List<Card> getCarduri() {
        return carduri;
    }
}
