package com.example.demo.domain;

import java.util.List;

public class Mesaj {
    private String idMesaj;
    private String continutMesaj;
    private List<String> idUseri;

    public Mesaj() {
    }

    public Mesaj(String idMesaj, String continutMesaj, List<String> idUseri) {
        this.idMesaj = idMesaj;
        this.continutMesaj = continutMesaj;
        this.idUseri = idUseri;
    }

    public String getIdMesaj() {
        return idMesaj;
    }

    public void setIdMesaj(String idMesaj) {
        this.idMesaj = idMesaj;
    }

    public String getContinutMesaj() {
        return continutMesaj;
    }

    public void setContinutMesaj(String continutMesaj) {
        this.continutMesaj = continutMesaj;
    }

    public List<String> getIdUseri() {
        return idUseri;
    }

    public void setIdUseri(List<String> idUseri) {
        this.idUseri = idUseri;
    }
}
