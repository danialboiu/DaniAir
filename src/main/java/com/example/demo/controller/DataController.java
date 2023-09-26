package com.example.demo.controller;

import com.example.demo.domain.Cursa;
import com.example.demo.domain.CursaDetails;
import com.example.demo.request.*;
import com.example.demo.service.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class DataController {
    CursaService cursaService;
    UserService userService;
    AeroportService aeroportService;
    AvionService avionService;
    CardService cardService;
    CursaDetailsService cursaDetailsService;
    MesajService mesajService;
    OrderService orderService;
    PlataService plataService;

    public DataController(CursaService cursaService, UserService userService, AeroportService aeroportService, AvionService avionService, CardService cardService, CursaDetailsService cursaDetailsService, MesajService mesajService, OrderService orderService, PlataService plataService) {
        this.cursaService = cursaService;
        this.userService = userService;
        this.aeroportService = aeroportService;
        this.avionService = avionService;
        this.cardService = cardService;
        this.cursaDetailsService = cursaDetailsService;
        this.mesajService = mesajService;
        this.orderService = orderService;
        this.plataService = plataService;
    }

    @PostMapping("/test-data")
    void createTestData() {
         CreateAvionRequest requestAvion = new CreateAvionRequest("Airbus", 1500, 200);
         String idAvion = avionService.createAvion(requestAvion).getIdAvion();
         CreateAeroportRequest requestAeroport = new CreateAeroportRequest("Cj");
         String idAeroport = aeroportService.createAeroport(requestAeroport).getIdAeroport();
         CreateAeroportRequest requestAeroport2 = new CreateAeroportRequest("Cj");
         String idAeroport2 = aeroportService.createAeroport(requestAeroport2).getIdAeroport();
         CreateCursaRequest requestCursa = new CreateCursaRequest("15:00", 2, idAeroport, idAeroport2, idAvion, "in time");
         String idCursa = cursaService.createCursa(requestCursa).getIdCursa();
         CreateUserRequest requestUser = new CreateUserRequest("Alboiu","Dani",22);
         String idUser = userService.createUser(requestUser).getIdUser();
         CreateCursaDetailsRequest requestCursaDetails = new CreateCursaDetailsRequest(180, 200, idCursa);
         cursaDetailsService.createCursaDetails(requestCursaDetails);
         CreateOrderRequest requestOrder = new CreateOrderRequest(idCursa, idUser, "15.02");
         String idOrder = orderService.createOrder(requestOrder).getIdOrder();
         CreatePlataRequest requestPlata = new CreatePlataRequest(idCursa);
         plataService.createPlata(requestPlata);
         CreateMesajRequest requestMesaj = new CreateMesajRequest("mesaj", idCursa);
         mesajService.createMesaj(requestMesaj);
         CreateCardRequest cardRequest = new CreateCardRequest("Dani", "1500");
         String idCard = cardService.createCard(cardRequest).getIdCard();
    }
}
