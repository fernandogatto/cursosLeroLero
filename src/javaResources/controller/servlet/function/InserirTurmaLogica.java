package javaResources.controller.servlet.function;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javaResources.controller.servlet.LogicaInterface;
import javaResources.model.TurmaModel;

public class InserirTurmaLogica implements LogicaInterface {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int instrutoresId = Integer.parseInt(request.getParameter("instrutores_id"));
		int cursosId = Integer.parseInt(request.getParameter("cursos_id"));
		Date dataInicio = (Date) new SimpleDateFormat("dd/MM/yyyy").parse("data_inicio");
		Date dataFinal = (Date) new SimpleDateFormat("dd/MM/yyyy").parse("data_final");
		int cargaHoraria = Integer.parseInt(request.getParameter("carga_horaria"));
		
		TurmaModel turma = new TurmaModel();
		turma.setIdInstrutor(instrutoresId);
		turma.setIdCurso(cursosId);
		turma.setDataInicio(dataInicio);
		turma.setDataFinal(dataFinal);
		turma.setCargaHoraria(cargaHoraria);
		
		
		turma.inserirTurmaModel();
		
		return "TurmaAdicionada.jsp";
	}

}
