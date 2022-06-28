package com.ejemplo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

	public static void main(String[] args) {

		// abre el contexto a partir del archivo de configuración
		ClassPathXmlApplicationContext context =
		new ClassPathXmlApplicationContext("applicationContext.xml");
		/*
		obtiene el bean, donde:
		- el primer parámetro es el identificador del bean
		- el segundo parámetro es la interfaz que implementa el 
		bean a recibir, realizando una especie casting
		*/
		Entrenador entrenador = context.getBean("mientrenador", 
												Entrenador.class);
		System.out.println(entrenador.getEntrenamiento());
		Entrenador entrenador2 = context.getBean("mientrenador2", 
				Entrenador.class);
		System.out.println(entrenador2.getEntrenamiento());
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
