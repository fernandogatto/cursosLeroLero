<%@ page import="javaResources.model.CursoModel"%>
<%@ page import="javaResources.model.InstrutorModel"%>
<%@ page import="javaResources.model.TurmaModel"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.time.LocalDate" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	<title>Cursos Lero Lero</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link rel="stylesheet" href="webResources/css/bootstrap.css">
	<link rel="stylesheet" href="webResources/css/style.css">
</head>

<body>
	<c:import url="include/Header.jsp" />

	<section class="intro bg-light">
		<div class="d-flex flex-row justify-content-center h-100 content">
			<div class="intro-item align-self-center">
				<h1 class="display-3 mb-3">Cursos Lero Lero</h1>
				<p class="lead">Onde a união cria laços e estabelece um novo futuro</p>
				<a class="btn btn-primary btn-lg" href="/cursosLeroLero/Sobre.jsp">Saiba mais</a>
			</div>
			<div class="intro-item align-self-end">
				<img src="webResources/img/estudante.png" alt="estudante">
			</div>
		</div>
	</section>

	<section class="quem-somos py-5">
		<div class="container">
			<div class="mb-3 text-center">
				<span class="h6 uppercase">Um pouco sobre nós</span>
				<h2 class="display-4 text-primary">Quem Somos</h2>
			</div>

			<p class="text-center">Lorem ipsum dolor sit amet consectetur adipisicing elit. Qui, delectus. Tempore
				doloremque nam voluptas cupiditate earum sequi voluptates, ut facere ullam totam. Voluptatem quia quae
				error amet, ratione quos iusto?</p>

			<div class="row">
				<div class="col-lg-4 col-md-12 mb-3 text-center">
					<div class="icone d-flex justify-content-center">
						<img src="webResources/img/material.png" alt="material">
					</div>
					<h3>Material completo</h3>
					<p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Atque, quod maiores. Esse unde ipsum
						minus eveniet est ratione.</p>
				</div>

				<div class="col-lg-4 col-md-12 mb-3 text-center">
					<div class="icone d-flex justify-content-center">
						<img src="webResources/img/equipe.png" alt="equipe">
					</div>
					<h3>Aulas presenciais</h3>
					<p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Atque, quod maiores. Esse unde ipsum
						minus eveniet est ratione.</p>
				</div>

				<div class="col-lg-4 col-md-12 mb-3 text-center">
					<div class="icone d-flex justify-content-center">
						<img src="webResources/img/certificado.png" alt="certificado">
					</div>
					<h3>Certificado</h3>
					<p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Atque, quod maiores. Esse unde ipsum
						minus eveniet est ratione.</p>
				</div>

				<div>
				<a class="btn btn-primary mx-auto" href="/cursosLeroLero/LogicaServlet?logica=ListaInstrutoresLogica">Conheça nossos instrutores</a>
				</div>
			</div>
		</div>
	</section>

	<section class="text-center text-white" id="uniao">
		<div class="mask-opacity"></div>
		<div class="container">
			<p id="frase" class="display-4 font-italic">Se quer ir rápido, vá sozinho. Se quer ir longe, vá em grupo.</p>
			<p>Provérbio africano</p>
		</div>
	</section>

	<section class="cursos py-5">
		<div class="container">
			<div class="mb-3 text-center">
				<span class="h6 uppercase">O que ensinamos</span>
				<h2 class="display-4 text-primary">Nossas Turmas</h2>
			</div>
			
			<div class="row">
				<% for(TurmaModel turma : new TurmaModel().listarTodasTurmasModel()) { 
					CursoModel curso = new CursoModel().listarCursoPorIdModel(turma.getIdCurso());
					String cursoNome = curso.getNome();
					InstrutorModel instrutor = new InstrutorModel().listarInstrutorPorIdModel(turma.getIdInstrutor());
					String instrutorNome = instrutor.getNome();
					Integer turmaId = turma.getId();
					
					Date dataInicio = turma.getDataInicio();
					String dataInicioString = new SimpleDateFormat("dd/MM/yyyy").format(dataInicio);
					
					Date dataFinal = turma.getDataFinal();
					String dataFinalString = new SimpleDateFormat("dd/MM/yyyy").format(dataFinal);
					
					DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
					LocalDate localDate = LocalDate.now();
					String dateString = (dtf.format(localDate));
					Date dateNow = new SimpleDateFormat("dd/MM/yyyy").parse(dateString);
					//d1.compareTo(d2) "greater than 0" if date1 is after date2 
				%>	 	
				<% if(dataFinal.compareTo(dateNow) >= 0 ) { %>
					<div class="col-lg-4 col-md-6 col-12 my-2">
						<div class="card">
							<img src="webResources/img/curso-js.jpg" alt="Turma" class="card-img-top">
							<div class="card-body">
								<h3 class="card-title h5"><%out.print(cursoNome);%></h3>
								<p class="card-title h5"><%out.print(instrutorNome);%></p>
								<p class="card-text">carga horária: <span><%out.print(turma.getCargaHoraria()); %></span> horas</p>
								<p class="card-text">Início: <span><%out.print(dataInicioString); %></span></p>
								<p class="card-text">Fim: <span><% out.print(dataFinalString); %></span></p>
								<% if(session.getAttribute("aluno") != null) { %>
								<a href="/cursosLeroLero/LogicaServlet?logica=InserirMatriculaLogica&id=<%out.print(turma.getId());%>&alunoId=<%out.print(session.getAttribute("idAluno"));%>" class="btn btn-primary btn-sm">Inscreva-se</a>
								<% } %>
								<a href="/cursosLeroLero/LogicaServlet?logica=VerTurmaLogica&id=<%out.print(turma.getId());%>" class="btn btn-primary btn-sm">Ver</a>
							</div>
						</div>
					</div>
				<% } %>
				<%} %>	
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