package com.jon.basicos;

import java.util.Scanner;

public class EJ4_01 {

	public static void main(String[] args) {
		int radio;
		double volumen, superficie;
		
		Scanner entrada = new Scanner(System.in);
		radio = entrada.nextInt();
		
		volumen = (4/3) * Math.PI * Math.pow(radio, 3);
		superficie = 4 * Math.PI * Math.pow(radio, 2);
		
		System.out.println("El volumen de la esfera es: " + volumen);
		System.out.println("La superficie de la esfera es: " + superficie);
	}
}