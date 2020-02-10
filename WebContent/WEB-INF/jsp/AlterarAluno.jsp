<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Alterar Aluno | Cursos Lero Lero</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link rel="stylesheet" href="webResources/css/bootstrap.css">
	<link rel="stylesheet" href="webResources/css/style.css">
</head>

<body>
	<header>
		<nav class="navbar navbar-expand-md navbar-light bg-light fixed-top py-3">
			<div class="container">
				<a class="navbar-brand" href="Index.jsp"><img src="webResources/img/logo-integrado.png" alt="logo"></a>
				<button class="navbar-toggler" type="button" data-toggle="collapse"
					data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
	
				<div class="collapse navbar-collapse" id="navbarSupportedContent">
					<ul class="navbar-nav ml-auto">
						<li class="nav-item">
							<a class="nav-link" href="Index.jsp">Home</a>
						</li>
						<li class="nav-item">
							<a class="nav-link" href="Sobre.jsp">Sobre</a>
                        </li>
                        <li class="nav-item">
							<a class="nav-link" href="LogicaServlet?logica=ListaInstrutoresLogica">Instrutores</a>
                        </li>
                        <li class="nav-item">
							<a class="nav-link" href="LogicaServlet?logica=ListaAlunosLogica">Alunos</a>
                        </li>
                        <li class="nav-item">
							<a class="nav-link" href="Comentarios.jsp">Comentários</a>
                        </li>
                        <li class="nav-item">
							<a class="nav-link" href="Tabelas.jsp">Tabelas</a>
                        </li>
                    	<li class="nav-item dropdown">
							<a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
								data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
								Cursos
							</a>
							<div class="dropdown-menu" aria-labelledby="navbarDropdown">
								<a class="dropdown-item" href="Cursos.jsp">Cursos</a>
								<div class="dropdown-divider"></div>
								<a class="dropdown-item" href="#">HTML e CSS</a>
								<a class="dropdown-item" href="#">Javascript</a>
								<a class="dropdown-item" href="#">Bootstrap</a>
								<a class="dropdown-item" href="#">WordPress</a>
							</div>
                        </li>
                        <li class="nav-item">
							<a class="nav-link" href="Login.jsp">Login</a>
						</li>
						<li class="nav-item">
							<a class="btn btn-outline-primary" href="Registro.jsp">Cadastre-se</a>
						</li>
					</ul>
				</div>
			</div>
		</nav>
	</header>
	<section>
		<div class="container py-5">
			<h1 class=" text-primary display-4">Alterar aluno</h1>
			<p class="lead">Altere os dados!</p>
			<form class="py-3" name='novoaluno' action="LogicaServlet" method="POST">
				<input type="hidden" name="logica" value="AlterarAlunoLogica">
				<input type="hidden" name="id" value="${ id }">
				<div class="form-group">
					<label for="cpf">CPF*</label>
					<input type="text" class="form-control" id="cpfAluno" name='cpf' aria-describedby="nameHelp"
						placeholder="Digite o CPF" value="${ aluno.cpf }">
				</div>
				<div class="form-group">
					<label for="nome">Nome*</label>
					<input type="text" class="form-control" id="nomeAluno" name='nome' aria-describedby="nameHelp"
						placeholder="Digite o nome" value="${ aluno.nome }">
				</div>
				<div class="form-group">
					<label for="email">Email *</label>
					<input type="email" class="form-control" id="emailAluno" name="email" aria-describedby="cpfHelp"
						placeholder="Digite seu email" value="${ aluno.email }">
				</div>
				<div class="form-group">
					<label for="celular">Celular *</label>
					<input type="text" class="form-control" id="celularAluno" name="celular" aria-describedby="cpfHelp"
						placeholder="Digite seu celular" value="${ aluno.celular }">
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1">Login *</label>
					<input type="text" class="form-control" id="loginAluno" name='login' aria-describedby="emailHelp"
						placeholder="Digite seu nome para login" value="${ aluno.login }">
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">Senha *</label>
					<input type="password" class="form-control" id="senhaAluno" name="senha"
						placeholder="Digite sua senha" value="${ aluno.senha }">
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">Endereco *</label>
					<input type="text" class="form-control" id="enderecoInstrutor" name="endereco"
						placeholder="Digite seu endereço" value="${ aluno.endereco}">
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">Cidade *</label>
					<input type="text" class="form-control" id="cidadeAluno" name="cidade"
						placeholder="Digite sua cidade" value="${ aluno.cidade}">
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">Bairro *</label>
					<input type="text" class="form-control" id="bairroAluno" name="bairro"
						placeholder="Digite seu bairro" value="${ aluno.bairro}">
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">CEP *</label>
					<input type="text" class="form-control" id="cepAluno" name="cep"
						placeholder="Digite seu CEP" value="${ aluno.cep}">
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
						<li><a href="LogicaServlet?logica=ListaInstrutoresLogica">Instrutores</a></li>
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
	<script type="text/javascript" src="webResources/js/validation-instrutor.js"></script>
</body>
</html>