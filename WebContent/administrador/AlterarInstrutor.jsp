<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Alterar Aluno | Cursos Lero Lero</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link rel="stylesheet" href="../webResources/css/bootstrap.css">
	<link rel="stylesheet" href="../webResources/css/style.css">
</head>

<body>
	<c:import url="../include/Header.jsp" />
	
	<section>
		<div class="container py-5">
			<h1 class=" text-primary display-4">Alterar instrutor</h1>
			<p class="lead">Altere os dados!</p>
			<form class="py-3" name='novoinstrutor' action="AdminServlet" method="POST">
				<input type="hidden" name="logica" value="AlterarInstrutorAdmin">
				<input type="hidden" name="id" value="${ id }">
				<div class="form-group">
					<label for="nome">Nome completo *</label>
					<input type="text" class="form-control" id="nomeInstrutor" name='nome' aria-describedby="nameHelp"
						placeholder="Digite o nome" value="${ instrutor.nome }">
				</div>
				<div class="form-group">
					<label for="email">Email *</label>
					<input type="email" class="form-control" id="emailInstrutor" name="email" aria-describedby="cpfHelp"
						placeholder="Digite seu email" value="${ instrutor.email }">
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1">Login *</label>
					<input type="text" class="form-control" id="loginInstrutor" name='login' aria-describedby="emailHelp"
						placeholder="Digite seu nome para login" value="${ instrutor.login }">
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">Senha *</label>
					<input type="password" class="form-control" id="senhaInstrutor" name="senha"
						placeholder="Digite sua senha" value="${ instrutor.senha }">
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">Experiência *</label>
					<input type="text" class="form-control" id="experienciaInstrutor" name="experiencia"
						placeholder="Digite sua experiência profissional" value="${ instrutor.experiencia }">
				</div>
				<button type="submit" class="btn btn-primary my-3">Salvar</button>
			</form>
		</div>
	</section>

</body>
</html>