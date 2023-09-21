package com.example.demo.request;

public class CreatePlataRequest {
    private String idCursa;
    public CreatePlataRequest(String idCursa) {
        this.idCursa = idCursa;
    }

    public CreatePlataRequest() {
    }

    public String getIdCursa() {
        return idCursa;
    }

    public void setIdCursa(String idCursa) {
        this.idCursa = idCursa;
    }
}
