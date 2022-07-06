package com.demo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.server.ResponseStatusException;

@ControllerAdvice
public class ManejadorExcepciones {
	// maneja todo tipo de excepciones (Exception.class)
	/*@ExceptionHandler(Exception.class)
	public String manejadorExcepcion(HttpServletRequest req, ResponseStatusException
	ex){
		System.out.println("Manejador de excepciones");
		// redirige a la p�gina error.jsp
		return "error";
	}*/
	// maneja solamente la excepci�n ResponseStatusException
	/*@ExceptionHandler(ResponseStatusException.class)
	public String manejadorResponseStatusException(HttpServletRequest req,
	ResponseStatusException ex){
		System.out.println("Manejador de la excepci�n ResponseStatusException");
		// redirige a la p�gina error.jsp
		return "error";
	}*/
	@RequestMapping(value = "errors", method = RequestMethod.GET)
	public String renderErrorPage(HttpServletRequest httpRequest, Model model) {
		String msg = "";
		// obtiene el c�digo HTTP
		int codigo = (Integer) httpRequest.getAttribute("javax.servlet.error.status_code");
		switch (getErrorCode(httpRequest)) {
			case 400: {
				msg = "C�digo de estado: 400 - Petici�n err�nea";
				break;
			}
			case 401: {
				msg = "C�digo de estado: 401 - No autorizado";
				break;
			}
			case 404: {
				msg = "C�digo de estado: 404 - No encontrado";
				break;
			}
			case 500: {
				msg = "C�digo de estado: 500 - Error interno";
				break;
			}
		}
		System.out.println("msg");
		model.addAttribute("msg", msg);
		return "error";
	}
}