package com.example.demo.domain;

public class Aeroport {
    private String numeAeroport;
    private String idAeroport;

    public Aeroport() {
    }

    public Aeroport(String numeAeroport, String idAeroport) {
        this.numeAeroport = numeAeroport;
        this.idAeroport = idAeroport;
    }

    public String getNumeAeroport() {
        return numeAeroport;
    }

    public void setNumeAeroport(String numeAeroport) {
        this.numeAeroport = numeAeroport;
    }

    public String getIdAeroport() {
        return idAeroport;
    }

    public void setIdAeroport(String idAeroport) {
        this.idAeroport = idAeroport;
    }
}
