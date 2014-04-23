package com.jon.funciones;

import java.util.Scanner;
import java.util.Vector;

public class EJ8_22 {

	public static void main(String[] args) {
		int numero;
		Scanner entrada = new Scanner(System.in);
		numero = entrada.nextInt();
		Vector<Integer> array = listaDePrimos(numero);
		for (int j=0; j<array.size(); j++) {
			System.out.println(array.get(j));
		}
	}
	public static boolean esPrimo(int x) {
		int divisor = 2;
		boolean primo = true;
		if (x == 1 || x == 2) {
			primo = false;
		}
		while(primo && divisor<x) {
			if (x % divisor == 0) {
				primo = false;
			}
			else {
				divisor++;
			}
		}
		return primo;
	}
	public static Vector<Integer> listaDePrimos(int numero) {
		Vector<Integer> v = new Vector<Integer>();
		for (int i=1; i<=numero; i++) {
			if (esPrimo(i)) {
				v.add(new Integer(i));
			}
		}
		//Integer[] resultado = (Integer[]) v.toArray(); 
		return v;
	}
}
