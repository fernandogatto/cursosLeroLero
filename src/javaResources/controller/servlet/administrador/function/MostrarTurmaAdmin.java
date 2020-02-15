package javaResources.controller.servlet.administrador.function;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javaResources.controller.servlet.LogicaInterface;
import javaResources.model.CursoModel;
import javaResources.model.InstrutorModel;
import javaResources.model.TurmaModel;

public class MostrarTurmaAdmin implements LogicaInterface {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int id = Integer.parseInt(request.getParameter("id"));
		TurmaModel turma = new TurmaModel().listarTurmaPorIdModel(id);
		
		int idCurso = turma.getIdCurso();
		CursoModel curso = new CursoModel().listarCursoPorIdModel(idCurso);
		
		int idInstrutor = turma.getIdInstrutor();
		InstrutorModel instrutor = new InstrutorModel().listarInstrutorPorIdModel(idInstrutor);
		
		request.setAttribute("turma", turma);
		request.setAttribute("id", id);
		request.setAttribute("curso", curso);
		request.setAttribute("instrutor", instrutor);
		
		return "/administrador/AlterarTurma.jsp";
	}

}
