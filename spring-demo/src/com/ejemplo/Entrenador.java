package com.ejemplo;

public interface Entrenador {
	public abstract String getEntrenamiento();
	// nuevo método para obtener la experiencia 
	//a partir del servicio que se inyectará
	public abstract int getExperiencia();
	
	public String getEmail();
	public void setEmail(String email);
	public String getEquipo();
	public void setEquipo(String equipo);
	
	public void init();
	public void destroy();
}
