package com.spring.service;

import com.spring.model.DatosTarjeta;
import com.spring.response.DatosTarjetaDTO;

public interface DatosTarjetaService {
	
	
	public DatosTarjetaDTO pasar(DatosTarjeta datos);
	public String errores(DatosTarjetaDTO datosTarjetaDTO);
}
