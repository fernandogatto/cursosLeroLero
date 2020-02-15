package javaResources.controller.servlet.function;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javaResources.controller.servlet.LogicaInterface;
import javaResources.model.CursoModel;
import javaResources.model.InstrutorModel;
import javaResources.model.TurmaModel;

public class VerTurmaLogica implements LogicaInterface {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int id = Integer.parseInt(request.getParameter("id"));
		TurmaModel turma = new TurmaModel().listarTurmaPorIdModel(id);
		CursoModel curso = new CursoModel().listarCursoPorIdModel(turma.getIdCurso());
		InstrutorModel instrutor = new InstrutorModel().listarInstrutorPorIdModel(turma.getIdInstrutor());
		request.setAttribute("turma", turma);
		request.setAttribute("id", id);
		request.setAttribute("cursoNome", curso.getNome());
		request.setAttribute("instrutorNome", instrutor.getNome());
		
		return "/WEB-INF/jsp/VerTurma.jsp";
	}

}
