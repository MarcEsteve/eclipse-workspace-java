package com.demo.mvc;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controlador {
		
	// http://localhost:8080/mostrarFormulario
	/*@RequestMapping("/mostrarFormulario")
	public String mostrarFormulario() {
	// /WEB-INF/views/formulario-hello.jsp
		return "formulario-hola";
	}*/
	// http://localhost:8080/procesarFormulario
	/*@RequestMapping("/procesarFormulario")
	public String procesarFormulario(HttpServletRequest request, Model model) {
	// /WEB-INF/views/hello.jsp
		// se extrae el valor del atributo name del campo del formulario formulario
		String nombre = request.getParameter("nombre");
		// si el usuario no ha introducido ningún valor (null), entonces se iguala a una
		//cadena vacía
		String mensaje = (nombre == null) ? "undefined" : nombre.toUpperCase();
		/*String mensaje="";
		if (nombre==null) {
			mensaje="undefined";
		} else {
			mensaje=nombre.toUpperCase();
		}
		if (nombre==null) {
			System.out.println("No hay nombre");
		} else {
			System.out.println("El valor enviado por el usuario es " + mensaje);
		}*/
		//Siempre tendrá valor, nunca será NULL
		
		/*System.out.println("El valor enviado por el usuario es " + mensaje);
		// crear un nuevo elemento en el modelo
		model.addAttribute("mensaje", mensaje);	
		return "hola";
	}*/
		
	@RequestMapping
	public String muestraPagina() {
		
		return "paginaEjemplo";
	
		
	}
	// para peticiones GET en la ruta /formulario
	@GetMapping("/formulario")
	public String mostrarFormulario() {
		return "formulario-hola";
	}
	// para peticiones POST en la ruta /formulario
	@PostMapping("/formulario")
	public String procesarFormulario(HttpServletRequest request, Model model) {
		String nombre = request.getParameter("nombre");
		String mensaje = (nombre == null) ? "undefined" : nombre.toUpperCase();
		System.out.println("(CONSOLA - CONTROLADOR)El valor enviado por el usuario es " + mensaje);
		model.addAttribute("mensaje", mensaje);
		return "hola";
	}
}
