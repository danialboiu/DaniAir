package com.example.demo.request;

public class CreateCursaRequest {
    private String oraPlecare;
    private int durataInOre;
    private String idAeroportPlecare;
    private String idAeroportDestinatie;
    private String idAvion;

    public CreateCursaRequest() {
    }

    public CreateCursaRequest(String oraPlecare, int durataInOre, String idAeroportPlecare, String idAeroportDestinatie, String idAvion) {
        this.oraPlecare = oraPlecare;
        this.durataInOre = durataInOre;
        this.idAeroportPlecare = idAeroportPlecare;
        this.idAeroportDestinatie = idAeroportDestinatie;
        this.idAvion = idAvion;
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

    public String getIdAvion() {
        return idAvion;
    }

    public void setIdAvion(String idAvion) {
        this.idAvion = idAvion;
    }
}
