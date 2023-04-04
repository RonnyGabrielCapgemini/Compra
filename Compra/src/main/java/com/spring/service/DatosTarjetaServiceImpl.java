package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.model.DatosTarjeta;
import com.spring.repository.DatosTarjetaRepository;

@Service
public class DatosTarjetaServiceImpl implements DatosTarjetaService {
	
	@Autowired
	DatosTarjetaRepository datos;
	
	@Override
	public DatosTarjeta pasar(DatosTarjeta datosTarjeta) {
		DatosTarjeta datosTarjetaNew = datos.pasar(datosTarjeta);
		return datosTarjetaNew;
	}
	
	
	

}
