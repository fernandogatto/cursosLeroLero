package javaResources.controller.servlet.function;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javaResources.controller.servlet.LogicaInterface;
import javaResources.model.CursoModel;
import javaResources.model.InstrutorModel;
import javaResources.model.TurmaModel;

public class MostrarTurmaLogica implements LogicaInterface {

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
		
		Date dataInicio = turma.getDataInicio();
		String dataInicioString = new SimpleDateFormat("dd/MM/yyyy").format(dataInicio);
		request.setAttribute("dataInicio", dataInicioString);
		
		Date dataFinal = turma.getDataFinal();
		String dataFinalString = new SimpleDateFormat("dd/MM/yyyy").format(dataFinal);
		request.setAttribute("dataFinal", dataFinalString);
		
		return "/WEB-INF/jsp/AlterarTurma.jsp";
	}

}
