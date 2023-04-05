package com.spring.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.spring.model.DatosTarjeta;
import com.spring.service.DatosTarjetaService;

import io.swagger.v3.oas.annotations.Operation;

import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;


@RestController
@Validated
@RequestMapping("/datos")
@Tag(name ="datos tarjeta", description = "Datos tarjeta API")
public class DatosTarjetaController {
	
	private static final Logger logger = LoggerFactory.getLogger(DatosTarjetaController.class);

	@Autowired
	private DatosTarjetaService serv;
	
	@Operation(summary = "", description = "", tags= {"datosTarjeta"})
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Transacción correta", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = DatosTarjeta.class)) }),
			@ApiResponse(responseCode = "400", description = "No hay fondos suficientes en la cuenta ", content = @Content),
			@ApiResponse(responseCode = "400", description = "No se encuentran los datos del cliente", content = @Content),
			@ApiResponse(responseCode = "500", description = "El sistema se encuentra inestable", content = @Content)})
	
	@PostMapping("/user")
	public ResponseEntity<DatosTarjeta> pasar(@RequestBody DatosTarjeta datosTarjeta ) {
		
		DatosTarjeta DatosTarjetaNew = serv.pasar(datosTarjeta);
		return ResponseEntity.ok(DatosTarjetaNew);
		
	}
}