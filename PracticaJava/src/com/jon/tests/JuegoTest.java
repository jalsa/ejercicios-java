package com.jon.tests;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
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
import com.jon.factories.FactoriaJuegos;
import com.jon.interfaces.Jugable;

public class JuegoTest {

	Juego juego, juego1;
	Jugable j;
	Scanner entrada;
	static Vector<Jugable> juegos;
	static JuegoAdivinaNumero juegoA;
	static JuegoAdivinaPar juegoP;
	static JuegoAdivinaImpar juegoI;
	
	@Before
	public void setUp() {
		j = null;
		juegos = new Vector<Jugable>(3);
		juegoA = FactoriaJuegos.getJuegoAdivinaNumero();
		juegoP = FactoriaJuegos.getJuegoAdivinaPar();
		juegoI = FactoriaJuegos.getJuegoAdivinaImpar();
		juegos.add(juegoA);
		juegos.add(juegoP);
		juegos.add(juegoI);
	}
	
	@Test
	public void test() {
		assertEquals("Juego 1", 3, juegos.get(0).obtenerVidasRestantes());
		assertEquals("Juego 1", true, juegos.get(0).quitaVida());
		assertEquals("Juego 1", 2, juegos.get(0).obtenerVidasRestantes());
		assertEquals("Juego 2", 3, juegos.get(1).obtenerVidasRestantes());
		assertEquals("Juego 1", 2, juegos.get(0).obtenerVidasRestantes());
		juegos.get(0).reiniciaPartida();
		assertEquals("Juego 1", 3, juegos.get(0).obtenerVidasRestantes());
		juegos.get(0).actualizaRecord();
		juegos.get(1).actualizaRecord();
		
		ByteArrayInputStream in = new ByteArrayInputStream("0".getBytes());
		
	}

}
