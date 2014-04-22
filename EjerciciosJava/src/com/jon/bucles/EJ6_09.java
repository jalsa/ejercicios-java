package com.jon.bucles;

import java.util.Scanner;

public class EJ6_09 {
	public static void main(String[] args) {
		int numero;
		int resultado = 1;
		Scanner entrada = new Scanner(System.in);
		numero = entrada.nextInt();
		for (int i=1; i<=numero; i++) {
			resultado = resultado * i;
		}
		System.out.println("Factorial: " + resultado);
	}
}
