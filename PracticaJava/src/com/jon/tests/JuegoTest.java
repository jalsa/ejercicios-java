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

	Juego juego, juego1;
	Jugable j;
	Scanner entrada;
	
	@Before
	public void setUp() {
		j = null;
		while (j == null) {
			try {
				j = Application.elijeJuego();
			} catch (JuegoException e) {
				System.out.println(e.getMessage());
			}
		}
		Application.continuar(j);
	}
	
	@Test
	public void test() {
		
	}

}
