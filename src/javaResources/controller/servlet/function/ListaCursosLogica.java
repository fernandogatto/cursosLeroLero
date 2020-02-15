package javaResources.controller.servlet.function;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javaResources.controller.servlet.LogicaInterface;
import javaResources.model.CursoModel;

public class ListaCursosLogica implements LogicaInterface {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<CursoModel> cursos = new CursoModel().listarTodosCursosModel();
		request.setAttribute("cursos", cursos);
		
		return "/WEB-INF/jsp/Cursos.jsp";
	}

}
