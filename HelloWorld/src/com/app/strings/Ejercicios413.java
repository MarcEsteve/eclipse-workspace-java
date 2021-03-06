package com.app.strings;

public class Ejercicios413 {

	public static void main(String[] args) {
		String a = "abc";
		String b = "azc";
		String substringABC = "acc djskadjas acc jksdjabcd aac";
		int ultimoValorA=a.length()-1;
		int ultimoValorB=b.length()-1;
		//Ejercicio: escribe un programa que dado 
		//dos String compruebe si los dos primeros
		//caracteres son iguales.
		if (a.charAt(0)==b.charAt(0)) {
			System.out.println("Son caracteres iniciales "
							+ "iguales");
		} else {
			System.out.println("Son caracteres iniciales "
							+ "diferentes");
		}
		//Ejercicio: escribe un programa que dado dos String
		//compruebe si los dos primeros caracteres y 
		//los dos ?ltimos son iguales.
		if (a.charAt(0)==b.charAt(0) && a.charAt(ultimoValorA)==b.charAt(ultimoValorB)) {
			System.out.println("El primero y el ?ltimo"
							+ " caracter son iguales");
		} else {
			System.out.println("El primero y el ?ltimo"
					+ " caracter son diferentes");
		}
		//Ejercicio: escribe un programa que compruebe que el 
		//substring "abc" se encuentra en un String dado, 
		//pero no puede encontrarse ni al comienzo, ni al final.
		if ((substringABC.indexOf("abc") != -1) 
				&& (substringABC.indexOf("abc") !=0) 
				&& (substringABC.lastIndexOf("abc") != substringABC.length()-3)) {
			
			System.out.println("El valor de texto abc esta dentro del texto");
		} else {
			System.out.println("No tenemos abc dentro o estan en los extremos");
		}
		//Ejercicio: escribe un programa que dado un String y un determinado ?ndice, 
		//compruebe	que el car?cter anterior y el posterior son iguales o no.
		String texto3= "Lorem ipsum dolllor sit amet";
		int indice = 3; 
		int segundoIndice = 15;
		if ((texto3.charAt(indice)==texto3.charAt(indice-1)) 
				&& (texto3.charAt(indice)==texto3.charAt(indice+1))) {	
			System.out.printf("El caracter que esta en el indice %d, "
					+ "es igual a su anterior y posterior", indice).println();
		} else {
			System.out.printf("El caracter que esta en el indice %d, es "
					+ "diferente a su anterior y posterior", indice).println();
		}
		if ((texto3.charAt(segundoIndice)==texto3.charAt(segundoIndice-1)) 
				&& (texto3.charAt(segundoIndice)==texto3.charAt(segundoIndice+1))) {	
			System.out.printf("El caracter que esta en el indice %d, "
					+ "es igual a su anterior y posterior", segundoIndice).println();
		} else {
			System.out.printf("El caracter que esta en el indice %d, es "
					+ "diferente a su anterior y posterior", segundoIndice).println();
		}
		//Ejercicio: escribe un programa que muestra por pantalla 
		//el ?ndice de la segunda y tercera	ocurrencia del 
		//car?cter 'a' en un String dado.
		String ejercicio5 = "zzzabcdef abcdef abcdef dsajdsajk ";
		//Devolveria las posiciones 7 y 14
		int primerIndice = ejercicio5.indexOf('a');
		//System.out.println(primerIndice);
		int segundoIndiceEj5 = ejercicio5.indexOf('a',primerIndice+1);
		System.out.println(segundoIndiceEj5);
		int tercerIndiceEj5 = ejercicio5.indexOf('a',segundoIndiceEj5+1);
		System.out.println(tercerIndiceEj5);
	
		//Ejercicio: escribe un programa que devuelva 
		//si un String es pal?ndromo Ejemplo:"sometemos"
		String palin = "amoroooma";
		String palinReverse="";
		int indiceRecorre = palin.length()-1; //8
		System.out.println(indiceRecorre);
		char caracter=palin.charAt(indiceRecorre); //a
		System.out.println(caracter);
		for(int i=indiceRecorre;i>=0;i--) {
			palinReverse=palinReverse.concat(palin.valueOf(caracter));
			//System.out.println(caracter);
			//System.out.println(palinReverse);
			//System.out.println(indiceRecorre);
			indiceRecorre--;
			if(indiceRecorre>=0){
				caracter=palin.charAt(indiceRecorre);
			}
		}
		System.out.println(palinReverse);
		if(palin.equals(palinReverse)) {
			System.out.println("Es un palindromo");
		}
		else {
			System.out.println("No es un palindromo");
		}
		
	}

}
