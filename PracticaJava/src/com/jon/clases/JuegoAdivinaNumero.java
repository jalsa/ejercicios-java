package com.jon.clases;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import com.jon.interfaces.Jugable;

public class JuegoAdivinaNumero extends Juego implements Jugable {

	Date data = new Date();
	Random random = new Random(data.getTime());
	private int numeroSecreto;
	private final int tamano = 10;
	
	public JuegoAdivinaNumero(int vidas) {
		super(vidas);
		this.numeroSecreto = (int) (random.nextInt(this.tamano+1));
	}
	
	public void reiniciaPartida() {
		super.reiniciaPartida();
		this.numeroSecreto = (int) (random.nextInt(this.tamano+1));;
	}
	
	@Override
	public void juega() {
		int numero;
		boolean resultado;
		boolean busqueda = true;
		String cadena;
		Scanner entrada;
		reiniciaPartida();
		System.out.println("Adivina un nœmero entre el 0 y el 10");
		while (busqueda) {
			entrada = new Scanner(System.in);
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

	@Override
	public void muestraNombre() {
		System.out.println("Adivina un nœmero");
	}

	@Override
	public void muestraInfo() {
		System.out.println("El juego consiste en adivinar un nœmero del 0 al 10. Para ello, tienes 3 intentos");
	}
	
	public void setNumeroSecreto(int numero) {
		this.numeroSecreto = numero;
	}
	
	public int getNumeroSecreto() {
		return this.numeroSecreto;
	}
	
	public int getTamano() {
		return this.tamano;
	}
	
}
