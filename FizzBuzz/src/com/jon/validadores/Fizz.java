package com.jon.validadores;

import com.jon.excepciones.Excepcion;
import com.jon.interfaces.InterfazValidador;

public class Fizz extends ClaseGenerica implements InterfazValidador {

	public boolean validar(int num) throws Excepcion {
		this.validateException(num);
		return (num % 3 == 0);
	}
	
}
