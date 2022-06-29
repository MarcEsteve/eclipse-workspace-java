package com.autowired;

public class MainSpring {

	public static void main(String[] args) {
		
		ExperienciaServicio experienciaServicio;
		
		Entrenador entrenador= new EntrenadorFutbol("mientrenador");
		System.out.println(entrenador.getExperiencia());
	}

}
