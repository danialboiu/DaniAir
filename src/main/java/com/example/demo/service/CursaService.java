package com.example.demo.service;

import com.example.demo.domain.Cursa;
import com.example.demo.request.CreateCursaRequest;

import java.util.List;

public interface CursaService {
    Cursa createCursa(CreateCursaRequest request);
    Cursa getCursaById(String id);
    List<Cursa> getCurse();
}
