<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Spring MVC</title>
	</head>
	<body>
		<!-- el formulario enviar� los datos a la url /procesarFormulario a trav�s del m�todo
		GET de HTTP -->
		<form action="formulario" method="POST">
			<!-- caja de texto donde se escribir� el nombre -->
			<input type="text" name="nombre" placeholder="Escribe tu nombre" />
			<!-- bot�n para enviar la informaci�n -->
			<input type="submit" />
		</form>
	</body>
</html>