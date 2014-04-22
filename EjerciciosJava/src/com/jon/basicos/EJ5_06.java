package com.jon.basicos;

import java.util.Scanner;

public class EJ5_06 {
	public static void main(String[] args) {
		double peso, altura, imc;
		Scanner entrada = new Scanner(System.in);
		peso = entrada.nextDouble();
		System.out.println("Peso: " + peso);
		altura = entrada.nextDouble();
		System.out.println("Altura: " + altura);
		imc = peso / Math.pow(altura, 2);
		System.out.println("IMC: " + imc);
		if (imc < 16.0) {
			System.out.println("Criterio de ingreso en hospital");
		}
		else if (imc >= 16.0 && imc < 17.0) {
			System.out.println("Infrapeso");
		}
		else if (imc >= 17.0 && imc < 18.0) {
			System.out.println("Bajo peso");
		}
		else if (imc >= 18.0 && imc < 25.0) {
			System.out.println("Peso normal (saludable)");
		}
		else if (imc >= 25.0 && imc < 30.0) {
			System.out.println("Sobrepeso");
		}
		else if (imc >= 30.0 && imc < 35.0) {
			System.out.println("Sobrepeso cr—nico");
		}
		else if (imc >= 35.0 && imc < 40.0) {
			System.out.println("Obesidad prem—rbida");
		}
		else if (imc >= 40.0) {
			System.out.println("Obesidad m—rbida");
		}
	}
}
