package com.jon.factories;

import com.jon.clases.JuegoAdivinaImpar;
import com.jon.clases.JuegoAdivinaNumero;
import com.jon.clases.JuegoAdivinaPar;

public abstract class FactoriaJuegos {
	
	public static final JuegoAdivinaNumero getJuegoAdivinaNumero() {
		JuegoAdivinaNumero jAN = new JuegoAdivinaNumero(3);
		return jAN;
	}
	
	public static final JuegoAdivinaPar getJuegoAdivinaPar() {
		JuegoAdivinaPar jANP = new JuegoAdivinaPar(3);
		return jANP;
	}
	
	public static final JuegoAdivinaImpar getJuegoAdivinaImpar() {
		JuegoAdivinaImpar jANI = new JuegoAdivinaImpar(3);
		return jANI;
	}
	
}
