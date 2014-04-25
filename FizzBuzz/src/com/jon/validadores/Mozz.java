package com.jon.validadores;

import com.jon.interfaces.InterfazValidador;

public class Mozz implements InterfazValidador {

	private final String valor = "Mozz";

	public boolean validar(int num) {
		return (num % 7 == 0);
	}

	public String valor() {
		return valor;
	}

}