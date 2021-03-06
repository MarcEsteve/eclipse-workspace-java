package com.app.strings;

public class StringBuilderBuffer {

	public static void main(String[] args) {
		/*
		Concatenaci?n utilizando String
		
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		String str1 = "";
		for(int i=0; i<100000; i++) {
			str1 += i;
		}
		long endTime = System.currentTimeMillis() 
				- startTime;
		System.out.println(System.currentTimeMillis());
		System.out.printf("El tiempo que ha tardado "
				+ "con String es de %d milisegundos", 
				endTime).println();
		*/
		/*
		Concatenaci?n utilizando StringBuilder
		
		startTime = System.currentTimeMillis();
		StringBuilder str2 = new StringBuilder();
		for(int i=0; i<100000; i++) {
			str2.append(i);
		}
		endTime = System.currentTimeMillis() - startTime;
		System.out.printf("El tiempo que ha tardado "
				+ "con StringBuilder es de %d "
				+ "milisegundos",endTime).println();
		*/
		/*
		Concatenaci?n utilizando StringBuffer
		
		startTime = System.currentTimeMillis();
		StringBuffer str3 = new StringBuffer();
		for(int i=0; i<100000; i++) {
			str3.append(i);
		}
		endTime = System.currentTimeMillis() 
				- startTime;
		System.out.printf("El tiempo que ha tardado "
				+ "con StringBuffer es de %d "
				+ "milisegundos",endTime).println();
		*/
		//M?TODO toString()
		StringBuilder strb = new StringBuilder("hola");
		String str = strb.toString();
		// hola
		System.out.println(strb);
		// hola
		System.out.println(str);
		//M?TODO capacity()
		//variable de tipo StringBuilder con una 
		//capacidad de 16 elementos vac?os
		StringBuilder strb1 = new StringBuilder();
		//variable de tipo StringBuilder con la 
		//capacidad del String pasado por par?metro (4
		//caracteres), m?s 16 elementos vac?os 
		//adicionales
		StringBuilder strb2 = new StringBuilder("hola");
		//variable de tipo StringBuilder con una 
		//capacidad de 1
		StringBuilder strb3 = new StringBuilder(1);
		// 16
		System.out.println(strb1.capacity());
		// 20
		System.out.println(strb2.capacity());
		// 1
		System.out.println(strb3.capacity());
		//M?TODO length()
		// 0
		System.out.println(strb1.length());
		// 4
		System.out.println(strb2.length());
		// 0
		System.out.println(strb3.length());
		//M?TODO append(String str)
		// agrega el car?cter a al final del 
		//StringBuilder
		strb.append("a");
		// holaa
		System.out.println(strb);
		//M?TODO insert(int offset, String str)
		strb = new StringBuilder("la");
		// agrega la cadena de texto ho en el ?ndice 0
		strb.insert(0, "ho");
		// hola
		System.out.println(strb);
		// agrega la cadena de texto ca en el ?ndice 2
		strb.insert(2, "ca");
		// hocala
		System.out.println(strb);
		// error porque el StringBuilder posee 
		//una longitud menor que 22
		// strb.insert(22, "ho");
		//M?TODO replace(int start, int end, String str)
		strb1 = new StringBuilder("hola a todos");
		strb2 = new StringBuilder("hola a todos");
		strb3 = new StringBuilder("hola a todos");
		// reemplaza desde el ?ndice 5 al ?ndice 6 
		//(1 car?cter) por la cadena de texto dd
		//[5,6) 
		//indice 5 incluido hasta el indice 6 Noincluido
		strb1.replace(5, 6, "dd");
		// hola dd todos
		System.out.println(strb1);
		// reemplaza desde el ?ndice 5 al ?ndice 22 
		//(hasta el final del StringBuilder) por la 
		//cadena de texto dd
		strb2.replace(5, 22, "dd");
		// hola dd
		System.out.println(strb2);
		//Quiero "hola a dds"
		strb3.replace(7, 11, "dd");
		System.out.println(strb3);
		//M?TODO setCharAt(int index, char ch)
		// reemplaza el car?cter del ?ndice 2, la l, 
		//del StringBuilder con el car?cter c
		strb= new StringBuilder("hola a todos");
		strb.setCharAt(2, 'c');
		System.out.println(strb);
		//M?TODO reverse()
		//"sodot a acoh"
		strb.reverse();
		System.out.println(strb);
		//M?TODO delete(int start incluido, int end)
		// elimina los caracteres del ?ndice 1 al 3
		strb.delete(1, 3);
		//"sot a acoh"  ha eliminado la "o" y la "d"
		System.out.println(strb);
		//M?TODO deleteCharAt(int index)
		strb.deleteCharAt(1);
		//"st a acoh"  ha eliminado la "o"
		System.out.println(strb);
		
	}

}
