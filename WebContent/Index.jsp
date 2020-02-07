<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
						<li class="nav-item active">
							<a class="nav-link" href="index.html">Home</a>
						</li>
						<li class="nav-item">
							<a class="nav-link" href=" sobre.html">Sobre</a>
                        </li>
                        <li class="nav-item">
							<a class="nav-link" href=" instrutores.html">Instrutores</a>
                        </li>
                        <li class="nav-item">
							<a class="nav-link" href=" comentarios.html">Coment�rios</a>
                        </li>
                        <li class="nav-item">
							<a class="nav-link" href="tabelas.html">Tabelas</a>
                        </li>
                    	<li class="nav-item dropdown">
							<a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
								data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
								Cursos
							</a>
							<div class="dropdown-menu" aria-labelledby="navbarDropdown">
								<a class="dropdown-item" href="cursos.html">Cursos</a>
								<div class="dropdown-divider"></div>
								<a class="dropdown-item" href="#">HTML e CSS</a>
								<a class="dropdown-item" href="#">Javascript</a>
								<a class="dropdown-item" href="#">Bootstrap</a>
								<a class="dropdown-item" href="#">WordPress</a>
							</div>
                        </li>
                        <li class="nav-item">
							<a class="nav-link" href=" login.html">Login</a>
						</li>
						<li class="nav-item">
							<a class="btn btn-outline-primary" href="registro.html">Cadastre-se</a>
						</li>
					</ul>
				</div>
			</div>
		</nav>
	</header>

	<section class="intro bg-light">
		<div class="d-flex flex-row justify-content-center h-100 content">
			<div class="intro-item align-self-center">
				<h1 class="display-3 mb-3">Cursos Lero Lero</h1>
				<p class="lead">Onde a uni�o cria la�os e estabelece um novo futuro</p>
				<a class="btn btn-primary btn-lg" href="sobre.html">Saiba mais</a>
			</div>
			<div class="intro-item align-self-end">
				<img src="webResources/img/estudante.png" alt="estudante">
			</div>
		</div>
	</section>

	<section class="quem-somos py-5">
		<div class="container">
			<div class="mb-3 text-center">
				<span class="h6 uppercase">Um pouco sobre n�s</span>
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

				<a class="btn btn-primary mx-auto" href="instrutores.html">Conhe�a nossos instrutores</a>
			</div>
		</div>
	</section>

	<section class="text-center text-white" id="uniao">
		<div class="mask-opacity"></div>
		<div class="container">
			<p id="frase" class="display-4 font-italic">Se quer ir r�pido, v� sozinho. Se quer ir longe, v� em grupo.</p>
			<p>Prov�rbio africano</p>
		</div>
	</section>

	<section class="cursos py-5">
		<div class="container">
			<div class="mb-3 text-center">
				<span class="h6 uppercase">O que ensinamos</span>
				<h2 class="display-4 text-primary">Nossos Cursos</h2>
			</div>

			<div class="row">
				<div class="col-lg-3 col-md-6 col-12 my-2">
					<div class="card">
						<img src="webResources/img/curso-html-css.jpg" alt="curso de html e css" class="card-img-top">

						<div class="card-body">
							<h3 class="card-title h5">HTML e CSS</h3>
							<p class="info text-secondary">24 aulas | 1 hora | Intermedi�rio</p>
							<p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit.</p>
							<a href="#" class="btn btn-outline-primary">Inscreva-se</a>
						</div>
					</div>
				</div>

				<div class="col-lg-3 col-md-6 col-12 my-2">
					<div class="card">
						<img src="webResources/img/curso-js.jpg" alt="curso de javascript" class="card-img-top">

						<div class="card-body">
							<h3 class="card-title h5">Javascript</h3>
							<p class="info text-secondary">24 aulas | 1 hora | Intermedi�rio</p>
							<p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit.</p>
							<a href="#" class="btn btn-outline-primary">Inscreva-se</a>
						</div>
					</div>
				</div>

				<div class="col-lg-3 col-md-6 col-12 my-2">
					<div class="card">
						<img src="webResources/img/curso-bootstrap.jpeg" alt="curso de bootstrap" class="card-img-top">

						<div class="card-body">
							<h3 class="card-title h5">Bootstrap</h3>
							<p class="info text-secondary">24 aulas | 1 hora | Intermedi�rio</p>
							<p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit.</p>
							<a href="#" class="btn btn-outline-primary">Inscreva-se</a>
						</div>
					</div>
				</div>

				<div class="col-lg-3 col-md-6 col-12 my-2">
					<div class="card">
						<img src="webResources/img/curso-wordpress.jpg" alt="curso de wordpress" class="card-img-top">

						<div class="card-body">
							<h3 class="card-title h5">WordPress</h3>
							<p class="info text-secondary">24 aulas | 1 hora | Intermedi�rio</p>
							<p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit.</p>
							<a href="#" class="btn btn-outline-primary">Inscreva-se</a>
						</div>
					</div>
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
					<h4 class="h6 uppercase">P�ginas</h4>
					<ul class="list-unstyled">
						<li><a href="#">Home</a></li>
						<li><a href=" sobre.html">Sobre</a></li>
						<li><a href=" instrutores.html">Instrutores</a></li>
						<li><a href=" comentarios.html">Coment�rios</a></li>
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
</body>
</html>