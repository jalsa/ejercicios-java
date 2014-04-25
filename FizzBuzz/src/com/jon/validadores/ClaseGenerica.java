package com.jon.validadores;

import com.jon.excepciones.Excepcion;
import com.jon.interfaces.InterfazValidador;

public abstract class ClaseGenerica implements InterfazValidador {
	
	protected String valor;
	
	public abstract boolean validar(int num) throws Excepcion;
	
	protected void validateException(int num) throws Excepcion {
		if (num < 1) {
			throw new Excepcion("Nœmero no v‡lido: es menor que 1");
		}
	}
	
	public String valor() {
		return valor;
	}
	
	public void setValor(String s) {
		valor = s;
	}
	
}
