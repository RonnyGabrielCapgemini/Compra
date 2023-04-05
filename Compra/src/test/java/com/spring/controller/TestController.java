package com.spring.controller;


import com.spring.model.DatosTarjeta;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value="/controllerDatos", method = RequestMethod.GET)
    public DatosTarjeta datosControl(){

        DatosTarjeta dtc = new DatosTarjeta();
        dtc.setNombreTitular("Ronny");
        dtc.setNumeroTarjeta("1235674");
        dtc.setEmisor("BancoTest");
        dtc.setCantidad("35$");
        dtc.setMesCaducidad("Marzo");
        dtc.setCvv("cvv");
        dtc.setYearCaducidad("2090");

        return dtc;

    }

}
