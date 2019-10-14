<%@ page import = "laboral.*" %>
<%@ page import = "bbdd.*" %>
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
	<c:choose>
		<c:when test="${salario > 0}" >
			<p>El salario del empleado con dni ${dni} es: ${salario} </p>
		</c:when>
		<c:otherwise>
			<% throw new Exception();  %>
		</c:otherwise>
	</c:choose>
		
		
		<a href="index.jsp"><button type="submit">Pagina principal</button></a>
</body>
</html>