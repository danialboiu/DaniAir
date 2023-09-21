package com.example.demo.request;

public class CreateMesajRequest {
    private String continutMesaj;

    public CreateMesajRequest() {
    }

    public CreateMesajRequest(String continutMesaj) {
        this.continutMesaj = continutMesaj;
    }

    public String getContinutMesaj() {
        return continutMesaj;
    }

    public void setContinutMesaj(String continutMesaj) {
        this.continutMesaj = continutMesaj;
    }
}
