package com.app.f1;
public class ejercicios344 {

	public static void main(String[] args) {
		// Ejercicio pag 344
		/*Ejercicio: escribe un programa con cuatro variables de tipo entero (a, b, c y d) y un
		condicional que imprima por pantalla si la suma de a y b es mayor que la suma de c y d.
		*/
		int a=9,b=2,c=3,d=4;
		if (a+b > c+d) {
			System.out.println("a+b es mayor que c+d");
		}
		/*Ejercicio: escribe un programa que almacene tres angulos de un triangulo en variables de
		tipo entero (angulo1, angulo2 y angulo3). Crea un condicional que compruebe si esos
		tres angulos juntos pueden formar un triangulo (los angulos de un triangulo suman
		siempre 180 grados).
		*/
		int angulo1=70, angulo2=50,angulo3=60;
		if (angulo1+angulo2+angulo3 == 180) {
			System.out.println("Los angulos forman un triangulo");
		}
		/*Ejercicio: escribe un programa con una variable de tipo entero (a) y un condicional que
		evalue si el entero es par o impar utilizando el operador %.*/
		int a3= 13;
		if (a3%2==0) {
			System.out.println("El valor de a es una cifra par");
		}
		int i = 25;
		if(i == 25) {
			System.out.println("a");
		}
		else if(i == 24) {
			System.out.println("b");
		}
		else {
			System.out.println("c");
		}
		if(i == 24) {
			System.out.println("d");
		}
		else {
			System.out.println("e");
		}
		if(i == 22) {
			System.out.println("f");
		}
		else if(i == 25) {
			System.out.println("g");
		}
		else {
			System.out.println("h");
		}
		/*Ejercicio pag 348: escribe un programa que dado tres numeros imprima por pantalla cual es el
		mayor.*/
		int num1=2, num2=1, num3=3;
		if (num1>num2 && num1>num3) {
			System.out.println("La variable num1 es el mayor");
		}
		else if (num2>num3) {
			System.out.println("La variable num2 es el mayor");
		}
		else {
			System.out.println("La variable num3 es el mayor");
		}
	}
}
