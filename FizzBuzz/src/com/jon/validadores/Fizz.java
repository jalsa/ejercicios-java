package com.jon.validadores;

import com.jon.interfaces.InterfazValidador;

public class Fizz extends ClaseGenerica implements InterfazValidador {

	public boolean validar(int num) {
		return (num % 3 == 0);
	}
	
}
