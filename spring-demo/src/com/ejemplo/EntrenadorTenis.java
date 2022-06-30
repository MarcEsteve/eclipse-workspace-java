package com.ejemplo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//import org.springframework.stereotype.Component;

@Component("mientrenadortenis")
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
