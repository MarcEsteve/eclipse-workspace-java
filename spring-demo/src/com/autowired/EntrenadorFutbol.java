package com.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EntrenadorFutbol implements Entrenador{

	private ExperienciaServicio experienciaServicio;
	// constructor con el servicio inyectado
	@Autowired
	public EntrenadorFutbol(ExperienciaServicio experienciaServicio) {
		System.out.println("Inyección en el constructor");
		this.experienciaServicio = experienciaServicio;
	}
	public int getExperiencia() {
		return this.experienciaServicio.getExperiencia();
	}

}
