package com.jon.clases;

public abstract class ValidarDni {
	public static boolean validar(String nif) {
		boolean valido = true;
		char[] cArray, cArray1;
		char c;
		char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'};
		if (nif.length() != 9) {
			valido = false;
		}
		if (valido) {
			String cadena = nif.substring(0,8);
			String letra = nif.substring(8,9);
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
				int resto = Integer.parseInt(cadena) % 23;
	            char letraDni = letras[resto];
	            if (letraDni != letra.charAt(0)) {
	            	valido = false;
	            }
			}
		}
		return valido;
	}
}
