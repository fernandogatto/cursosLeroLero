package javaResources.controller.servlet.function;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javaResources.controller.servlet.LogicaInterface;
import javaResources.model.TurmaModel;

public class MostrarTurmaLogica implements LogicaInterface {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int id = Integer.parseInt(request.getParameter("id"));
		TurmaModel turma = new TurmaModel().listarTurmaPorIdModel(id);
		request.setAttribute("turma", turma);
		request.setAttribute("id", id);
		
		return "/WEB-INF/jsp/AlterarTurma.jsp";
	}

}
