package com.jon.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.jon.fizzbuzz.FizzBuzz;

public class FizzBuzzTest {

	FizzBuzz fb;
	
	@Before
	public void setUp() throws Exception {
		fb = new FizzBuzz();
	}

	@Test
	public void test() {
		assertEquals("FizzBuzz 1", "1", fb.calcular(1));
		assertEquals("FizzBuzz 2", "1 2", fb.calcular(2));
		assertEquals("FizzBuzz 3", "1 2 Fizz", fb.calcular(3));
		assertEquals("FizzBuzz 4", "1 2 Fizz 4", fb.calcular(4));
		assertEquals("FizzBuzz 5", "1 2 Fizz 4 Buzz", fb.calcular(5));
		assertEquals("FizzBuzz 6", "1 2 Fizz 4 Buzz Fizz", fb.calcular(6));
		assertEquals("FizzBuzz 7", "1 2 Fizz 4 Buzz Fizz 7", fb.calcular(7));
		assertEquals("FizzBuzz 8", "1 2 Fizz 4 Buzz Fizz 7 8", fb.calcular(8));
		assertEquals("FizzBuzz 9", "1 2 Fizz 4 Buzz Fizz 7 8 Fizz", fb.calcular(9));
		assertEquals("FizzBuzz 10", "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz", fb.calcular(10));
		assertEquals("FizzBuzz 11", "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11", fb.calcular(11));
		assertEquals("FizzBuzz 12", "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz", fb.calcular(12));
		assertEquals("FizzBuzz 13", "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13", fb.calcular(13));
		assertEquals("FizzBuzz 14", "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14", fb.calcular(14));
		assertEquals("FizzBuzz 15", "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz", fb.calcular(15));
	}

}
