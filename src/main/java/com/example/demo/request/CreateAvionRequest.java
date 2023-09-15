package com.example.demo.request;

public class CreateAvionRequest {
    private String tipAvion;
    private int kmAutonomie;
    private int capacitatePasageri;

    public CreateAvionRequest() {
    }

    public CreateAvionRequest(String tipAvion, int kmAutonomie, int capacitatePasageri) {
        this.tipAvion = tipAvion;
        this.kmAutonomie = kmAutonomie;
        this.capacitatePasageri = capacitatePasageri;
    }

    public String getTipAvion() {
        return tipAvion;
    }

    public void setTipAvion(String tipAvion) {
        this.tipAvion = tipAvion;
    }

    public int getKmAutonomie() {
        return kmAutonomie;
    }

    public void setKmAutonomie(int kmAutonomie) {
        this.kmAutonomie = kmAutonomie;
    }

    public int getCapacitatePasageri() {
        return capacitatePasageri;
    }

    public void setCapacitatePasageri(int capacitatePasageri) {
        this.capacitatePasageri = capacitatePasageri;
    }
}
