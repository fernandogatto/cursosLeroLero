<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<header>
	<nav class="navbar navbar-expand-md navbar-light bg-light fixed-top py-3">
		<div class="container">
			<a class="navbar-brand" href="../Index.jsp"><img src="../webResources/img/logo-integrado.png" alt="logo"></a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item">
						<a class="nav-link" href="/cursosLeroLero/Index.jsp">Home</a>
					</li>
					<li class="nav-item">
						<a class="nav-link" href="/cursosLeroLero/Sobre.jsp">Sobre</a>
                       </li>
                       <li class="nav-item">
						<a class="nav-link" href="/cursosLeroLero/LogicaServlet?logica=ListaInstrutoresLogica">Instrutores</a>
                       </li>
                       <li class="nav-item">
						<a class="nav-link" href="/cursosLeroLero/Comentarios.jsp">Comentários</a>
                       </li>
                   	<li class="nav-item">
						<a class="nav-link" href="/cursosLeroLero/Cursos.jsp">Cursos</a>
                       </li>
                       <%if(session.getAttribute("administrador") != null) { %>
                       <li class="nav-item dropdown">
						<a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Área do admin</a>
						<div class="dropdown-menu" aria-labelledby="navbarDropdown">
							<a class="dropdown-item" href="/cursosLeroLero/administrador/Tabelas.jsp">Novas tabelas</a>
							<a class="dropdown-item" href="/cursosLeroLero/administrador/AdminServlet?logica=ListaRegistrosAdmin">Registros</a>
							<a class="dropdown-item" href="/cursosLeroLero/administrador/AdminServlet?logica=ListaAlunosAprovadosAdmin">Alunos</a>
							<a class="dropdown-item" href="/cursosLeroLero/administrador/AdminServlet?logica=ListaInstrutoresAdmin">Instrutores</a>
							<a class="dropdown-item" href="/cursosLeroLero/administrador/AdminServlet?logica=ListaCursosAdmin">Cursos</a>
							<a class="dropdown-item" href="/cursosLeroLero/administrador/AdminServlet?logica=ListaTurmasAdmin">Turmas</a>
						</div>
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