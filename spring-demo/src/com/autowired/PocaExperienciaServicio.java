package com.autowired;

import org.springframework.stereotype.Component;

@Component
public class PocaExperienciaServicio implements ExperienciaServicio {

	//Clase se convierte en Bean
	public int getExperiencia() {
		return 3;
	}

}
