<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pokemones</title>
</head>
<body>
	<h1>Pokemones</h1>
	<c:forEach items="${respuesta.results}" var="pokemon">
		<p>${pokemon.name}</p>
		<a href="/pokemon/${pokemon.name}">Ver detalle</a>
		<hr>
	</c:forEach>
</body>
</html>