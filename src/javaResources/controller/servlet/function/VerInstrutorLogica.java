package javaResources.controller.servlet.function;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javaResources.controller.servlet.LogicaInterface;
import javaResources.model.InstrutorModel;
import javaResources.model.TurmaModel;

public class VerInstrutorLogica implements LogicaInterface {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int id = Integer.parseInt(request.getParameter("id"));
		InstrutorModel instrutor = new InstrutorModel().listarInstrutorPorIdModel(id);
		request.setAttribute("instrutor", instrutor);
		request.setAttribute("id", id);
		
		List<TurmaModel> turmas = new InstrutorModel().listarTodasTurmasPorInstrutorIdModel(id);
		request.setAttribute("turmas", turmas);
		
		return "/WEB-INF/jsp/VerInstrutor.jsp";
	}

}
