package com.jon.arrays;

public class EJ7_17 {

	public static void main(String[] args) {
		int[] array = new int[10];
		//int array[] = {0, 1, 2, 3, 4, 4, 3, 2, 1, 0};
		int cant = array.length;
		boolean capicua = true;
		for (int i=0; i<10; i++) {
			int x = (int) (10*Math.random()+1);
			array[i] = x;
			System.out.println(x);
		}
		for (int i=0; i<=array.length/2-1; i++) {
			if (array[i] == array[cant-1] && capicua) {
				capicua = true;
			}
			else {
				capicua = false;
			}
			cant--;
		}
		if (capicua) {
			System.out.println("El array es capicœa");
		}
		else {
			System.out.println("El array no es capicœa");
		}
	}

}
