package com.jon.clases;

public abstract class Juego {
	
	private int vidas;
	private int resetVidas;
	private static int record = 0;
	
	public Juego(int vidas) {
		this.vidas = vidas;
		this.resetVidas = vidas;
	}
	
	public void muestraVidasRestantes() {
		System.out.println(this.vidas);
	}
	
	public int obtenerVidasRestantes() {
		return this.vidas;
	}
	
	public boolean quitaVida() {
		this.vidas--;
		if (this.vidas > 0) {
			return true;
		}
		else {
			System.out.println("Juego Terminado");
			return false;
		}
	}
	
	public void reiniciaPartida() {
		this.vidas = this.resetVidas;
	}
	
	public void actualizaRecord() {
		if (this.vidas == Juego.record) {
			System.out.println("Has conseguido el récord!");
		}
		else if (this.vidas > Juego.record) {
			Juego.record = this.vidas;
			System.out.println("Has batido el récord! Nuevo récord: " + Juego.record);
		}
	}
	
}
