package javaResources.controller.servlet.administrador.function;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javaResources.controller.servlet.LogicaInterface;
import javaResources.model.TurmaModel;

public class ListaTurmasAdmin implements LogicaInterface {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<TurmaModel> turmas = new TurmaModel().listarTodasTurmasModel();
		request.setAttribute("turmas", turmas);
		
		return "/administrador/Turmas.jsp";
	}

}
