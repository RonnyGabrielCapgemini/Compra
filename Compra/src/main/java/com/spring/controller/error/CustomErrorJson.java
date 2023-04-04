package com.spring.controller.error;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.spring.model.DatosTarjeta;

public class CustomErrorJson {
	
	private String timestamp;
	private int status;
	private String error;
	private List<String> message;
	private DatosTarjeta info;
	private String infoadicional;
	

	public CustomErrorJson(String timestamp, int status, String error, List<String> message, DatosTarjeta info,
			String infoadicional) {
		super();
		this.timestamp = timestamp;
		this.status = status;
		this.error = error;
		this.message = message;
		this.info = info;
		this.infoadicional = infoadicional;
	}

	public CustomErrorJson() {
		super();
		this.timestamp = "";
		this.status = 0;
		this.error = "";
		this.message = new ArrayList<>();
		
	}


	public String getTimestamp() {
		return timestamp;
	}


	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	
	public void setTimestamp(Date timestamp) {
		this.timestamp = this.changeTimeStamp(timestamp);
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	public String getError() {
		return error;
	}


	public void setError(String error) {
		this.error = error;
	}


	public List<String> getMessage() {
		return message;
	}


	public void setMessage(List<String> message) {
		this.message = message;
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


	@Override
	public String toString() {
		return "CustomErrorJson [timestamp=" + timestamp + ", status=" + status + ", error=" + error + ", message="
				+ message + ", info=" + info + ", infoadicional=" + infoadicional + "]";
	}
	
	private String changeTimeStamp(Date d) {
		
		final DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		return dateFormat.format(d);
	}
	
	

}
