package com.jon.interfaces;

import com.jon.excepciones.Excepcion;

public interface InterfazValidador {
	
	public boolean validar(int num) throws Excepcion;
	
	public String valor();
	
	public void setValor(String s);

}