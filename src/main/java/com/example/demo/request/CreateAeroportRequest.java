package com.example.demo.request;

public class CreateAeroportRequest {
    private String numeAeroport;

    public CreateAeroportRequest() {
    }

    public CreateAeroportRequest(String numeAeroport) {
        this.numeAeroport = numeAeroport;
    }

    public String getNumeAeroport() {
        return numeAeroport;
    }

    public void setNumeAeroport(String numeAeroport) {
        this.numeAeroport = numeAeroport;
    }
}
