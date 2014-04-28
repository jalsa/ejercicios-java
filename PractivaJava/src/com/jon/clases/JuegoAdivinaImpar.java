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
			System.out.println("El n�mero introducido no es impar");
			return false;			
		}
	}
	
	@Override
	public void muestraNombre() {
		System.out.println("Adivina un n�mero impar");
	}

	@Override
	public void muestraInfo() {
		System.out.println("El juego consiste en adivinar un n�mero impar del 0 al 10. Para ello, tienes 3 intentos");
	}

}
