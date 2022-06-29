package com.ejemplo;

//import org.springframework.stereotype.Component;

//@Component("mientrenadorbasket")
public class EntrenadorBaloncesto implements Entrenador {
	
	protected String email;
	protected String equipo;
	
	private ExperienciaServicio experienciaServicio;
	// constructor con el servicio inyectado
	public EntrenadorBaloncesto(ExperienciaServicio experienciaServicio) {
		System.out.println("Inyecci�n en el constructor");
		this.experienciaServicio = experienciaServicio;
	}
	@Override
	public String getEntrenamiento() {
		return "Realizar 30 tiros a canasta";
	}
	
	@Override
	public int getExperiencia() {
		// TODO Auto-generated method stub
		return experienciaServicio.getExperiencia();
	}
	@Override
	public String getEmail() {
		return email;
	}
	@Override
	public void setEmail(String email) {
		System.out.println("Inyecci�n de un valor literal en un m�todo setter: " 
				+ email);
		this.email=email;
	}
	@Override
	public String getEquipo() {
		return equipo;
	}
	@Override
	public void setEquipo(String equipo) {
		System.out.println("Inyecci�n de un valor literal en un m�todo setter: " 
				+ equipo);
		this.equipo=equipo;
		
	}

}
