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
	// inyecci�n del servicio en un m�todo setter
	public void setExperienciaServicio(ExperienciaServicio 
										experienciaServicio) {
		System.out.println("Inyecci�n en un m�todo setter");
		this.experienciaServicio = experienciaServicio;
	}
}