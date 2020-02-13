<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Sobre | Cursos Lero Lero</title>
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
						<li class="nav-item ">
							<a class="nav-link" href="/cursosLeroLero/Index.jsp">Home</a>
						</li>
						<li class="nav-item active">
							<a class="nav-link" href="/cursosLeroLero/Sobre.jsp">Sobre</a>
                        </li>
                        <li class="nav-item">
							<a class="nav-link" href="/cursosLeroLero/LogicaServlet?logica=ListaInstrutoresLogica">Instrutores</a>
                        </li>
                        <li class="nav-item">
							<a class="nav-link" href="/cursosLeroLero/Comentarios.jsp">Comentários</a>
                        </li>
                        <%if(session.getAttribute("administrador") != null) { %>
                        <li class="nav-item">
							<a class="nav-link" href="/cursosLeroLero/administrador/Tabelas.jsp">Tabelas</a>
                        </li>
                        <% } %>
                    	<li class="nav-item">
							<a class="nav-link" href="/cursosLeroLero/Cursos.jsp">Cursos</a>
                        </li>
                        <%if(session.getAttribute("administrador") != null) { %>
                        <li class="nav-item">
							<a class="nav-link" href="/cursosLeroLero/administrador/AdminServlet?logica=ListaAlunosLogica">Registros</a>
                        </li>
                        <% } %>
                        <%if(session.getAttribute("nomeUsuario") == null) { %>
                        <li class="nav-item">
							<a class="nav-link" href="/cursosLeroLero/Login.jsp">Login</a>
						</li>
						<li class="nav-item">
							<a class="btn btn-outline-primary" href="/cursosLeroLero/Registro.jsp">Cadastre-se</a>
						</li>
						<% } else { %>
						<li class="nav-item dropdown">
							<a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">${ sessionScope.nomeUsuario }</a>
							<div class="dropdown-menu" aria-labelledby="navbarDropdown">
								<% if(session.getAttribute("instrutor") != null) { %>
								<a class="dropdown-item" href="/cursosLeroLero/PerfilInstrutor.jsp">Perfil</a>
								<% } else if(session.getAttribute("aluno") != null) { %>
								<a class="dropdown-item" href="/cursosLeroLero/PerfilAluno.jsp">Perfil</a>
								<% } %>
								<a class="dropdown-item" href="/cursosLeroLero/LogoutServlet">Logout</a>
							</div>
                        </li>
                        <% } %>
					</ul>
				</div>
			</div>
		</nav>
	</header>

	<section class="sobre py-5">
		<div class="container">
			<div class="mb-3 text-center">
				<span class="h6 uppercase">Quem somos</span>
				<h2 class="display-4 text-primary">Nossa História</h2>
            </div>
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Necessitatibus possimus, cumque dignissimos eos quae minus, sequi a dolor quo nesciunt vitae debitis iusto et tempora corporis. Nisi veniam amet quidem. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Necessitatibus possimus, cumque dignissimos eos quae minus, sequi a dolor quo nesciunt vitae debitis iusto et tempora corporis. Nisi veniam amet quidem.</p>
            <div class="d-flex justify-content-center">
                <img src="webResources/img/predio.jpg" alt="Predio" class="mt-3">
            </div>
		</div>
    </section>
    
    <section class="perguntas pb-5">
        <div class="my-5 text-center">
            <span class="h6 uppercase d-block">Está com dúvidas?</span>
            <h2 class="display-4 text-primary">Perguntas frequentes</h2>
        </div>
  
        <div class="row justify-content-center">
            <div class="col-md-6" id="perguntas-frequentes" data-children=".pergunta">
                <div class="pergunta py-2">
                    <a href="#pergunta-1" class="lead" data-toggle="collapse" data-parent="#perguntas-frequentes" aria-expanded="true" aria-controls="pergunta-1">Onde é o curso?</a>
                    <div id="pergunta-1" class="collapse show" role="tabpanel">
                        <p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Sint, molestias? Laboriosam excepturi cupiditate quia maiores omnis odio, dolorem soluta voluptate optio quisquam incidunt veritatis iure fugiat nihil, alias sed explicabo.</p>
                    </div>
                </div>
  
                <div class="dropdown-divider"></div>
  
                <div class="pergunta py-2">
                    <a href="#pergunta-2" class="lead" data-toggle="collapse" data-parent="#perguntas-frequentes" aria-expanded="false" aria-controls="pergunta-2">Precisa comprar algum material didático?</a>
                    <div id="pergunta-2" class="collapse" role="tabpanel">
                        <p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Sint, molestias? Laboriosam excepturi cupiditate quia maiores omnis odio, dolorem soluta voluptate optio quisquam incidunt veritatis iure fugiat nihil, alias sed explicabo.</p>
                    </div>
                </div>

                <div class="dropdown-divider"></div>

                <div class="pergunta py-2">
                    <a href="#pergunta-3" class="lead" data-toggle="collapse" data-parent="#perguntas-frequentes" aria-expanded="false" aria-controls="pergunta-3">Como funcionam as aulas?</a>
                    <div id="pergunta-3" class="collapse" role="tabpanel">
                        <p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Sint, molestias? Laboriosam excepturi cupiditate quia maiores omnis odio, dolorem soluta voluptate optio quisquam incidunt veritatis iure fugiat nihil, alias sed explicabo.</p>
                    </div>
                </div>

                <div class="dropdown-divider"></div>

                <div class="pergunta py-2">
                    <a href="#pergunta-4" class="lead" data-toggle="collapse" data-parent="#perguntas-frequentes" aria-expanded="false" aria-controls="pergunta-4">O curso dá direito a bolsa de desconto?</a>
                    <div id="pergunta-4" class="collapse" role="tabpanel">
                        <p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Sint, molestias? Laboriosam excepturi cupiditate quia maiores omnis odio, dolorem soluta voluptate optio quisquam incidunt veritatis iure fugiat nihil, alias sed explicabo.</p>
                    </div>
                </div>
  
                <div class="dropdown-divider"></div>
            </div>
        </div>
    </section>

    <section>
        <iframe src="https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d14700.922543994884!2d-43.1316667!3d-22.9048625!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x9e97773b91b93bba!2sUniversidade%20Federal%20Fluminense%20-%20Campus%20Praia%20Vermelha!5e0!3m2!1spt-BR!2sbr!4v1580080335049!5m2!1spt-BR!2sbr" width="100%" height="450" frameborder="0" style="border:0;" allowfullscreen=""></iframe>
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
			<p class="mb-0">Integrado &copy; 2019. Nenhum direito reservado.</p>
		</div>
	</footer>

	<script type="text/javascript" src="webResources/js/jquery.min.js"></script>
	<script type="text/javascript" src="webResources/js/popper.min.js"></script>
	<script type="text/javascript" src="webResources/js/bootstrap.js"></script>
</body>
</html>