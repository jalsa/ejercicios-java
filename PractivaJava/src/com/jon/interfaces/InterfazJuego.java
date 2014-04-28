package com.jon.interfaces;

public interface InterfazJuego {
	
	public void muestraVidasRestantes();
	
	public int obtenerVidasRestantes();
	
	public boolean quitaVida();
	
	public void reiniciaPartida();
	
	public void actualizaRecord();
	
	public abstract void juega();
	
	public void muestraNombre();
	
	public void muestraInfo();
	
}
