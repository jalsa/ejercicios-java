package com.jon.funciones;

import java.util.Vector;

public class Primos {

	private int x;
	public Primos(int x) {
		this.x = x;
	}
	public Vector<Integer> listaDePrimos() {
		Vector<Integer> v = new Vector<Integer>();
		for (int i=1; i<=this.x; i++) {
			if (esPrimo(i)) {
				v.add(new Integer(i));
			}
		}
		return v;
	}
	
	public boolean esPrimo(int x) {
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
}
