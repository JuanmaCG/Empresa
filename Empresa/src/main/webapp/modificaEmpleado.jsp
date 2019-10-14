<%@page import="laboral.Empleado"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set value="${empleado}" var="emp"></c:set>
	<form action="ModificarEmpleado" method="post">
		Nombre: <input type="text" value="${emp.nombre}" name="nombre"><br>
		Dni: <input type="text" value="${emp.dni}" name="dni"><br>
		Sexo: <input type="text" value="${emp.sexo}" name="sexo"><br>
		Categoria: <input type="number" value="${emp.categoria}" name="categoria"><br>
		Anyos: <input type="number" value="${emp.anyos}" name="anyos">
		<input type="submit" value="enviar">
	</form>

	<br><a href="index.jsp"><button type="submit">Pagina principal</button></a>
	
</body>
</html>