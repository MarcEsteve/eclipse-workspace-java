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
	@Override
	public String getEmail() {
		return email;
	}
	@Override
	public void setEmail(String email) {
		System.out.println("Inyección de un valor literal en un método setter: " + email);
		this.email=email;
	}
	@Override
	public String getEquipo() {
		return equipo;
	}
	@Override
	public void setEquipo(String equipo) {
		System.out.println("Inyección de un valor literal en un método setter: " + equipo);
		this.equipo=equipo;
		
	}
	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
	protected String email;
	protected String equipo;
}