package com.jon.clases;

public class JuegoAdivinaPar extends JuegoAdivinaNumero {

	public JuegoAdivinaPar(int vidas, int numero) {
		super(vidas, numero);
	}
	
	public boolean validaNumero(int numero) {
		if (numero % 2 == 0) {
			return true;
		}
		else {
			System.out.println("El nœmero introducido no es par");
			return false;			
		}

	}

}
