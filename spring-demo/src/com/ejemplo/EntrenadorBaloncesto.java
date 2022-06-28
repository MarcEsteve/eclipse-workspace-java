package com.ejemplo;

import org.springframework.stereotype.Component;

@Component("mientrenadorbasket")
public class EntrenadorBaloncesto implements Entrenador {
	public String getEntrenamiento() {
		return "Lanzar 30 tiros a canasta";
	}

}
