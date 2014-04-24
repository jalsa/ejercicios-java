package com.jon.fizzbuzz;

import com.jon.validadores.Buzz;
import com.jon.validadores.Fizz;

public class FizzBuzz {

	public String calcular(int num) {
		String cadena = "";
		Fizz fizz = new Fizz();
		Buzz buzz = new Buzz();
		for (int i=1; i<=num; i++) {
			if (i == 1) {
				cadena += Integer.toString(i);
			}
			else if (fizz.validar(i) && buzz.validar(i)) {
				cadena += " " + fizz.valor() + buzz.valor();
			}
			else if (fizz.validar(i)) {
				cadena += " " + fizz.valor();
			}
			else if (buzz.validar(i)) {
				cadena += " " + buzz.valor();
			} 
			else {
				cadena += " " + Integer.toString(i);
			}
		}
		return cadena;
	}
}
