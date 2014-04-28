package com.jon.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

import com.jon.clases.Juego;
import com.jon.clases.JuegoAdivinaImpar;
import com.jon.clases.JuegoAdivinaNumero;
import com.jon.clases.JuegoAdivinaPar;
import com.jon.interfaces.Jugable;

public class JuegoTest {

	Juego juego, juego1;
	JuegoAdivinaNumero juegoA;
	JuegoAdivinaPar juegoP;
	JuegoAdivinaImpar juegoI;
	ArrayList<Jugable> juegos;
	int numero, respuesta;
	boolean repetir = true;
	
	@Before
	public void setUp() {
		//juego = new Juego(5);
		//juego1 = new Juego(5);
		juegos = new ArrayList<Jugable>(3);
		juegoA = new JuegoAdivinaNumero(3, 2);
		juegoP = new JuegoAdivinaPar(3, 4);
		juegoI = new JuegoAdivinaImpar(3, 7);
		juegos.add(juegoA);
		juegos.add(juegoP);
		juegos.add(juegoI);
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
		while (repetir) {
			System.out.println("Elije uno de estos juegos:\n");
			System.out.println("0: Adivinar un numero\n");
			System.out.println("1: Adivinar un numero par\n");
			System.out.println("2: Adivinar un numero impar\n");
			Scanner entrada = new Scanner(System.in);
			numero = entrada.nextInt();
			while (numero != 0 && numero != 1 && numero != 2) {
				entrada = new Scanner(System.in);
				numero = entrada.nextInt();
			}
			juegos.get(numero).muestraNombre();
			juegos.get(numero).muestraInfo();
			juegos.get(numero).juega();
			System.out.println("ÀDesea jugar de nuevo?\n0: S’\n1: No");
			entrada = new Scanner(System.in);
			respuesta = entrada.nextInt();
			if (respuesta == 1) {
				repetir = false;
			}
		}
		
	}

}
