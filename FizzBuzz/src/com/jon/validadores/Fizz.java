package com.jon.validadores;

import com.jon.interfaces.IValidador;

public class Fizz extends Generico{
	public Fizz() {
		super("Fizz");
		// TODO Auto-generated constructor stub
	}

	private final String valor = "Fizz";
	
	public boolean validar(int num) {
		return (num % 3 == 0);
	}
	

}
