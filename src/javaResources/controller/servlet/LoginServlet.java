package javaResources.controller.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import javaResources.model.AdministradorModel;
import javaResources.model.AlunoModel;
import javaResources.model.InstrutorModel;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append(" ").append(request.getParameter("login"));
		response.getWriter().append(" ").append(request.getParameter("senha"));
		response.getWriter().append(" ").append(request.getParameter("tipo"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		String tipoUsuario = request.getParameter("tipo");
		
		if(tipoUsuario.compareTo("Administrador") == 0) {
			for(AdministradorModel administrador : new AdministradorModel().listarTodosAdministradoresModel()) {
				if(administrador.getLogin().equals(login) && administrador.getSenha().equals(senha)) {
					HttpSession session = request.getSession();
	                session.setAttribute("nomeUsuario", administrador.getNome());
	                session.setAttribute("administrador", true);
					RequestDispatcher dispatcher = request.getRequestDispatcher("Index.jsp");
					dispatcher.forward(request, response);
					return;
				}
			}
		} else if(tipoUsuario.compareTo("Instrutor") == 0) {
			for(InstrutorModel instrutor : new InstrutorModel().listarTodosInstrutoresModel()) {
				if(instrutor.getLogin().equals(login) && instrutor.getSenha().equals(senha)) {
					HttpSession session = request.getSession();
	                session.setAttribute("nomeUsuario", instrutor.getNome());
	                session.setAttribute("instrutor", true);
					RequestDispatcher dispatcher = request.getRequestDispatcher("Index.jsp");
					dispatcher.forward(request, response);
					return;
				}
			} 
		} else if(tipoUsuario.compareTo("Aluno") == 0) {
			for(AlunoModel aluno : new AlunoModel().listAllAlunosModel()) {
				if(aluno.getLogin().equals(login) && aluno.getSenha().equals(senha) && aluno.isAprovado()) {
					HttpSession session = request.getSession();
	                session.setAttribute("nomeUsuario", aluno.getNome());
	                session.setAttribute("aluno", true);
					RequestDispatcher dispatcher = request.getRequestDispatcher("Index.jsp");
					dispatcher.forward(request, response);
					return;
				}
			}
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("Login.jsp");
		dispatcher.forward(request, response);
	}

}
