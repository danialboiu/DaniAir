package com.example.demo.request;

public class CreateMesajRequest {
    private String continutMesaj;
    private String idCursa;

    public CreateMesajRequest() {
    }

    public CreateMesajRequest(String continutMesaj, String idCursa) {
        this.idCursa = idCursa;
        this.continutMesaj = continutMesaj;
    }

    public String getIdCursa() {
        return idCursa;
    }

    public void setIdCursa(String idCursa) {
        this.idCursa = idCursa;
    }

    public String getContinutMesaj() {
        return continutMesaj;
    }

    public void setContinutMesaj(String continutMesaj) {
        this.continutMesaj = continutMesaj;
    }
}
