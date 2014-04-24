package com.jon.validadores;

import com.jon.interfaces.IValidador;

public class Buzz extends Generico{
	public Buzz() {
		super("Buzz");
		// TODO Auto-generated constructor stub
	}

	private final String valor = "Buzz";
	
	public boolean validar(int num) {
		return (num % 5 == 0);
	}
	
}
