package com.jon.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

import org.junit.Before;
import org.junit.Test;

import com.jon.app.Application;
import com.jon.clases.Juego;
import com.jon.clases.JuegoAdivinaImpar;
import com.jon.clases.JuegoAdivinaNumero;
import com.jon.clases.JuegoAdivinaPar;
import com.jon.excepciones.JuegoException;
import com.jon.interfaces.Jugable;

public class JuegoTest {

	Application app;
	Juego juego, juego1;
	Jugable j;
	int respuesta;
	Scanner entrada;
	
	@Before
	public void setUp() {
		app = new Application();
		j = null;
		while (j == null) {
			try {
				j = app.elijeJuego();
			} catch (JuegoException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	@Test
	public void test() {
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
