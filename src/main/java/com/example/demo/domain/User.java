package com.example.demo.domain;

public class User {
    private String nume;
    private String prenume;
    private int varsta;
    private String idUser;

    public User() {
    }

    public User(String nume, String prenume, int varsta, String idUser) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.idUser = idUser;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }
}
