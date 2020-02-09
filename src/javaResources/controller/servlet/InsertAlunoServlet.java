package javaResources.controller.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javaResources.model.AlunoModel;

/**
 * Servlet implementation class InsertAlunoServlet
 */
@WebServlet("/InsertAlunoServlet")
public class InsertAlunoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertAlunoServlet() {
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
		String cpf = request.getParameter("cpf").replaceAll("[.-]", "");
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String celular = request.getParameter("celular").replaceAll("[.-]", "");
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		String endereco = request.getParameter("endereco");
		String cidade = request.getParameter("cidade");
		String bairro = request.getParameter("bairro");
		String cep = request.getParameter("cep").replaceAll("[.-]", "");
		
		AlunoModel aluno = new AlunoModel();
		aluno.setCpf(cpf);
		aluno.setNome(nome);
		aluno.setEmail(email);
		aluno.setCelular(celular);
		aluno.setLogin(login);
		aluno.setSenha(senha);
		aluno.setEndereco(endereco);
		aluno.setCidade(cidade);
		aluno.setBairro(bairro);
		aluno.setCep(cep);

		
		try {
			aluno.insertAlunoModel();
			RequestDispatcher dispatcher = request.getRequestDispatcher("AlunoAdicionado.jsp");
			dispatcher.forward(request, response);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
