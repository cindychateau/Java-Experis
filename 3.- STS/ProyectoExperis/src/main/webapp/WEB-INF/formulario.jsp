<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registro</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>Registra tu usuario</h1>
		<form action="/registrarme" method="POST">
			<div>
				<label>Nombre</label>
				<input type="text" name="nombre" class="form-control"  >
			</div>
			<div>
				<label>E-mail</label>
				<input type="email" name="email" class="form-control" >
			</div>
			<input type="submit" value="Enviar Información" class="btn btn-success mt-3" >
		</form>
	</div>
</body>
</html>