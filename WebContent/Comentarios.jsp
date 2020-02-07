<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <title>Comentários | Cursos Lero Lero</title>
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
                        <li class="nav-item active">
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
    
    <section class="comentarios py-5">
		<div class="container">
			<div class="mb-3 text-center">
				<span class="h6 uppercase">O que comentam</span>
				<h2 class="display-4 text-primary">Comentários</h2>
			</div>

            <div class="my-2 w-100">
                <div class="card d-flex flex-row">
                    <img src="webResources/img/aluna-1.jpg" alt="Estudante" class="card-img-top img-fluid">

                    <div class="card-body">
                        <h3 class="card-title h5">Beatriz Wang</h3>
                        <p class="info text-secondary">Bootstrap</p>
                        <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit.</p>
                    </div>
                </div>
            </div>
            <div class="my-2 w-100">
                <div class="card d-flex flex-row">
                    <img src="webResources/img/aluna-2.jpg" alt="Estudante" class="card-img-top img-fluid">

                    <div class="card-body">
                        <h3 class="card-title h5">Lilian Martins</h3>
                        <p class="info text-secondary">Bootstrap</p>
                        <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit.</p>
                    </div>
                </div>
            </div>
            <div class="my-2 w-100">
                <div class="card d-flex flex-row">
                    <img src="webResources/img/aluna-3.jpg" alt="Estudante" class="card-img-top img-fluid">

                    <div class="card-body">
                        <h3 class="card-title h5">Ana Clara Barbosa</h3>
                        <p class="info text-secondary">Bootstrap</p>
                        <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit.</p>
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
</body>
</html>