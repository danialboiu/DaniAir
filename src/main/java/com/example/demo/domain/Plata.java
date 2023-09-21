package com.example.demo.domain;

public class Plata {
    private String status;
    private String idPlata;
    private double suma;
    private String idCursa;

    public Plata() {
    }

    public Plata(String status, String idPlata, double suma, String idCursa) {
        this.status = status;
        this.idPlata = idPlata;
        this.suma = suma;
        this.idCursa = idCursa;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIdPlata() {
        return idPlata;
    }

    public void setIdPlata(String idPlata) {
        this.idPlata = idPlata;
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public String getIdCursa() {
        return idCursa;
    }

    public void setIdCursa(String idCursa) {
        this.idCursa = idCursa;
    }
}
