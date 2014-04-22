package com.jon.bucles;

import java.util.Scanner;

public class EJ6_15 {

	public static void main(String[] args) {
		int numero;
		int intentos = 0;
		boolean acertado = false;
		int x = (int) (100*Math.random()+1);
		System.out.println("Nœmero secreto: " + x);
		Scanner entrada = new Scanner(System.in);
		numero = entrada.nextInt();
		while (intentos < 5 && !acertado) {
			if (intentos == 4) {
				System.out.println("Has fallado!");
			}
			else if (numero < x && intentos != 4) {
				System.out.println("Introduce un nœmero mayor");
				numero = entrada.nextInt();
			}
			else if (numero > x && intentos != 4) {
				System.out.println("Introduce un nœmero menor");
				numero = entrada.nextInt();
			}
			else if (numero == x && intentos != 4) {
				System.out.println("Has acertado!");
				acertado = true;
			}
			intentos++;
		}
	}
}
