package com.example.demo.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CursaDetails {
    private int nrLocuriDisponibile;
    private float pret;
    private String idCursa;
    List<String> idCalatori = new ArrayList<>();

    public CursaDetails(int nrLocuriDisponibile, float pret, String idCursa) {
        this.nrLocuriDisponibile = nrLocuriDisponibile;
        this.pret = pret;
        this.idCursa = idCursa;
    }

    public List<String> getCalatori() {
        return idCalatori;
    }

    public void setIdCalatori(List<String> idCalatori) {
        this.idCalatori = idCalatori;
    }

    public String getIdCursa() {
        return idCursa;
    }

    public void setIdCursa(String idCursa) {
        this.idCursa = idCursa;
    }

    public int getNrLocuriDisponibile() {
        return nrLocuriDisponibile;
    }

    public void setNrLocuriDisponibile(int nrLocuriDisponibile) {
        this.nrLocuriDisponibile = nrLocuriDisponibile;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }
}
