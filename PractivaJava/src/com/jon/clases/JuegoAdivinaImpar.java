package com.jon.clases;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero {

	public JuegoAdivinaImpar(int vidas, int numero) {
		super(vidas, numero);
	}
	
	public boolean validaNumero(int numero) {
		if (numero % 2 != 0) {
			return true;
		}
		else {
			System.out.println("El nœmero introducido no es impar");
			return false;			
		}

	}

}
