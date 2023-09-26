package com.example.demo.domain;

public class Cursa {
    private String oraPlecare;
    private int durataInOre;
    private String idAeroportPlecare;
    private String idAeroportDestinatie;
    private String idCursa;
    private String idAvion;
    private String status;

    public Cursa() {
    }

    public Cursa(String oraPlecare, int durataInOre, String idAeroportPlecare, String idAeroportDestinatie, String idCursa, String idAvion, String status) {
        this.oraPlecare = oraPlecare;
        this.durataInOre = durataInOre;
        this.idAeroportPlecare = idAeroportPlecare;
        this.idAeroportDestinatie = idAeroportDestinatie;
        this.idCursa = idCursa;
        this.idAvion = idAvion;
        this.status = status;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOraPlecare() {
        return oraPlecare;
    }

    public void setOraPlecare(String oraPlecare) {
        this.oraPlecare = oraPlecare;
    }

    public int getDurataInOre() {
        return durataInOre;
    }

    public void setDurataInOre(int durataInOre) {
        this.durataInOre = durataInOre;
    }

    public String getIdAeroportPlecare() {
        return idAeroportPlecare;
    }

    public void setIdAeroportPlecare(String idAeroportPlecare) {
        this.idAeroportPlecare = idAeroportPlecare;
    }

    public String getIdAeroportDestinatie() {
        return idAeroportDestinatie;
    }

    public void setIdAeroportDestinatie(String idAeroportDestinatie) {
        this.idAeroportDestinatie = idAeroportDestinatie;
    }

    public String getIdCursa() {
        return idCursa;
    }

    public void setIdCursa(String idCursa) {
        this.idCursa = idCursa;
    }

    public String getIdAvion() {
        return idAvion;
    }

    public void setIdAvion(String idAvion) {
        this.idAvion = idAvion;
    }
}
