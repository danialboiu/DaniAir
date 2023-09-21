package com.example.demo.domain;

public class Order {
    private String idCursa;
    private String idUser;
    private float pret;
    private String dataAchizitiei;
    private String idOrder;

    public Order() {
    }

    public Order(String idCursa, String idUser, float pret, String dataAchizitiei, String idOrder) {
        this.idCursa = idCursa;
        this.idUser = idUser;
        this.pret = pret;
        this.dataAchizitiei = dataAchizitiei;
        this.idOrder = idOrder;
    }

    public String getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(String idOrder) {
        this.idOrder = idOrder;
    }

    public String getIdCursa() {
        return idCursa;
    }

    public void setIdCursa(String idCursa) {
        this.idCursa = idCursa;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public String getDataAchizitiei() {
        return dataAchizitiei;
    }

    public void setDataAchizitiei(String dataAchizitiei) {
        this.dataAchizitiei = dataAchizitiei;
    }
}
