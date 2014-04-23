package com.jon.clases;

public class ValidarDni {
	private String nif;
	public ValidarDni(String nif) {
		this.nif = nif;
	}
	public boolean validar() {
		boolean valido = true;
		char[] cArray, cArray1;
		char c;
		char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'};
		if (this.nif.length() != 9) {
			valido = false;
		}
		if (valido) {
			String cadena = this.nif.substring(0,8);
			String letra = this.nif.substring(8,9);
			cArray = cadena.toCharArray();
			for (int i=0; i<cArray.length; i++) {
				c = cArray[i];
				if (!Character.isDigit(c)) {
					valido = false;
				}
			}
			cArray1 = letra.toCharArray();
			if (!Character.isLetter(cArray1[0])) {
				valido = false;
			}
			else {
				int resto = parseInt(cadena) % 23;
	            char letraDni = letras[resto];
	            if (letraDni != letra) {
	            	valido = false;
	            }
			}
		}
		return valido;
	}
}
