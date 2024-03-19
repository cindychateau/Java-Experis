<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Nuevo Salon</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>Nuevo Salón</h1>
		<form:form action="/crear-salon" method="POST" modelAttribute="salon" >
			<div>
				<form:label path="nombre" >Nombre</form:label>
				<form:input path="nombre" class="form-control" />
				<form:errors path="nombre" class="text-danger" />
			</div>
			<input type="submit" value="Guardar" class="btn btn-info mt-3" >
		</form:form>
	</div>
</body>
</html>