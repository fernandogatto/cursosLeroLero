<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="javaResources.model.CursoModel"%>
    <%@ page import="javaResources.model.InstrutorModel"%>
    <%@ page import="java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Alterar Turma | Cursos Lero Lero</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link rel="stylesheet" href="webResources/css/bootstrap.css">
	<link rel="stylesheet" href="webResources/css/style.css">
</head>

<body>
	<c:import url="../../include/Header.jsp" />
	
	<section>
		<div class="container py-5">
			<h1 class=" text-primary display-4">Alterar turma</h1>
			<p class="lead">Altere os dados!</p>
			<form class="py-3" name='novoturma' action="LogicaServlet" method="POST">
				<input type="hidden" name="logica" value="AlterarTurmaLogica">
				<input type="hidden" name="id" value="${ id }">
				<div class="form-group">
					<label for="exampleInputCPF">ID do instrutor *</label>
					<select name='instrutores_id'>
					<% for(InstrutorModel instrutor : new InstrutorModel().listarTodosInstrutoresModel()) { %>
						<option name="instrutores_id" value="<%out.print(instrutor.getId()); %>"><%out.print(instrutor.getNome()); %></option>
					<%} %> 
					</select>
				</div>
				<div class="form-group">
					<label for="exampleInputCPF">ID do curso *</label>
					<select name='cursos_id'>
					<% for(CursoModel curso : new CursoModel().listarTodosCursosModel()) { %>
						<option name="cursos_id" value="<%out.print(curso.getId()); %>"><%out.print(curso.getNome()); %></option>
					<%} %> 
					</select>
				</div>
				<div class="form-group data">
					<label for="exampleInputPhone">Data de início *</label>
					<input type="text" class="form-control" id="date" name='data_inicio' aria-describedby="Digite quando irá começar" placeholder="Digite quando irá começar" rows="10" value="${ dataInicio }">
					<p style="color: #a0a0a0">Digite a data nesse formato: 01/01/2010.</p>
				</div>
				<div class="form-group data">
					<label for="exampleInputEmail1">Data de fim *</label>
					<input type="text" class="form-control" id="date" name='data_final' aria-describedby="Digite quando irá terminar" placeholder="Digite quando irá terminar" value="${ dataInicio }">
					<p style="color: #a0a0a0">Digite a data nesse formato: 01/01/2010.</p>
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">Carga horária</label>
					<input type="number" class="form-control" id="exampleInputPassword1" name='carga_horaria' 
						placeholder="Digite a carga horária do seu curso">
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
						<li><a href="Index.jsp">Home</a></li>
						<li><a href="Sobre.jsp">Sobre</a></li>
						<li><a href="LogicaServlet?logica=ListaCursosLogica">Cursos</a></li>
						<li><a href="Comentarios.jsp">Comentários</a></li>
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
						<li><a href="#" class="btn btn-outline-secondary btn-block btn-sm mb-2"
								style="max-width: 140px;">Facebook</a></li>
						<li><a href="#" class="btn btn-outline-secondary btn-block btn-sm mb-2"
								style="max-width: 140px;">Linkedin</a></li>
						<li><a href="#" class="btn btn-outline-secondary btn-block btn-sm mb-2"
								style="max-width: 140px;">Youtube</a></li>
					</ul>
				</div>
			</div>
		</div>

		<div class="bg-primary text-center py-3">
			<p class="mb-0">Cursos Lero Lero &copy; 2020. Nenhum direito reservado.</p>
		</div>
	</footer>

	<script type="text/javascript" src="webResources/js/jquery.min.js"></script>
	<script type="text/javascript" src="webResources/js/popper.min.js"></script>
    <script type="text/javascript" src="webResources/js/bootstrap.js"></script>
    <script type="text/javascript" src="webResources/js/jquery.mask.min.js"></script>
    <script type="text/javascript" src="webResources/js/masks-input.js"></script>
	<script type="text/javascript" src="webResources/js/jquery-validation/dist/jquery.validate.min.js"></script>
	<script type="text/javascript" src="webResources/js/validation-curso.js"></script>
</body>
</html>