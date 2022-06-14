package com.app.f1;

public class metodos {
	/*
	Ámbito de visibilidad: public
	Tipo de método: static
	Tipo de dato que es devuelto por el método: void (ninguno)
	Nombre del método: main
	Variables que acepta el método y tipos: array de tipo String y de nombre args
	*/
	public static void main(String[] args) {
		// el método no retorna ningún valor (void)
		// invocación al método suma
		int a = metodos.suma(1, 2, 3);
		// imprime 6
		System.out.println(a);
		// imprime 10
		System.out.println(metodos.suma(1, 5, 4));
		// invocación al método resta pero no es static
		//int a = metodos.resta(4, 2);
		// imprimiria 2
		//System.out.println(a);
		// imprimiria 1
		//System.out.println(metodos.resta(5, 4));
	}
	/*
	Ámbito de visibilidad: public
	Tipo de método: static
	Tipo de dato que es devuelto por el método: int
	Nombre del método: suma
	Variables que acepta el método y tipos: dos variables de tipo entero con nombre x e y
	*/
	public static int suma(int x, int y, int z) {
		// el método retorna el resultado de la operación x + y
		return x + y + z;
	}
	/*
	Ámbito de visibilidad: public (valor por defecto)
	Tipo de método: no estático (valor por defecto)
	Tipo de dato que es devuelto por el método: int
	Nombre del método: resta
	Variables que acepta el método y tipos: dos enteros de nombre x e y
	*/
	int resta(int x, int y) {
		// el método retorna el resultado de la operación x - y
		return x - y;
	}
}
