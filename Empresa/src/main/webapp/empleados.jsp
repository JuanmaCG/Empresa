<%@ page import = "bbdd.*" import="java.util.List" import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	
		
	<table border="1px solid black">
		<tr>
			<td>Nombre: </td>
			<td>DNI: </td>
			<td>Sexo: </td>
			<td>Categoria: </td>
			<td>Años: </td>
		</tr>
		<c:forEach items="${empleados}" var="empleado">
	        <tr>
	            <td><c:out value="${empleado.nombre}"></c:out></td>
	            <td><c:out value="${empleado.dni}"></c:out></td>
	            <td><c:out value="${empleado.sexo}"></c:out></td>
	            <td><c:out value="${empleado.categoria}"></c:out></td>
	            <td><c:out value="${empleado.anyos}"></c:out></td>
	            
	        </tr>
    	</c:forEach>
		
		
		
	</table>
	
	<a href="index.jsp"><button type="submit">Pagina principal</button></a>
</body>
</html>