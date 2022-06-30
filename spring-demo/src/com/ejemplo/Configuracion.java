package com.ejemplo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.ejemplo")
@PropertySource("classpath:datos.basket")
public class Configuracion {
	
	@Value("${email}")
	private String email;
	
	@Value("${equipo}")
	private String equipo;
	
	@Bean
	public ExperienciaServicio experienciaServicio() {
		ExperienciaServicio experienciaServicio = new PocaExperienciaServicio();
		return experienciaServicio;
	}
	
	@Bean
	public Entrenador entrenadorBaloncesto() {
	// el método crea un objeto de la clase EntrenadorBaloncesto y lo retorna
		EntrenadorBaloncesto entrenador = new EntrenadorBaloncesto(experienciaServicio());
		return entrenador;
	}
}
