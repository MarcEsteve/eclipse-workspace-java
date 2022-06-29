package com.ejemplo;

import org.springframework.beans.factory.annotation.Autowired;

//import org.springframework.stereotype.Component;

//@Component("mientrenadortenis")
public class EntrenadorTenis implements Entrenador {
	private ExperienciaServicio experienciaServicio;
	// constructor con el servicio inyectado
	@Autowired
	public EntrenadorTenis(ExperienciaServicio experienciaServicio) {
		System.out.println("Inyección en el constructor AutoWired");
		this.experienciaServicio = experienciaServicio;
	}
	@Override
	public String getEntrenamiento() {
		return "Realizar 30 saques Autowired";
	}

	public int getExperiencia() {
		return experienciaServicio.getExperiencia();
	}
}
