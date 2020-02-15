package javaResources.controller.servlet.administrador.function;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javaResources.controller.servlet.LogicaInterface;
import javaResources.model.InstrutorModel;

public class AlterarInstrutorAdmin implements LogicaInterface {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int id = Integer.parseInt(request.getParameter("id"));
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		int valorHora = 100;
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		String experiencia = request.getParameter("experiencia");
		
		InstrutorModel instrutor = new InstrutorModel();
		instrutor.setId(id);
		instrutor.setNome(nome);
		instrutor.setEmail(email);
		instrutor.setValorHora(valorHora);
		instrutor.setLogin(login);
		instrutor.setSenha(senha);
		instrutor.setExperiencia(experiencia);
		
		instrutor.alterarInstrutorModel();
		
		return "AdminServlet?logica=ListaInstrutoresAdmin";
	}
	
}
