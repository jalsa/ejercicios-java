package com.jon.poo;

public class PruebaComplejo {

	public static void main(String[] args) {
		Complejo c = new Complejo(1.0, 2.0);
		String s = c.toString();
		System.out.println(s);
		
		Complejo c1 = new Complejo(2.0, 3.0);
		c1.sumar(c);
		s = c1.toString();
		System.out.println(s);
		
		System.out.println(Complejo.getNumInstancias());
	}
}
