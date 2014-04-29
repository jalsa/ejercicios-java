package com.jon.app;

import java.util.Scanner;
import java.util.Vector;

import com.jon.clases.JuegoAdivinaImpar;
import com.jon.clases.JuegoAdivinaNumero;
import com.jon.clases.JuegoAdivinaPar;
import com.jon.excepciones.JuegoException;
import com.jon.factories.FactoriaJuegos;
import com.jon.interfaces.Jugable;

public class Application {

	static JuegoAdivinaNumero juegoA;
	static JuegoAdivinaPar juegoP;
	static JuegoAdivinaImpar juegoI;
	static Vector<Jugable> juegos;
	static String scan;
	static int numero;
	static int primero = 1;
	boolean repetir = true;
	static Scanner entrada;
	static int contador = 0;
	static int respuesta;
	static Jugable j;
	
	public static void main(String[] args) {
		inicializar();
	}
	
	public static void inicializar() {
		j = null;
		while (j == null) {
			try {
				j = elijeJuego();
			} catch (JuegoException e) {
				System.out.println(e.getMessage());
			}
		}
		continuar(j);
	}
	
	protected static void validateException(int num) throws JuegoException {
		if (num != 0 && num != 1 && num != 2) {
			throw new JuegoException("Nœmero no v‡lido: debe de ser entre 0 y 2");
		}
	}
	
	public static void infoVector(Vector<Jugable> v) {
		for (int i=0; i<v.size(); i++) {
			if (v.get(i) != null) {
				contador++;
			}
		}
		System.out.println("Capacidad del vector: " + v.size() + " y tamaño: " + contador);
		contador = 0;
	}
	
	public static Jugable elijeJuego() throws JuegoException {
		if (primero == 1) {
			juegos = new Vector<Jugable>(3);
			infoVector(juegos);
			juegoA = FactoriaJuegos.getJuegoAdivinaNumero();
			juegoP = FactoriaJuegos.getJuegoAdivinaPar();
			juegoI = FactoriaJuegos.getJuegoAdivinaImpar();
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
	
	public static void continuar(Jugable j) {
		j.muestraNombre();
		j.muestraInfo();
		j.juega();
		System.out.println("ÀDesea jugar de nuevo?\n0: S’\n1: No");
		entrada = new Scanner(System.in);
		respuesta = entrada.nextInt();
		if (respuesta == 0) {
			inicializar();
		}
	}
	
}
