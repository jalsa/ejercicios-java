package com.jon.clases;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero {

	private int numeroSecreto;
	private int tamano;
	
	public JuegoAdivinaImpar(int vidas) {
		super(vidas);
	}
	
	public void reiniciaPartida() {
		super.reiniciaPartida();
		this.numeroSecreto = super.getNumeroSecreto();
		this.tamano = super.getTamano();
		if (this.numeroSecreto % 2 == 0) {
			if (this.numeroSecreto == this.tamano) {
				this.numeroSecreto = 1;
			}
			else {
				this.numeroSecreto++;
			}
		}
		super.setNumeroSecreto(this.numeroSecreto);
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
	
	@Override
	public void muestraNombre() {
		System.out.println("Adivina un nœmero impar");
	}

	@Override
	public void muestraInfo() {
		System.out.println("El juego consiste en adivinar un nœmero impar del 0 al 10. Para ello, tienes 3 intentos");
	}

}
