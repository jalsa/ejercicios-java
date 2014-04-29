package com.jon.app;

import java.util.Scanner;
import java.util.Vector;

import com.jon.clases.JuegoAdivinaImpar;
import com.jon.clases.JuegoAdivinaNumero;
import com.jon.clases.JuegoAdivinaPar;
import com.jon.excepciones.JuegoException;
import com.jon.interfaces.Jugable;

public class Application {

	JuegoAdivinaNumero juegoA;
	JuegoAdivinaPar juegoP;
	JuegoAdivinaImpar juegoI;
	Vector<Jugable> juegos;
	String scan;
	int numero;
	int primero = 1;
	boolean repetir = true;
	Scanner entrada;
	int contador = 0;
	
	public static void main(String[] args) {
		
	}
	
	protected void validateException(int num) throws JuegoException {
		if (num != 0 && num != 1 && num != 2) {
			throw new JuegoException("Nœmero no v‡lido: debe de ser entre 0 y 2");
		}
	}
	
	public void infoVector(Vector<Jugable> v) {
		for (int i=0; i<v.size(); i++) {
			if (v.get(i) != null) {
				contador++;
			}
		}
		System.out.println("Capacidad del vector: " + v.size() + " y tamaño: " + contador);
		contador = 0;
	}
	
	public Jugable elijeJuego() throws JuegoException {
		if (primero == 1) {
			juegos = new Vector<Jugable>(3);
			infoVector(juegos);
			juegoA = new JuegoAdivinaNumero(3);
			juegoP = new JuegoAdivinaPar(3);
			juegoI = new JuegoAdivinaImpar(3);
			juegos.add(juegoA);
			juegos.add(juegoP);
			juegos.add(juegoI);
			infoVector(juegos);
			primero = 0;
		}
		System.out.println("Elije uno de estos juegos:\n");
		System.out.println("0: Adivinar un numero\n");
		System.out.println("1: Adivinar un numero par\n");
		System.out.println("2: Adivinar un numero impar\n");
		entrada = new Scanner(System.in);
		scan = entrada.next();
		try {
			numero = Integer.parseInt(scan);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
			numero = 100;
		}
		while (numero != 0 && numero != 1 && numero != 2) {
			validateException(numero);
			entrada = new Scanner(System.in);
			scan = entrada.next();
			numero = Integer.parseInt(scan);
		}
		return juegos.get(numero);
	}
	
}
