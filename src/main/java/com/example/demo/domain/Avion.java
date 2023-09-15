package com.example.demo.domain;

public class Avion {
    private String tipAvion;
    private int kmAutonomie;
    private int capacitatePasageri;
    private String idAvion;

    public Avion() {
    }

    public Avion(String tipAvion, int kmAutonomie, int capacitatePasageri, String idAvion) {
        this.tipAvion = tipAvion;
        this.kmAutonomie = kmAutonomie;
        this.capacitatePasageri = capacitatePasageri;
        this.idAvion = idAvion;
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

    public String getIdAvion() {
        return idAvion;
    }

    public void setIdAvion(String idAvion) {
        this.idAvion = idAvion;
    }
}
