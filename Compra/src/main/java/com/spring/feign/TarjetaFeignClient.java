package com.spring.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.spring.model.DatosTarjeta;
import com.spring.response.DatosTarjetaDTO;



@FeignClient(name = "pasarela", url= "http://proyectorestbanco-env.eba-2xzwedvv.eu-west-3.elasticbeanstalk.com/")
public interface TarjetaFeignClient {
	
    @PostMapping("/pasarela/compra")
    public DatosTarjetaDTO pasar(@RequestBody DatosTarjeta datosTarjeta);

}
