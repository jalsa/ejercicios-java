package com.jon.clases;

public class JuegoAdivinaPar extends JuegoAdivinaNumero {

	private int numeroSecreto;
	
	public JuegoAdivinaPar(int vidas) {
		super(vidas);
	}
	
	public void reiniciaPartida() {
		super.reiniciaPartida();
		this.numeroSecreto = super.getNumeroSecreto();
		if (this.numeroSecreto % 2 != 0) {
			this.numeroSecreto++;
		}
		super.setNumeroSecreto(this.numeroSecreto);
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
	
	@Override
	public void muestraNombre() {
		System.out.println("Adivina un nœmero par");
	}

	@Override
	public void muestraInfo() {
		System.out.println("El juego consiste en adivinar un nœmero par del 0 al 10. Para ello, tienes 3 intentos");
	}
	
}
