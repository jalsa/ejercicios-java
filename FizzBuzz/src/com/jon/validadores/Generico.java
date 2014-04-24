package com.jon.validadores;

import com.jon.interfaces.IValidador;

public abstract class Generico  implements IValidador{
	private String valor;
	
	public Generico (String valor){
		this.valor=valor;
	}
	
	public String valor() {
		return valor;
	}
	
}
