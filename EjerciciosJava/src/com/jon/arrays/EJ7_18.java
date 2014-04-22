package com.jon.arrays;

public class EJ7_18 {

	public static void main(String[] args) {
		int[] array = new int[10];
		int[] array1 = new int[10];
		int[] arrayFinal = new int[array.length + array1.length];
		int mitad = array.length;
		System.out.println("Primer array: ");
		for (int i=0; i<array.length; i++) {
			int x = (int) (10*Math.random()+1);
			array[i] = x;
			System.out.println(x);
		}
		System.out.println("Segundo array: ");
		for (int j=0; j<array1.length; j++) {
			int x = (int) (10*Math.random()+1);
			array1[j] = x;
			System.out.println(x);
		}
		for (int h=0; h<array.length; h++) {
			arrayFinal[h] = array[h];
		}
		for (int k=0; k<array1.length; k++) {
			arrayFinal[mitad] = array1[k];
			mitad++;
		}
		System.out.println("Resultado: ");
		for (int l=0; l<arrayFinal.length; l++) {
			System.out.println(arrayFinal[l]);
		}
	}
}
