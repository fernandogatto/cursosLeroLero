package javaResources.controller.servlet.function;

import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javaResources.controller.servlet.LogicaInterface;
import javaResources.model.TurmaModel;

public class AlterarTurmaLogica implements LogicaInterface {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int id = Integer.parseInt(request.getParameter("id"));
		int instrutorId = Integer.parseInt(request.getParameter("instrutores_id"));
		int cursoId = Integer.parseInt(request.getParameter("cursos_id"));
		int cargaHoraria = Integer.parseInt(request.getParameter("carga_horaria"));
		java.util.Date dataInicio = new SimpleDateFormat("dd/MM/yyyy").parse(request.getParameter("data_inicio"));
		java.util.Date dataFinal = new SimpleDateFormat("dd/MM/yyyy").parse(request.getParameter("data_final"));

		
		TurmaModel turma = new TurmaModel();
		turma.setId(id);
		turma.setIdInstrutor(instrutorId);
		turma.setIdCurso(cursoId);
		turma.setCargaHoraria(cargaHoraria);
		turma.setDataInicio(dataInicio);
		turma.setDataFinal(dataFinal);
		
		turma.alterarTurmaModel();
		
		return "LogicaServlet?logica=ListaTurmasLogica";
	}

}
