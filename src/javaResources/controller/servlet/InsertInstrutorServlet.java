package javaResources.controller.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javaResources.model.InstrutorModel;

/**
 * Servlet implementation class InsertInstrutorServlet
 */
@WebServlet("/InsertInstrutorServlet")
public class InsertInstrutorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertInstrutorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub		
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		int valorHora = Integer.parseInt(request.getParameter("valor_hora"));
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		String experiencia = request.getParameter("experiencia");
		
		InstrutorModel instrutor = new InstrutorModel();
		instrutor.setNome(nome);
		instrutor.setEmail(email);
		instrutor.setValorHora(valorHora);
		instrutor.setLogin(login);
		instrutor.setSenha(senha);
		instrutor.setExperiencia(experiencia);

		try {
			instrutor.insertInstrutorModel();
			RequestDispatcher dispatcher = request.getRequestDispatcher("InstrutorAdicionado.jsp");
			dispatcher.forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
