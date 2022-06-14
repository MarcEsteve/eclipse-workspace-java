package com.app.f1;

public class metodos {
	/*
	�mbito de visibilidad: public
	Tipo de m�todo: static
	Tipo de dato que es devuelto por el m�todo: void (ninguno)
	Nombre del m�todo: main
	Variables que acepta el m�todo y tipos: array de tipo String y de nombre args
	*/
	public static void main(String[] args) {
		// el m�todo no retorna ning�n valor (void)
		// invocaci�n al m�todo suma
		int a = metodos.suma(1, 2, 3);
		// imprime 6
		System.out.println(a);
		// imprime 10
		System.out.println(metodos.suma(1, 5, 4));
		// invocaci�n al m�todo resta pero no es static
		//int a = metodos.resta(4, 2);
		// imprimiria 2
		//System.out.println(a);
		// imprimiria 1
		//System.out.println(metodos.resta(5, 4));
	}
	/*
	�mbito de visibilidad: public
	Tipo de m�todo: static
	Tipo de dato que es devuelto por el m�todo: int
	Nombre del m�todo: suma
	Variables que acepta el m�todo y tipos: dos variables de tipo entero con nombre x e y
	*/
	public static int suma(int x, int y, int z) {
		// el m�todo retorna el resultado de la operaci�n x + y
		return x + y + z;
	}
	/*
	�mbito de visibilidad: public (valor por defecto)
	Tipo de m�todo: no est�tico (valor por defecto)
	Tipo de dato que es devuelto por el m�todo: int
	Nombre del m�todo: resta
	Variables que acepta el m�todo y tipos: dos enteros de nombre x e y
	*/
	int resta(int x, int y) {
		// el m�todo retorna el resultado de la operaci�n x - y
		return x - y;
	}
}
