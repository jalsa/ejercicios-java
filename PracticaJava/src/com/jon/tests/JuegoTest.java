package com.jon.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

import org.junit.Before;
import org.junit.Test;

import com.jon.clases.Juego;
import com.jon.clases.JuegoAdivinaImpar;
import com.jon.clases.JuegoAdivinaNumero;
import com.jon.clases.JuegoAdivinaPar;
import com.jon.excepciones.JuegoException;
import com.jon.interfaces.Jugable;

public class JuegoTest {

	Juego juego, juego1;
	static JuegoAdivinaNumero juegoA;
	static JuegoAdivinaPar juegoP;
	static JuegoAdivinaImpar juegoI;
	static Vector<Jugable> juegos;
	Jugable j;
	static int numero;
	static int primero = 1;
	int respuesta;
	static boolean repetir = true;
	static Scanner entrada;
	static int contador = 0;
	
	@Before
	public void setUp() {
		try {
			j = elijeJuego();
		} catch (JuegoException e) {
			System.out.println(e.getMessage());
		}
	}
	
	protected static void validateException(int num) throws JuegoException {
		if (num != 0 && num != 1 && num != 2) {
			throw new JuegoException("Nœmero no v‡lido: debe de ser entre 0 y 2");
		}
	}
	
	public static Jugable elijeJuego() throws JuegoException {
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
		numero = entrada.nextInt();
		while (numero != 0 && numero != 1 && numero != 2) {
			validateException(numero);
			entrada = new Scanner(System.in);
			numero = entrada.nextInt();
		}
		return juegos.get(numero);
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
	
	@Test
	public void test() {
		/*assertEquals("Juego 1", 5, juego.obtenerVidasRestantes());
		assertEquals("Juego 1", true, juego.quitaVida());
		assertEquals("Juego 1", 4, juego.obtenerVidasRestantes());
		assertEquals("Juego 2", 5, juego1.obtenerVidasRestantes());
		assertEquals("Juego 1", 4, juego.obtenerVidasRestantes());
		juego.reiniciaPartida();
		assertEquals("Juego 1", 5, juego.obtenerVidasRestantes());
		juego.actualizaRecord();
		juego1.actualizaRecord();*/
		j.muestraNombre();
		j.muestraInfo();
		j.juega();
		System.out.println("ÀDesea jugar de nuevo?\n0: S’\n1: No");
		entrada = new Scanner(System.in);
		respuesta = entrada.nextInt();
		if (respuesta == 0) {
			setUp();
			test();
		}
	}

}
