package com.jon.validadores;

import com.jon.excepciones.Excepcion;
import com.jon.interfaces.InterfazValidador;

public class Buzz extends ClaseGenerica implements InterfazValidador {

	public boolean validar(int num) throws Excepcion {
		this.validateException(num);
		return (num % 5 == 0);
	}

}
