<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Nuevo Usuario</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>Nuevo Usuario</h1>
		<form:form action="/crear-usuario" method="POST" modelAttribute="usuario" >
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