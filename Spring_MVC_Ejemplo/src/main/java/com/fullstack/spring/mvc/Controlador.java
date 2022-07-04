package com.fullstack.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controlador {

		@RequestMapping
		public String muestraPagina() {
			return "paginaEjemplo";
		}
		// http://localhost:8080/mostrarFormulario
		@RequestMapping("/mostrarFormulario")
		public String mostrarFormulario() {
			// /WEB-INF/vista/formulario-hola.jsp
			return "formulario-hola";
		}
		// http://localhost:8080/procesarFormulario
		@RequestMapping("/procesarFormulario")
		public String procesarFormulario(
				HttpServletRequest request, Model model) {
			// se extrae el valor del atributo name del 
			//campo del formulario formulario
			String nombre = request.getParameter("nombre");
			// si el usuario no ha introducido ningún valor 
			//(null), entonces se iguala a una cadena vacía
			String mensaje = (nombre == null) ? ""
					+ "undefined" : nombre.toUpperCase();
			System.out.println("El valor enviado por el "
					+ "usuario es " + mensaje);
			// crear un nuevo elemento en el modelo
			model.addAttribute("mensaje", mensaje);
			
			// /WEB-INF/vista/hola.jsp
			return "hola";
		}
}
