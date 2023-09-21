package com.example.demo.domain;

public class Card {
    private String numeDetinator;
    private String numarCard;
    private String idCard;

    public Card() {
    }

    public Card(String numeDetinator, String numarCard, String idCard) {
        this.numeDetinator = numeDetinator;
        this.numarCard = numarCard;
        this.idCard = idCard;
    }

    public String getNumeDetinator() {
        return numeDetinator;
    }

    public void setNumeDetinator(String numeDetinator) {
        this.numeDetinator = numeDetinator;
    }

    public String getNumarCard() {
        return numarCard;
    }

    public void setNumarCard(String numarCard) {
        this.numarCard = numarCard;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }
}
