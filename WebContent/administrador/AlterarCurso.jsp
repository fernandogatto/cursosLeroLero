<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Alterar Curso | Cursos Lero Lero</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link rel="stylesheet" href="../webResources/css/bootstrap.css">
	<link rel="stylesheet" href="../webResources/css/style.css">
</head>

<body>
	<c:import url="../include/HeaderAdmin.jsp" />

	<section>
		<div class="container py-5">
			<h1 class=" text-primary display-4">Alterar curso</h1>
			<p class="lead">Altere os dados!</p>
			<form class="py-3" name='novocurso' action="AdminServlet" method="POST">
				<input type="hidden" name="logica" value="AlterarCursoAdmin">
				<input type="hidden" name="id" value="${ id }">
				<div class="form-group">
					<label for="nome">Nome completo *</label>
					<input type="text" class="form-control" id="nomeCurso" name='nome' aria-describedby="Digite o nome" placeholder="Digite o nome" value="${ curso.nome }">
				</div>
				<div class="form-group">
					<label for="email">Requisito *</label>
					<input type="text" class="form-control" id="requisitoCurso" name="requisito" aria-describedby="Digite o requisito" placeholder="Digite o requisito" value="${ curso.requisito }">
				</div>
				<div class="form-group">
					<label for="exampleInputPhone">Ementa *</label>
					<input type="text" class="form-control" id="ementaCurso" name="ementa" aria-describedby="Digite a ementa" placeholder="Digite a ementa" rows="10" value="${ curso.ementa }"></input>
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1">Carga Horaria *</label>
					<input type="text" class="form-control" id="cargaHorariaCurso" name='carga_horaria' aria-describedby="Digite a carga horária" placeholder="Digite a carga horária" value="${ curso.cargaHoraria }">
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">Preço *</label>
					<input type="text" class="form-control" id="precoCurso" name="preco" aria-describedby="Digite o preço" placeholder="Digite o preço" value="<% out.println(request.getAttribute("precoCurso")); %>">
				</div>
				<button type="submit" class="btn btn-primary my-3">Salvar</button>
			</form>
		</div>
	</section>

	<footer class="bg-dark text-white">
		<div class="container py-4">
			<div class="row">
				<div class="col-lg-4 col-12">
					<h4 class="h6 uppercase">Quem somos</h4>
					<p class="text-secondary">Lorem ipsum dolor sit amet consectetur adipisicing elit.</p>
				</div>

				<div class="col-lg-3 col-md-4 col-sm-6 col-12">
					<h4 class="h6 uppercase">Páginas</h4>
					<ul class="list-unstyled">
						<li><a href="/cursosLeroLero/Index.jsp">Home</a></li>
						<li><a href="/cursosLeroLero/Sobre.jsp">Sobre</a></li>
						<li><a href="/cursosLeroLero/LogicaServlet?logica=ListaInstrutoresLogica">Instrutores</a></li>
						<li><a href="/cursosLeroLero/Comentarios.jsp">Comentários</a></li>
					</ul>
				</div>

				<div class="col-lg-3 col-md-4 col-sm-6 col-12">
					<h4 class="h6 uppercase">Fale conosco</h4>
					<ul class="list-unstyled text-secondary">
						<li>contato@integrado.com.br</li>
						<li>(21) 99999-9999</li>
					</ul>
				</div>

				<div class="col-lg-2 col-md-4 col-12" id="rede-social">
					<h4 class="h6 uppercase">Redes sociais</h4>
					<ul class="list-unstyled">
						<li><a href="#" class="btn btn-outline-secondary btn-block btn-sm mb-2" style="max-width: 140px;">Facebook</a></li>
						<li><a href="#" class="btn btn-outline-secondary btn-block btn-sm mb-2" style="max-width: 140px;">Linkedin</a></li>
						<li><a href="#" class="btn btn-outline-secondary btn-block btn-sm mb-2" style="max-width: 140px;">Youtube</a></li>
					</ul>
				</div>
			</div>
		</div>

		<div class="bg-primary text-center py-3">
			<p class="mb-0">Cursos Lero Lero &copy; 2020. Nenhum direito reservado.</p>
		</div>
	</footer>

	<script type="text/javascript" src="../webResources/js/jquery.min.js"></script>
	<script type="text/javascript" src="../webResources/js/popper.min.js"></script>
    <script type="text/javascript" src="../webResources/js/bootstrap.js"></script>
    <script type="text/javascript" src="../webResources/js/jquery.mask.min.js"></script>
    <script type="text/javascript" src="../webResources/js/masks-input.js"></script>
	<script type="text/javascript" src="../webResources/js/jquery-validation/dist/jquery.validate.min.js"></script>
	<script type="text/javascript" src="../webResources/js/validation-instrutor.js"></script>
</body>
</html>