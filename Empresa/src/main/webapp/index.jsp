
<%@ page import = "java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<div id="container">
	<ul>
			<form action="EmpleadosLista" method="post">
				<li>Ver todos los empleados <input type="submit" value="mostrar"></li>
			</form>
			<form action="MostrarSalario" method="POST">
				<li>Ver salario de un empleado especifico <input type="text" name="dni_salario"><input type="submit"></li>
			</form>
			
			<li>Submenu de edicion</li>
			<form action="ActualizaNominas" method="POST">
				<li>Recalcular y actualizar sueldo de un empleado<input type="text" name="salario_actualizado"><input type="submit"></li>
			</form>
			<form action="MostrarEmpleado" method="post">
				<li>Modificar empleado  
					<input type="text" name="dni">					
					<input type="submit" value="Modificar Empleado">
				</li>
			</form>
			<li>Recalcular y actualizar sueldos de todos los empleados</li>
			<li>Realizar copia de seguridad de la BBDD en fichero</li>
			<li>Añadir empleado<a href="AltaEmpleados.jsp"><button type="submit">Alta Empleado</button></a></li> 
		</ul>	
		
</div>
	
		

</body>
</html>