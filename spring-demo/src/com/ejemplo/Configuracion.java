package com.ejemplo;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.ejemplo")
@PropertySource("classpath:datos.properties")
public class Configuracion {
	
	@Bean
	public ExperienciaServicio experienciaServicio() {
		ExperienciaServicio experienciaServicio = new PocaExperienciaServicio();
		return experienciaServicio;
	}
	
	@Bean
	public Entrenador entrenadorBaloncesto() {
	// el método crea un objeto de la clase EntrenadorBaloncesto y lo retorna
		//EntrenadorBaloncesto entrenador = new EntrenadorBaloncesto(experienciaServicio());
		Entrenador entrenador= new EntrenadorBaloncesto();
		return entrenador;
	}
}
