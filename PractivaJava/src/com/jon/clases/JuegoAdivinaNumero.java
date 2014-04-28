package com.jon.clases;

import java.util.Scanner;

import com.jon.interfaces.InterfazJuego;

public class JuegoAdivinaNumero extends Juego implements InterfazJuego {

	private int numeroSecreto;
	
	public JuegoAdivinaNumero(int vidas, int numero) {
		super(vidas);
		this.numeroSecreto = numero;
	}
	
	@Override
	public void juega() {
		int numero;
		boolean resultado;
		boolean busqueda = true;
		String cadena;
		reiniciaPartida();
		System.out.println("Adivina un nœmero entre el 0 y el 10");
		while (busqueda) {
			Scanner entrada = new Scanner(System.in);
			numero = entrada.nextInt();
			if (validaNumero(numero)) {
				if (numero == this.numeroSecreto) {
					busqueda = false;
					System.out.println("Acertaste!");
					actualizaRecord();
				}
				else {
					resultado = quitaVida();
					if (resultado == true) {
						if (numero < this.numeroSecreto) {
							cadena = "mayor";
						}
						else {
							cadena = "menor";
						}
						System.out.println("El nœmero a adivinar es " + cadena + ", intŽntalo de nuevo!");
					}
					else {
						busqueda = false;
					}
				}
			}
			else {
				resultado = quitaVida();
				if (!resultado) {
					busqueda = false;
				}
			}
		}
	}

	public boolean validaNumero(int numero) {
		return true;
	}
	
}
