<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="javaResources.model.CursoModel"%>
<%@ page import="javaResources.model.TurmaModel"%>
<%@ page import="javaResources.model.InstrutorModel"%>
<%@ page import="java.util.List" %>
<%@ page import="java.text.SimpleDateFormat" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	<title>Ver Instrutor | Cursos Lero Lero</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link rel="stylesheet" href="webResources/css/bootstrap.css">
	<link rel="stylesheet" href="webResources/css/style.css">
</head>

<body>
	<c:import url="../../include/Header.jsp" />

	<section class="instrutor py-5">
		<div class="container">
            <div class="mb-3 text-center">
                <span class="h6 uppercase">Instrutor</span>
                <h2 class="display-4 text-primary">${ instrutor.nome }</h2>
            </div>
            
            <div class="row">
            	<div class="col-md-6 col-12">
            		<h3>Dados pessoais</h3>
            		<p>E-mail: <span>${ instrutor.email }</span></p>
            		<p>Experiência: <span>${ instrutor.experiencia }</span></p>
            		<% if(session.getAttribute("idInstrutor") == request.getAttribute("id")) { %>
            			<p>Login: <span>${ instrutor.login }</span></p>
            			<p>Senha: <span>${ instrutor.senha }</span></p>
            			<a href="/cursosLeroLero/LogicaServlet?logica=MostrarInstrutorLogica&id=${ id }" class="btn btn-primary btn-sm">Alterar</a>
            		<% } %>
            	</div>
            	<div class="col-md-6 col-12">
            		<h3>Turmas</h3>
            		<%for(TurmaModel turma : new TurmaModel().listarTodasTurmasModel()) { 
						CursoModel curso = new CursoModel().listarCursoPorIdModel(turma.getIdCurso());
						String cursoNome = curso.getNome();
						String dataInicioString = new SimpleDateFormat("dd/MM/yyyy").format(turma.getDataInicio());
						String dataFinalString = new SimpleDateFormat("dd/MM/yyyy").format(turma.getDataFinal());
						InstrutorModel instrutor = new InstrutorModel().listarInstrutorPorIdModel(turma.getIdInstrutor());
						int valorReceber = turma.getCargaHoraria() * instrutor.getValorHora();
					%>
						<p><% out.println(cursoNome); %>: <% out.println(dataInicioString); %> - <% out.println(dataFinalString); %></p>
						<% if(session.getAttribute("idInstrutor") == request.getAttribute("id")) { %>
							<p>Valor a receber: <% out.println(valorReceber); %></p>
						<% } %>
						<div class="border-bottom"></div>
					<% } %>
            	</div>
            </div>
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

	<script type="text/javascript" src="webResources/js/jquery.min.js"></script>
	<script type="text/javascript" src="webResources/js/popper.min.js"></script>
	<script type="text/javascript" src="webResources/js/bootstrap.js"></script>
</body>
</html>