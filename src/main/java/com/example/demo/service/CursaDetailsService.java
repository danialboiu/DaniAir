package com.example.demo.service;

import com.example.demo.domain.CursaDetails;
import com.example.demo.domain.User;
import com.example.demo.request.CreateCursaDetailsRequest;

import java.util.List;

public interface CursaDetailsService {
    CursaDetails createCursaDetails(CreateCursaDetailsRequest request);
    float getPretCursa(String idCursa);
    List<String> getUsersByIdCursa(String idCursa);
    CursaDetails getCursaDetails(String idCursa);
    List<String> addCalator(String idCursa, String idCalator);
}
