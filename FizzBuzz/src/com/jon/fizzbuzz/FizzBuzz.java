package com.jon.fizzbuzz;

import com.jon.interfaces.IValidador;
import com.jon.validadores.Buzz;
import com.jon.validadores.Fizz;
import com.jon.validadores.Generico;

public class FizzBuzz {

	public void inicializarValidadores() {
		this.validador[0] = new Fizz();
		this.validador[1] = new Buzz();
	}

	public Generico validador[] = new Generico[2];

	public String calcular(int num) {
		this.inicializarValidadores();
		String cadena = "";
		boolean validado = false;
		// Fizz fizz = new Fizz();
		// Buzz buzz = new Buzz();

		for (int i = 1; i <= num; i++) {
			
			// if (i == 1) {
			// cadena += Integer.toString(i);
			// }
			// else if (fizz.validar(i) && buzz.validar(i)) {
			// cadena += " " + fizz.valor() + buzz.valor();
			// }
			// else if (fizz.validar(i)) {
			// cadena += " " + fizz.valor();
			// }
			// else if (buzz.validar(i)) {
			// cadena += " " + buzz.valor();
			// }
			// else {
			// cadena += " " + Integer.toString(i);
			// }
			validado=false;
			for (int j = 0; j < this.validador.length; j++) {
				if (this.validador[j].validar(i)) {
					cadena += this.validador[j].valor();
					validado = true;
				}

			}
			if (!validado){
				cadena += i;
				
				}
			cadena += " ";

		}
		cadena = cadena.substring(0, cadena.length() - 1);
		return cadena;
	}
}
