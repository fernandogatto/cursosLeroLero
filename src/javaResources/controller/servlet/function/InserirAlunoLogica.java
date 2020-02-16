package javaResources.controller.servlet.function;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javaResources.controller.servlet.LogicaInterface;
import javaResources.model.AlunoModel;

public class InserirAlunoLogica implements LogicaInterface {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String cpf = request.getParameter("cpf").replaceAll("[.-]", "");
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String celular = request.getParameter("celular").replaceAll("[.-]", "");
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		String endereco = request.getParameter("endereco");
		String cidade  = request.getParameter("cidade");
		String bairro = request.getParameter("bairro");
		String cep = request.getParameter("cep").replaceAll("[.-]", "");
		Boolean aprovado = false;
		
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
		aluno.setAprovado(aprovado);
		
		aluno.insertAlunoModel();
		
		return "/WEB-INF/jsp/AlunoRegistrado.jsp";
	}

}