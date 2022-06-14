package com.app.f1;

public class bucleInfinitoBreak {

	public static void main(String[] args) {
		int a = 3;
		// bucle infinito
		System.out.printf("El numero a es %d", a).println();
		while(true) {
			while(true) {
				a++;
				System.out.printf("El numero a es %d", a).println();
				if (a == 6000) {
					// finaliza el while
					break;
				}
			}
		}	
	}
}
