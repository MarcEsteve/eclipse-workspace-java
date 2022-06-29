package com.ejemplo;

import org.springframework.stereotype.Component;

//La clase se convierte en un BEAN
@Component
public class AlgoExperienciaServicio implements ExperienciaServicio {
	public int getExperiencia() {
		return 2;
	}
}
