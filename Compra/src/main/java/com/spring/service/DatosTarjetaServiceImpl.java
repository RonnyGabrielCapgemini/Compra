package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.feign.TarjetaFeignClient;
import com.spring.model.DatosTarjeta;
import com.spring.response.DatosTarjetaDTO;

@Service
public class DatosTarjetaServiceImpl implements DatosTarjetaService {
	
	
	@Autowired
	private TarjetaFeignClient tarjetaFeing;
	

	@Override
	public DatosTarjetaDTO pasar(DatosTarjeta datostarj) {
		return tarjetaFeing.pasar(datostarj);
	}
	public String errores(DatosTarjetaDTO datosTarjetaDTO) {
		String respuesta="";
		switch(datosTarjetaDTO.getStatus()) {
		case "200.0001":
			respuesta="Transaccion correcta";
			break;
		case "400.0001":
			respuesta="No hay fondos suficientes en la cuenta";
			break;
		case "400.0002":
			respuesta="No se encuentran los datos del cliente";
			break;
		case "400.0003":
			respuesta="El número de la tarjeta no es válido";
			break;
		case "400.0004":
			respuesta="El formato del cvv no es válido";
			break;
		case "400.0005":
			respuesta="El mes (caducidad) no es correcto";
			break;
		case "400.0006":
			respuesta="El año (caducidad) no es correcto";
			break;
		case "400.0007":
			respuesta="La fecha de caducidad debe ser posterior al día actual";
			break;
		case "400.0008":
			respuesta="El formato del nombre no es correcto";
			break;
		case "500.0001":
			respuesta="El sistema se encuentra inestable";
			break;
			
		}
		return respuesta;
	}
	
	
	

}
