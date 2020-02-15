package javaResources.controller.servlet.administrador.function;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javaResources.controller.servlet.LogicaInterface;
import javaResources.model.InstrutorModel;

public class MostrarInstrutorAdmin implements LogicaInterface {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int id = Integer.parseInt(request.getParameter("id"));
		InstrutorModel instrutor = new InstrutorModel().listarInstrutorPorIdModel(id);
		request.setAttribute("instrutor", instrutor);
		request.setAttribute("id", id);
		
		return "/administrador/AlterarInstrutor.jsp";
	}

}
