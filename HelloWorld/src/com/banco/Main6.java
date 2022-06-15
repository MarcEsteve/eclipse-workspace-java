package com.banco;

import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		/* Ejercicio proyecto (Main6): reutiliza el programa de la clase Main4 
		 * para añadir el siguiente menú cuando se seleccione la opción de Gestores.
		 * 	---
			1. Añadir gestor
			2. Modificar gestor
			3. Eliminar gestor
			4. Ver gestor
			5. Ver gestores
			6. Atrás
			Introduzca un número:
		*/
		Scanner keyboard= new Scanner(System.in);
		int numero =0;
		System.out.println("---\n"
						   + "1. Gestores\r\n"
						   + "2. Clientes\r\n"
						   + "3. Transferencias\r\n"
						   + "4. Mensajes\r\n"
						   + "5. Préstamos\r\n"
						   + "6. Salir\r\n");
		while (numero !=6) {
			System.out.println("Escoja un número de menú: ");
			numero =keyboard.nextInt();
			if (numero == 1) {
				//Invocación del método que imprime "1--> Gestores"
				Main6.mensajeGestores1();
			} else if (numero == 2) {
				//Invocación del método que imprime "2--> Clientes"
				Main6.mensajeClientes2();
			} else if (numero == 3) {
				//Invocación del método que imprime "3--> Transferencias"
				Main6.mensajeTransferencias3();
			} else if (numero == 4) {
				//Invocación del método que imprime "4--> Mensajes"
				Main6.mensajeMensajes4();
			} else if (numero == 5) {
				//Invocación del método que imprime "5--> Prestamos"
				Main6.mensajePrestamos5();
			} else {
				System.out.println("La opción no esta en el sistema");
			}
		}
		System.out.println("6--> Salir");
		keyboard.close();

	}
	public static void mensajeGestores1() {
		System.out.println("1--> Gestores\n"
				+ "	---\r\n"
				+ "  1. Añadir gestor\r\n"
				+ "  2. Modificar gestor\r\n"
				+ "  3. Eliminar gestor\r\n"
				+ "  4. Ver gestor\r\n"
				+ "  5. Ver gestores\r\n"
				+ "  6. Atrás\r\n"
				+ "  Escoja dentro de las opciones de Gestores:");
	}
	private static void mensajeClientes2() {
		System.out.println("2--> Clientes");
	}
	private static void mensajeTransferencias3() {
		System.out.println("3--> Transferencias");
	}
	private static void mensajeMensajes4() {
		System.out.println("4--> Mensajes");
	}
	private static void mensajePrestamos5() {
		System.out.println("5--> Prestamos");
	}

}
