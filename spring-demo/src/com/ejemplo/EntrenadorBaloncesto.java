package com.ejemplo;

import org.springframework.beans.factory.annotation.Value;


//@Component("entrenadorBaloncesto")
public class EntrenadorBaloncesto implements Entrenador {
		
	//Contructor por defecto
	public EntrenadorBaloncesto() {
		System.out.println("Contructor por defecto");
	}
	
	
	// constructor con el servicio inyectado
	public EntrenadorBaloncesto(ExperienciaServicio experienciaServicio) {
		System.out.println("Inyecci�n en el constructor Beans");
		this.experienciaServicio = experienciaServicio;
	}
	
	//El constructor espera recibir los valores de email y equipo 
	//cargados desde el archivo properties
	public EntrenadorBaloncesto(String email, String equipo) {
		this.email = email;
		this.equipo = equipo;
	}
	@Override
	public String getEntrenamiento() {
		return "Realizar 30 tiros a canasta del bean";
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
	@PostConstruct
	public void init() {
		
		System.out.println("Inicializaci�n baloncesto");
		
	}
	@PreDestroy
	public void destroy() {

		System.out.println("Destrucci�n baloncesto");
		
	}
	
	private ExperienciaServicio experienciaServicio;
	
	@Value("${email}")
	private String email;
	
	@Value("${equipo}")
	private String equipo;
}
