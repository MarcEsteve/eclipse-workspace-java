package com.ejemplo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

	public static void main(String[] args) {

		// abre el contexto a partir del archivo de configuraci�n
		ClassPathXmlApplicationContext context =
		new ClassPathXmlApplicationContext("applicationContext.xml");
		/*
		obtiene el bean, donde:
		- el primer par�metro es el identificador del bean
		- el segundo par�metro es la interfaz que implementa el 
		bean a recibir, realizando una especie casting
		*/
		/* Cuando tenemos el archivo XML
		 * Entrenador entrenador = context.getBean("mientrenadorbasket", 
		 
												Entrenador.class);
		System.out.println(entrenador.getEntrenamiento());
		Entrenador entrenador2 = context.getBean("mientrenadorfutbol", 
				Entrenador.class);
		System.out.println(entrenador2.getEntrenamiento());
		*/
		
		//Creamos a trav�s de ANOTACIONES
		Entrenador entrenador = context.getBean("mientrenadorfutbol", Entrenador.class);
		System.out.println(entrenador.getEntrenamiento());
		Entrenador entrenador2 = context.getBean("mientrenadorbasket", Entrenador.class);
		System.out.println(entrenador2.getEntrenamiento());
		Entrenador entrenador3 = context.getBean("mientrenadortenis", Entrenador.class);
		System.out.println(entrenador3.getEntrenamiento());
		// cierra el contexto
		context.close();
		
		/*Entrenador entrenadorFutbol = new EntrenadorFutbol();
		Entrenador entrenadorBaloncesto= new EntrenadorBaloncesto();
		Entrenador entrenadorTenis= new EntrenadorTenis();
		System.out.println(entrenadorFutbol.getEntrenamiento());
		System.out.println(entrenadorBaloncesto.getEntrenamiento());
		System.out.println(entrenadorTenis.getEntrenamiento());*/
	}

}