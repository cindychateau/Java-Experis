<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Editar Usuario</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>Editar Usuario</h1>
		<form:form action="/actualizar/${usuario.id}" method="POST" modelAttribute="usuario" >
			<!--  Sobreescribimos el method. Petición sea PUT -->
			<input type="hidden" name="_method" value="PUT" >
			<div>
				<form:label path="nombre" >Nombre</form:label>
				<form:input path="nombre" class="form-control" />
				<form:errors path="nombre" class="text-danger" />
			</div>
			<div>
				<form:label path="apellido" >Apellido</form:label>
				<form:input path="apellido" class="form-control" />
				<form:errors path="apellido" class="text-danger" />
			</div>
			<div>
				<form:label path="email" >E-mail</form:label>
				<form:input path="email" class="form-control" />
				<form:errors path="email" class="text-danger" />
			</div>
			<div>
				<form:label path="salon">Salón</form:label>
				<form:select path="salon" class="form-select">
					<c:forEach items="${salones}" var="salon">
						<form:option value="${salon.id}">${salon.nombre}</form:option>
					</c:forEach>
				</form:select>
			</div>
			<input type="submit" value="Guardar Usuario" class="btn btn-primary mt-3" >
		</form:form>
	</div>
</body>
</html>