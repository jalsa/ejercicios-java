package com.jon.validadores;

import com.jon.interfaces.InterfazValidador;

public class Buzz implements InterfazValidador {

	private final String valor = "Buzz";

	public boolean validar(int num) {
		return (num % 5 == 0);
	}

	public String valor() {
		return valor;
	}

}
