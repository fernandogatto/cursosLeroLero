package javaResources.controller.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javaResources.model.InstrutorModel;

public class DeleteInstrutorLogica implements LogicaInterface {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int id = Integer.parseInt(request.getParameter("id"));
		InstrutorModel instrutor = new InstrutorModel();
		instrutor.setId(id);
		instrutor.deleteInstrutorModel();
		
		return "Instrutores.jsp";
	}

}
