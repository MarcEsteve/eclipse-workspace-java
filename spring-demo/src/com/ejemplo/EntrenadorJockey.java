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
	@Override
	public String getEmail() {
		return email;
	}
	@Override
	public void setEmail(String email) {
		System.out.println("Inyecci�n de un valor literal en un m�todo setter: " + email);
		this.email=email;
	}
	@Override
	public String getEquipo() {
		return equipo;
	}
	@Override
	public void setEquipo(String equipo) {
		System.out.println("Inyecci�n de un valor literal en un m�todo setter: " + equipo);
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