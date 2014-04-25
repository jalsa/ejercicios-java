package com.jon.fizzbuzz;
import java.util.ArrayList;

import com.jon.factories.ValidadorFactoria;
import com.jon.interfaces.InterfazValidador;
import com.jon.validadores.Buzz;
import com.jon.validadores.Fizz;
import com.jon.validadores.Mozz;

public class FizzBuzz {

	 ArrayList<InterfazValidador> validadores;
	 Fizz f;
	 Buzz b;
	 Mozz m;

	 public FizzBuzz(){
		 
		 f = ValidadorFactoria.getFizzValidador();
		 b = ValidadorFactoria.getBuzzValidador();
		 m = ValidadorFactoria.getMozzValidador();
		 validadores = new ArrayList<InterfazValidador>();
		 validadores.add(f);
		 validadores.add(b);
		 validadores.add(m);
	 }

	public String calcular(int num) {
		String cadena = "";
		String cadena1;

		for (int i=1; i<=num; i++) {
			if (i == 1) {
				cadena += Integer.toString(i);
			}
			else {
				cadena1 = " ";
				InterfazValidador inter;
				for (int j=0; j<validadores.size(); j++) {
					inter = validadores.get(j);
					if (inter.validar(i)) {
						cadena1 += inter.valor();
					}
				}
				if (cadena1 == " ") {
					cadena1 += Integer.toString(i);
				}
				cadena += cadena1;
			}
		}
		return cadena;
	}
	
}