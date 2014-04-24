package com.jon.clases;

import java.util.Scanner;

public class PruebaValidar {

	public static void main(String[] args) {
		String nif;
		Scanner entrada = new Scanner(System.in);
		nif = entrada.next();
		if (ValidarDni.validar(nif)) {
			System.out.println(nif.substring(0, 8));
		}
		else {
			System.out.println("NIF no v‡lido");
		}
	}
}
