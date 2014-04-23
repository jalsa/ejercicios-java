package com.jon.funciones;

import java.util.Scanner;
import java.util.Vector;

public class EJ8_22 {

	public static void main(String[] args) {
		int numero;
		Scanner entrada = new Scanner(System.in);
		numero = entrada.nextInt();
		Primos p = new Primos(numero);
		Vector<Integer> array = p.listaDePrimos();
		for (int j=0; j<array.size(); j++) {
			System.out.println(array.get(j));
		}
	}
}
