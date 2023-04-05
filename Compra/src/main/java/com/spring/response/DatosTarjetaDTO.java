package com.spring.response;

import java.io.Serializable;
import java.util.Arrays;

import com.spring.model.DatosTarjeta;

public class DatosTarjetaDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String timestamp;
	private String status;
	private String error;
	private String[] message;
	private DatosTarjeta info;
	private String infoadicional;
	
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	
	public DatosTarjeta getInfo() {
		return info;
	}
	public void setInfo(DatosTarjeta info) {
		this.info = info;
	}
	public String getInfoadicional() {
		return infoadicional;
	}
	public void setInfoadicional(String infoadicional) {
		this.infoadicional = infoadicional;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public String[] getMessage() {
		return message;
	}
	public void setMessage(String[] message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "DatosTarjetaDTO [timestamp=" + timestamp + ", status=" + status + ", error=" + error + ", message="
				+ Arrays.toString(message) + ", info=" + info + ", infoadicional=" + infoadicional + "]";
	}
	public DatosTarjetaDTO() {
		super();
	}
	
	
}
