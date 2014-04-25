package com.jon.validadores;

import com.jon.interfaces.InterfazValidador;

public abstract class ClaseGenerica implements InterfazValidador {
	
	protected String valor;
	
	public abstract boolean validar(int num);
	
	public String valor() {
		return valor;
	}
	
	public void setValor(String s) {
		valor = s;
	}
	
}
