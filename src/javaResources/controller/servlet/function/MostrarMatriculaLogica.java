package javaResources.controller.servlet.function;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javaResources.controller.servlet.LogicaInterface;
import javaResources.model.MatriculaModel;

public class MostrarMatriculaLogica implements LogicaInterface {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int aluno_id = Integer.parseInt(request.getParameter("idAluno"));
		int turma_id = Integer.parseInt(request.getParameter("idTurma"));
		aluno_id = 1;
		MatriculaModel matricula = new MatriculaModel().listarMatriculaPorAlunoETurmaModel(aluno_id, turma_id);
		request.setAttribute("matriculaId", matricula.getId());
		
		return "/WEB-INF/jsp/DarNotaMatricula.jsp";
	}

}
