package com.ejemplo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

	public static void main(String[] args) {

		// abre el contexto a partir del archivo de configuración
		//Obtiene los BEANS del archivo XML
		ClassPathXmlApplicationContext context =
		new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// abre el contexto a partir del archivo de configuración
		//Obtiene los BEANS de las anotaciones
		AnnotationConfigApplicationContext contextconfig = new
				AnnotationConfigApplicationContext(Configuracion.class);
		
		// obtener el bean mediante Inyección de dependencias
		Entrenador entrenador = context.getBean("mientrenadorfutbol", 
												Entrenador.class);
		Entrenador entrenador1 = context.getBean("mientrenadorfutbol", 
				Entrenador.class);
		System.out.println(entrenador.getExperiencia());
		System.out.println(entrenador.getEntrenamiento());
		
		//Inyección de VALORES LITERALES
		System.out.println(entrenador.getEmail());
		System.out.println(entrenador.getEquipo());
		
		// obtener el bean mediante Inyección de dependencias
		Entrenador entrenador2 = context.getBean("mientrenadorbasket", 
												Entrenador.class);
		System.out.println(entrenador2.getExperiencia());
		System.out.println(entrenador2.getEntrenamiento());
		//Valores en properties
		System.out.println(entrenador2.getEmail());
		System.out.println(entrenador2.getEquipo());
		
		// obtener el bean mediante Inyección de dependencias
		Entrenador entrenador3 = contextconfig.getBean("mientrenadortenis", 
												Entrenador.class);
		System.out.println(entrenador3.getExperiencia());
		System.out.println(entrenador3.getEntrenamiento());
		
		//Con el método setter y el properties en el XML
		Entrenador entrenador4 = context.getBean(""
				+ "mientrenadorjockey", Entrenador.class);
		System.out.println(entrenador4.getExperiencia());
		System.out.println(entrenador4.getEntrenamiento());
		//Vamos a revisar el ámbito Scope de los beans
		
		Entrenador entrenador5 = contextconfig.getBean(""
				+ "entrenadorBaloncesto", Entrenador.class);
		//System.out.println(entrenador5.getExperiencia());

		System.out.println(entrenador5.getEntrenamiento());
		System.out.println(entrenador5.getEmail());
		System.out.println(entrenador5.getEquipo());
		
		System.out.println(entrenador);
		System.out.println(entrenador1);
		System.out.println(entrenador2);
		System.out.println(entrenador3);
		System.out.println(entrenador4);
		System.out.println(entrenador5);
		
		
		/*
		obtiene el bean, donde:
		- el primer parámetro es el identificador del bean
		- el segundo parámetro es la interfaz que implementa el 
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
		
		//Creamos a través de ANOTACIONES
		/*Entrenador entrenador = context.getBean("mientrenadorfutbol", Entrenador.class);
		System.out.println(entrenador.getEntrenamiento());
		Entrenador entrenador2 = context.getBean("mientrenadorbasket", Entrenador.class);
		System.out.println(entrenador2.getEntrenamiento());
		Entrenador entrenador3 = context.getBean("mientrenadortenis", Entrenador.class);
		System.out.println(entrenador3.getEntrenamiento());*/
		// cierra el contexto
		context.close();
		contextconfig.close();
		
		/*Entrenador entrenadorFutbol = new EntrenadorFutbol();
		Entrenador entrenadorBaloncesto= new EntrenadorBaloncesto();
		Entrenador entrenadorTenis= new EntrenadorTenis();
		System.out.println(entrenadorFutbol.getEntrenamiento());
		System.out.println(entrenadorBaloncesto.getEntrenamiento());
		System.out.println(entrenadorTenis.getEntrenamiento());*/
	}

}
