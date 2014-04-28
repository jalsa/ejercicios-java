package com.jon.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.jon.clases.Juego;
import com.jon.clases.JuegoAdivinaImpar;
import com.jon.clases.JuegoAdivinaNumero;
import com.jon.clases.JuegoAdivinaPar;

public class JuegoTest {

	Juego juego, juego1;
	JuegoAdivinaNumero juegoA;
	JuegoAdivinaPar juegoP;
	JuegoAdivinaImpar juegoI;
	
	@Before
	public void setUp() {
		//juego = new Juego(5);
		//juego1 = new Juego(5);
		juegoA = new JuegoAdivinaNumero(3, 2);
		juegoP = new JuegoAdivinaPar(3, 4);
		juegoI = new JuegoAdivinaImpar(3, 7);
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
		juegoA.juega();
		juegoP.juega();
		juegoI.juega();
	}

}
