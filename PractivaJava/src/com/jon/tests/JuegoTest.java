package com.jon.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

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
		juegos.get(0).muestraNombre();
		juegos.get(0).muestraInfo();
		juegos.get(0).juega();
		juegos.get(1).muestraNombre();
		juegos.get(1).muestraInfo();
		juegos.get(1).juega();
		juegos.get(2).muestraNombre();
		juegos.get(2).muestraInfo();
		juegos.get(2).juega();
	}

}
