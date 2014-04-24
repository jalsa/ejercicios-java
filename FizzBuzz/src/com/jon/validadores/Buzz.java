package com.jon.validadores;

public class Buzz {
	private final String valor = "Buzz";
	
	public boolean validar(int num) {
		return (num % 5 == 0);
	}
	
	public String valor() {
		return valor;
	}
}
