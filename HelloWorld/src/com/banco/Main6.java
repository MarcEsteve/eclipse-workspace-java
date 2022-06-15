package com.banco;

import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		/* Ejercicio proyecto (Main6): reutiliza el programa de la clase Main4 
		 * para a�adir el siguiente men� cuando se seleccione la opci�n de Gestores.
		 * 	---
			1. A�adir gestor
			2. Modificar gestor
			3. Eliminar gestor
			4. Ver gestor
			5. Ver gestores
			6. Atr�s
			Introduzca un n�mero:
		*/
		Scanner keyboard= new Scanner(System.in);
		int numero =0;
		System.out.println("---\n"
						   + "1. Gestores\r\n"
						   + "2. Clientes\r\n"
						   + "3. Transferencias\r\n"
						   + "4. Mensajes\r\n"
						   + "5. Pr�stamos\r\n"
						   + "6. Salir\r\n");
		while (numero !=6) {
			System.out.println("Escoja un n�mero de men�: ");
			numero =keyboard.nextInt();
			if (numero == 1) {
				//Invocaci�n del m�todo que imprime "1--> Gestores"
				Main6.mensajeGestores1();
			} else if (numero == 2) {
				//Invocaci�n del m�todo que imprime "2--> Clientes"
				Main6.mensajeClientes2();
			} else if (numero == 3) {
				//Invocaci�n del m�todo que imprime "3--> Transferencias"
				Main6.mensajeTransferencias3();
			} else if (numero == 4) {
				//Invocaci�n del m�todo que imprime "4--> Mensajes"
				Main6.mensajeMensajes4();
			} else if (numero == 5) {
				//Invocaci�n del m�todo que imprime "5--> Prestamos"
				Main6.mensajePrestamos5();
			} else {
				System.out.println("La opci�n no esta en el sistema");
			}
		}
		System.out.println("6--> Salir");
		keyboard.close();

	}
	public static void mensajeGestores1() {
		System.out.println("1--> Gestores\n"
				+ "	---\r\n"
				+ "  1. A�adir gestor\r\n"
				+ "  2. Modificar gestor\r\n"
				+ "  3. Eliminar gestor\r\n"
				+ "  4. Ver gestor\r\n"
				+ "  5. Ver gestores\r\n"
				+ "  6. Atr�s\r\n"
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
