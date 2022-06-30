package com.ejemplo;

public interface Entrenador {
	public abstract String getEntrenamiento();
	// nuevo m�todo para obtener la experiencia 
	//a partir del servicio que se inyectar�
	public abstract int getExperiencia();
	
	public String getEmail();
	public void setEmail(String email);
	public String getEquipo();
	public void setEquipo(String equipo);
	
	public void init();
	public void destroy();
}
