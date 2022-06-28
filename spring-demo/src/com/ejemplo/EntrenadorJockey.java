package com.ejemplo;

//import org.springframework.stereotype.Component;

public class EntrenadorJockey implements Entrenador {
	private ExperienciaServicio experienciaServicio;
	@Override
	public String getEntrenamiento() {
		return "30 pases con el stick";
	}
	@Override
	public int getExperiencia() {
		return experienciaServicio.getExperiencia();
	}
	// inyección del servicio en un método setter
	public void setExperienciaServicio(ExperienciaServicio 
										experienciaServicio) {
		System.out.println("Inyección en un método setter");
		this.experienciaServicio = experienciaServicio;
	}
}