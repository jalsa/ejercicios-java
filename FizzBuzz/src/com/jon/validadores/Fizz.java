package com.jon.validadores;

public class Fizz {
	private final String valor = "Fizz";
	
	public boolean validar(int num) {
		return (num % 3 == 0);
	}
	
	public String valor() {
		return valor;
	}
}
