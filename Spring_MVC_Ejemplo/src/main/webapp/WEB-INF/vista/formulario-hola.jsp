<%@ page language="java" contentType="text/html; 
charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario de prueba HOLA</title>
</head>
<body>
<!-- el formulario enviar� los datos a la url 
/procesarFormulario a trav�s del m�todo
GET de HTTP -->
<form action="procesarFormulario" method="GET">

	<!-- caja de texto donde se escribir� el nombre -->
	<label>NOMBRE:</label>
	<input type="text" name="nombre" placeholder="
	Tu nombre..." />
	<br>
	<label>CORREO:</label>
	<input type="email"  name="email" placeholder="
	Tu correo..."/>
	<br>
	<!-- bot�n para enviar la informaci�n -->
	<input type="submit" />

</form>
</body>
</html>