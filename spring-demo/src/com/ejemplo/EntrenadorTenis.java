package com.ejemplo;

//import org.springframework.stereotype.Component;

//@Component("mientrenadortenis")
public class EntrenadorTenis implements Entrenador {
	private ExperienciaServicio experienciaServicio;
	// constructor con el servicio inyectado
	public EntrenadorTenis(ExperienciaServicio experienciaServicio) {
		System.out.println("Inyección en el constructor");
		this.experienciaServicio = experienciaServicio;
	}
	@Override
	public String getEntrenamiento() {
		return "Realizar 30 saques";
	}

	@Override
	public int getExperiencia() {
		return experienciaServicio.getExperiencia();
	}
}
