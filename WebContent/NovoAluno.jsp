<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Novo Aluno | Cursos Lero Lero</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link rel="stylesheet" href="webResources/css/bootstrap.css">
	<link rel="stylesheet" href="webResources/css/style.css">
</head>

<body>
<header>
		<nav class="navbar navbar-expand-md navbar-light bg-light fixed-top py-3">
			<div class="container">
				<a class="navbar-brand" href="index.html"><img src="webResources/img/logo-integrado.png" alt="logo"></a>
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
							<a class="nav-link" href="Instrutores.jsp">Instrutores</a>
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
			<h1 class=" text-primary display-4">Novo aluno</h1>
			<p class="lead">Cadastre-se!</p>
			<form class="py-3" id="form-aluno" name='novoaluno' action="InsertAlunoServlet" method="POST">
				<div class="form-group">
					<label for="cpf">CPF*</label>
					<input type="text" class="form-control cpf" id="cpfAluno" name="cpf" aria-describedby="cpfHelp"	placeholder="Digite seu CPF">
				</div>
				<div class="form-group">
					<label for="nome">Nome*</label>
					<input type="text" class="form-control" id="nomeAluno" name="nome" aria-describedby="nameHelp" placeholder="Digite seu nome">
				</div>
				<div class="form-group">
					<label for="email">Email*</label>
					<input type="email" class="form-control" id="emailAluno" name="email" aria-describedby="emailHelp" placeholder="Digite seu email" rows="10">
				</div>
				<div class="form-group">
					<label for="celular">Celular*</label>
					<input type="text" class="form-control cellphone_with_ddd" id="celularAluno" name="celular" aria-describedby="phoneHelp" placeholder="Digite seu número de celular">
                </div>
				<div class="form-group">
					<label for="endereco">Endereço*</label>
					<input type="text" class="form-control" id="enderecoAluno" name="endereco" aria-describedby="addressHelp" placeholder="Digite seu endereço">
				</div>
				<div class="form-group">
					<label for="cidade">Cidade*</label>
					<input type="text" class="form-control" id="cidadeAluno" name="cidade" aria-describedby="cityHelp" placeholder="Digite sua cidade">
				</div>
				<div class="form-group">
					<label for="bairro">Bairro*</label>
					<input type="text" class="form-control" id="bairroAluno" name="bairro" aria-describedby="neighborhoodHelp" placeholder="Digite seu bairro">
				</div>
				<div class="form-group">
					<label for="cep">CEP*</label>
					<input type="text" class="form-control cep" id="cepAluno" name="cep" aria-describedby="cepHelp" placeholder="Digite seu CEP">
				</div>
				<div class="form-group">
					<label for="login">Login*</label>
					<input type="text" class="form-control" id="loginAluno" name="login" aria-describedby="loginHelp" placeholder="Digite seu usuário para login">
				</div>
				<div class="form-group">
					<label for="senha">Senha*</label>
					<input type="password" class="form-control" id="senhaAluno" name="senha" aria-describedby="passwordHelp" placeholder="Escolha uma senha">
				</div>
				
				<div class="form-group">
					<label for="comentario">Comentario*</label>
					<input type="text" class="form-control" id="comentarioAluno" name="comentario" aria-describedby="passwordHelp" placeholder="Escolha uma senha">
				</div>
				
				<div class="form-group">
					<label for="aprovado">Aprovado*</label>
					<input type="text" class="form-control" id="aprovadoAluno" name="aprovado" aria-describedby="passwordHelp" placeholder="Escolha uma senha">
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
						<li><a href="Instrutores.jsp">Instrutores</a></li>
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
	<script type="text/javascript" src="webResources/js/validation-aluno.js"></script>
</body>
</html>