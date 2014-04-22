package com.jon.arrays;

public class EJ7_19 {

	public static void main(String[] args) {
		int[] array = new int[10];
		int[] array1 = new int[10];
		int cant = 0;
		if (array.length >= array1.length) {
			cant = array.length;
		}
		else {
			cant = array1.length;
		}
		int[] arrayFinal = new int[cant];
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
		for (int h=0; h<arrayFinal.length; h++) {
			while (array.length > h && array1.length > h) {
				arrayFinal[h] = array[h] + array1[h];
			}
			if (array.length > array1.length) {
				for (int l=h; l<array.length; l++) {
					arrayFinal[h] = array[l];
				}
			}
			else {
				for (int m=h; m<array1.length; m++) {
					arrayFinal[h] = array[m];
				}
			}
		}
		System.out.println("Resultado: ");
		for (int n=0; n<arrayFinal.length; n++) {
			System.out.println(arrayFinal[n]);
		}
	}
}
