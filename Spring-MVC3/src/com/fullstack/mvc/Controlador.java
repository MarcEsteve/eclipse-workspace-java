package com.fullstack.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controlador{
	//Este método gestionará todas los tipos de 
	//peticiones (GET, POST...) en la ruta /
	@RequestMapping("/")
	public String index() {
		//Esto devolverá el contenido de la 
		//plantilla /WEB-INF/vista/index.jsp
		return "index";
	}
}