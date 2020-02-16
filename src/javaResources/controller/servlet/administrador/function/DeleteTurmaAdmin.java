package javaResources.controller.servlet.administrador.function;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javaResources.controller.servlet.LogicaInterface;
import javaResources.model.CursoModel;
import javaResources.model.TurmaModel;

public class DeleteTurmaAdmin implements LogicaInterface {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int id = Integer.parseInt(request.getParameter("id"));
		TurmaModel turma = new TurmaModel();
		turma.setId(id);
		turma.deletarTurmaModel();
		
		return "AdminServlet?logica=ListaTurmasAdmin";
	}
	
}
