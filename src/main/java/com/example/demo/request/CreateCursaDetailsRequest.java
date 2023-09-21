package com.example.demo.request;

public class CreateCursaDetailsRequest {
    private int nrLocuriDisponibile;
    private float pret;
    private String idCursa;

    public CreateCursaDetailsRequest(int nrLocuriDisponibile, float pret, String idCursa) {
        this.nrLocuriDisponibile = nrLocuriDisponibile;
        this.pret = pret;
        this.idCursa = idCursa;
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
