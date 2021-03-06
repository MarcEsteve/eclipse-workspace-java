package com.app.arrays;

import java.util.Arrays;

public class Arraysss {

	public static void main(String[] args) {
		/*
		int manzanasVendidasDia1 = 24;
		int manzanasVendidasDia2 = 4;
		int manzanasVendidasDia3 = 23;
		int manzanasVendidasDia4 = 55;
		int manzanasVendidasDia5 = 34;
		int manzanasVendidasDia6 = 33; 
		*/
		//No es necesario tener tantas variables, se puede
		//almacenar todos estos INT en un solo ARRAY
		int manzanasVendidas[] = { 24, 4, 23, 55, 34, 33 };
		// declaración (no se puede utilizar el array todavía 
		//si no se instancia)
		int a[];
		// declaración e instanciación de un array de 31 elementos
		//(todos los valores son inicializados a cero por defecto 
		//en caso de arrays de tipo int, 0.0 
		//en arrays de tipo float y
		//false en arrays de tipo boolean)
		int b[] = new int[31];
		// declaración, instanciación de un array de 6 elementos 
		//e inicialización con valores
		int c[] = { 24, 4, 23, 55, 34, 33 };
		//Declaras, instancias y damos valores
		int numeros[] = { 24, 4, 23, 55, 34, 33 };
		// 24
		System.out.println(numeros[0]);
		// 4
		System.out.println(numeros[1]);
		// 6
		System.out.println(numeros.length);
		// 33
		System.out.println(numeros[numeros.length - 1]);
		//recorrer arrays con FOR
		for(int i=0; i<numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		//ForEach, asigna: "numero" cada posición del array "numeros"
		for(int numero : numeros) {
			System.out.println(numero);
		}
		//Para MODIFICAR valores "array[indice]=valor asignado"
		// 24
		System.out.println(numeros[0]);
		// modifica el valor del primer elemento (24) a 0
		numeros[0] = 3;
		// 3
		System.out.println(numeros[0]);
		for(int numero : numeros) {
			System.out.println(numero);
		}
		//Ejercicio: escribe un programa que genere 
		//un array de 6 valores de tipo int y sean
		//mostrados en pantalla utilizando un bucle for.
		int array6[]=new int[6];
		int numeroAleatorio;
		//System.out.println(numeroAleatorio);
		for (int i=0;i<array6.length;i++) {
			numeroAleatorio=(int) (Math.random()*100);
			array6[i]=numeroAleatorio;
		}
		for(int array6valor : array6) {
			System.out.println(array6valor);
		}
		// Correcto porque todos los objetos heredan de Object
		Object datos[] = { "a", 'a', true, 55, 2.3, 33 };
		// TRUE porque el cuarto elemento es un objeto de 
		//tipo Integer y no una variable primitiva de 
		//tipo int (instanceof solamente trabaja con objetos, 
		//no funciona con variables primitivas)
		System.out.println(datos[3] instanceof Integer);
		// 24
		System.out.println(Arraysss.suma(1,3,4,5,4,3,4));
		// 1
		System.out.println(Arraysss.suma(1));
		// 11
		System.out.println(Arraysss.suma(1,3,3,4));
		int numeros6[] = { 24, 4, 23, 55, 34, 33 };
		// [24, 4, 23, 55, 34, 33]
		System.out.println(Arrays.toString(numeros6));
		// declaración e instanciación de un array de 
		//5 elementos (todos con el valor 0 por defecto)
		int[] numeros5 = new int[5];
		// cambia todos los valores del array a 100
		Arrays.fill(numeros5, 100);
		System.out.println(Arrays.toString(numeros5));
		//Arrays.equals([], []): compara dos arrays 
		//y retorna true solo si:
		//	+Ambos arrays poseen la misma longitud.
		//	+Los elementos para todos los índices 
		//	son iguales en los dos arrays.
		int[] numeros1 = { 1,2,3,3,5 };
		int[] numeros2 = { 1,2,3,3,5 };
		// true
		System.out.println(Arrays.equals(numeros1, numeros2));
		//Arrays.sort(): ordena un array de menor a mayor 
		//(en caso de arrays de tipo char realiza una 
		//ordenación ASCII). Método que no retorna nada (void)
		int[] numerosOrden = { 11,22,3,4,5,0 };
		Arrays.sort(numerosOrden);
		// [0, 3, 4, 5, 11, 22]
		System.out.println(Arrays.toString(numerosOrden));
		//en caso de arrays de tipo char realiza
		//una ordenación ASCII
		char[] caracteres = { '3','c', 'z','H', 'b','5', 'a', 'A', 'C' };
		Arrays.sort(caracteres);
		// [A, C, H, a, b, c, z]
		System.out.println(Arrays.toString(caracteres));
	}
	// método estático que puede recibir un 
	//número indefinido de parámetros de tipo int
	
	static int suma(int... parametrosInt) {
		int value = 0;
		for (int numero : parametrosInt) {
				value += numero;
		}
		return value;
	}

}
