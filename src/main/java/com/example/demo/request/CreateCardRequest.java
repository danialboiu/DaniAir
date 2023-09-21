package com.example.demo.request;

public class CreateCardRequest {
    private String numeDetinator;
    private String numarCard;

    public CreateCardRequest() {
    }

    public CreateCardRequest(String numeDetinator, String numarCard) {
        this.numarCard = numarCard;
        this.numeDetinator = numeDetinator;
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
}
