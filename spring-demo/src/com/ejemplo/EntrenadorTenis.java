package com.ejemplo;

import org.springframework.stereotype.Component;

@Component("mientrenadortenis")
public class EntrenadorTenis implements Entrenador {
	public String getEntrenamiento() {
		return "Realizar 30 saques";
	}
}
