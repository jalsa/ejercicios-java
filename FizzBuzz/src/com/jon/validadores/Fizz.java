package com.jon.validadores;

import com.jon.interfaces.InterfazValidador;

public class Fizz implements InterfazValidador {

	private final String valor = "Fizz";

	public boolean validar(int num) {
		return (num % 3 == 0);
	}
	
	public String valor() {
		return valor;
	}
	
}
