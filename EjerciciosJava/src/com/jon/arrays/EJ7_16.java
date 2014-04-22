package com.jon.arrays;

public class EJ7_16 {
	public static void main(String[] args) {
		int[] array = new int[10];
		int maximo, minimo;
		for (int i=0; i<10; i++) {
			int x = (int) (10*Math.random()+1);
			array[i] = x;
			System.out.println(x);
		}
		maximo = array[0];
		minimo = array[0];
		for (int j=0; j<10; j++) {
			if (array[j] > maximo) {
				maximo = array[j];
			}
			if (array[j] < minimo) {
				minimo = array[j];
			}
		}
		System.out.println("M‡ximo: " + maximo);
		System.out.println("M’nimo: " + minimo);
	}
}
