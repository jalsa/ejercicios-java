package com.jon.validadores;

import com.jon.interfaces.InterfazValidador;

public class Buzz extends ClaseGenerica implements InterfazValidador {

	public boolean validar(int num) {
		return (num % 5 == 0);
	}

}
