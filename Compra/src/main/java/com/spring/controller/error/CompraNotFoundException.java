package com.spring.controller.error;

public class CompraNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public CompraNotFoundException() {
		super("Epic Fail: No existe la compra");
	}
	
	
}
