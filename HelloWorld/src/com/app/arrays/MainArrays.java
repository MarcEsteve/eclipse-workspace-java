package com.app.arrays;

public class MainArrays {

	public static void main(String[] args) {
		System.out.printf("Numero de parametros: %d", 
				args.length).println();
		for(String arg : args) {
			System.out.println(arg);
		}
	}

}
