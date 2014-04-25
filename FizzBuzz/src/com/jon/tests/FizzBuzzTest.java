package com.jon.tests;
import com.jon.validadores.Buzz;
import com.jon.validadores.Fizz;
import com.jon.validadores.Mozz;

import static org.junit.Assert.*;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.jon.fizzbuzz.FizzBuzz;
import com.jon.interfaces.InterfazValidador;

public class FizzBuzzTest {

	FizzBuzz fb;
	Fizz f;
	Buzz b;
	ArrayList<InterfazValidador> validadores;

	@Before
	public void setUp() throws Exception {
		fb = new FizzBuzz();

		validadores = new ArrayList<InterfazValidador>();
		validadores.add(new Fizz());
		validadores.add(new Buzz());
		validadores.add(new Mozz());
	}

	@Test
	public void testFizz() {
		assertEquals("Fizz 1", false, validadores.get(0).validar(1));
		assertEquals("Fizz 1", "Fizz", validadores.get(0).valor());
		assertEquals("Fizz 2", false, validadores.get(0).validar(2));
		assertEquals("Fizz 2", "Fizz", validadores.get(0).valor());
		assertEquals("Fizz 3", true, validadores.get(0).validar(3));
		assertEquals("Fizz 3", "Fizz", validadores.get(0).valor());
		assertEquals("Fizz 4", false, validadores.get(0).validar(4));
		assertEquals("Fizz 4", "Fizz", validadores.get(0).valor());
		assertEquals("Fizz 5", false, validadores.get(0).validar(5));
		assertEquals("Fizz 5", "Fizz", validadores.get(0).valor());
	}

	@Test
	public void testBuzz() {
		assertEquals("Buzz 1", false, validadores.get(1).validar(1));
		assertEquals("Buzz 1", "Buzz", validadores.get(1).valor());
		assertEquals("Buzz 2", false, validadores.get(1).validar(2));
		assertEquals("Buzz 2", "Buzz", validadores.get(1).valor());
		assertEquals("Buzz 3", false, validadores.get(1).validar(3));
		assertEquals("Buzz 3", "Buzz", validadores.get(1).valor());
		assertEquals("Buzz 4", false, validadores.get(1).validar(4));
		assertEquals("Buzz 4", "Buzz", validadores.get(1).valor());
		assertEquals("Buzz 5", true, validadores.get(1).validar(5));
		assertEquals("Buzz 5", "Buzz", validadores.get(1).valor());
	}

	@Test
	public void testMozz() {
		assertEquals("Mozz 1", false, validadores.get(2).validar(1));
		assertEquals("Mozz 1", "Mozz", validadores.get(2).valor());
		assertEquals("Mozz 2", false, validadores.get(2).validar(2));
		assertEquals("Mozz 2", "Mozz", validadores.get(2).valor());
		assertEquals("Mozz 3", false, validadores.get(2).validar(3));
		assertEquals("Mozz 3", "Mozz", validadores.get(2).valor());
		assertEquals("Mozz 5", false, validadores.get(2).validar(5));
		assertEquals("Mozz 5", "Mozz", validadores.get(2).valor());
		assertEquals("Mozz 7", true, validadores.get(2).validar(7));
		assertEquals("Mozz 7", "Mozz", validadores.get(2).valor());
	}

	@Test
	public void test() {
		assertEquals("FizzBuzz 1", "1", fb.calcular(1));
		assertEquals("FizzBuzz 2", "1 2", fb.calcular(2));
		assertEquals("FizzBuzz 3", "1 2 Fizz", fb.calcular(3));
		assertEquals("FizzBuzz 4", "1 2 Fizz 4", fb.calcular(4));
		assertEquals("FizzBuzz 5", "1 2 Fizz 4 Buzz", fb.calcular(5));
		assertEquals("FizzBuzz 6", "1 2 Fizz 4 Buzz Fizz", fb.calcular(6));
		assertEquals("FizzBuzz 7", "1 2 Fizz 4 Buzz Fizz Mozz", fb.calcular(7));
		assertEquals("FizzBuzz 8", "1 2 Fizz 4 Buzz Fizz Mozz 8", fb.calcular(8));
		assertEquals("FizzBuzz 9", "1 2 Fizz 4 Buzz Fizz Mozz 8 Fizz", fb.calcular(9));
		assertEquals("FizzBuzz 10", "1 2 Fizz 4 Buzz Fizz Mozz 8 Fizz Buzz", fb.calcular(10));
		assertEquals("FizzBuzz 11", "1 2 Fizz 4 Buzz Fizz Mozz 8 Fizz Buzz 11", fb.calcular(11));
		assertEquals("FizzBuzz 12", "1 2 Fizz 4 Buzz Fizz Mozz 8 Fizz Buzz 11 Fizz", fb.calcular(12));
		assertEquals("FizzBuzz 13", "1 2 Fizz 4 Buzz Fizz Mozz 8 Fizz Buzz 11 Fizz 13", fb.calcular(13));
		assertEquals("FizzBuzz 14", "1 2 Fizz 4 Buzz Fizz Mozz 8 Fizz Buzz 11 Fizz 13 Mozz", fb.calcular(14));
		assertEquals("FizzBuzz 15", "1 2 Fizz 4 Buzz Fizz Mozz 8 Fizz Buzz 11 Fizz 13 Mozz FizzBuzz", fb.calcular(15));
		assertEquals("FizzBuzz 30", "1 2 Fizz 4 Buzz Fizz Mozz 8 Fizz Buzz 11 Fizz 13 Mozz FizzBuzz 16 17 Fizz 19 Buzz FizzMozz 22 23 Fizz Buzz 26 Fizz Mozz 29 FizzBuzz", fb.calcular(30));
	}
}
