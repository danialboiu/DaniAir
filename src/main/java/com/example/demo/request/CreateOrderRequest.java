package com.example.demo.request;

public class CreateOrderRequest {
    private String idCursa;
    private String idUser;
    private String dataAchizitiei;

    public CreateOrderRequest() {
    }

    public CreateOrderRequest(String idCursa, String idUser, String dataAchizitiei) {
        this.idCursa = idCursa;
        this.idUser = idUser;
        this.dataAchizitiei = dataAchizitiei;
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


    public String getDataAchizitiei() {
        return dataAchizitiei;
    }

    public void setDataAchizitiei(String dataAchizitiei) {
        this.dataAchizitiei = dataAchizitiei;
    }
}
