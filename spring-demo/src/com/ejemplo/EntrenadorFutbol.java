package com.ejemplo;

import org.springframework.stereotype.Component;

@Component("mientrenadorfutbol")
public class EntrenadorFutbol implements Entrenador {

	public String getEntrenamiento() {
		return "Correr durante 30 minutos";
	}
}
