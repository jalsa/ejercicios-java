package com.jon.validadores;

import com.jon.interfaces.InterfazValidador;

public class Mozz extends ClaseGenerica implements InterfazValidador {
	
	public boolean validar(int num) {
		return (num % 7 == 0);
	}

}
