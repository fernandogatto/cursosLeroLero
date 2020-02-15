package javaResources.controller.servlet.administrador.function;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javaResources.controller.servlet.LogicaInterface;
import javaResources.model.CursoModel;

public class MostrarCursoAdmin implements LogicaInterface {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int id = Integer.parseInt(request.getParameter("id"));
		CursoModel curso = new CursoModel().listarCursoPorIdModel(id);
		request.setAttribute("curso", curso);
		request.setAttribute("id", id);
		
		return "/administrador/AlterarCurso.jsp";
	}
}
