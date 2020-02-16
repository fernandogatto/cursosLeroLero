package javaResources.controller.servlet.function;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javaResources.controller.servlet.LogicaInterface;
import javaResources.model.MatriculaModel;

public class DarNotaMatriculaLogica implements LogicaInterface {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int id = Integer.parseInt(request.getParameter("matriculaId"));
		double nota = Integer.parseInt(request.getParameter("nota"));
		
		MatriculaModel matricula = new MatriculaModel();
		matricula.setId(id);
		matricula.setNota(nota);
		
		matricula.darNotaMatriculaModel(matricula, nota);
		
		request.setAttribute("nota", nota);
		
		return "WEB-INF/jsp/Nota.jsp";
	}

}
