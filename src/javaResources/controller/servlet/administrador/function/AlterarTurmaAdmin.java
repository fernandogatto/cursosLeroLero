package javaResources.controller.servlet.administrador.function;

import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javaResources.controller.servlet.LogicaInterface;
import javaResources.model.TurmaModel;

public class AlterarTurmaAdmin implements LogicaInterface {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int instrutoresId = Integer.parseInt(request.getParameter("instrutores_id"));
		int cursosId = Integer.parseInt(request.getParameter("cursos_id"));
		java.util.Date dataInicio = new SimpleDateFormat("dd/MM/yyyy").parse(request.getParameter("data_inicio"));
		java.util.Date dataFinal = new SimpleDateFormat("dd/MM/yyyy").parse(request.getParameter("data_final"));
		int cargaHoraria = Integer.parseInt(request.getParameter("carga_horaria"));
		

		TurmaModel turma = new TurmaModel();
		turma.setIdInstrutor(instrutoresId);
		turma.setIdCurso(cursosId);
		turma.setDataInicio(dataInicio);
		turma.setDataFinal(dataFinal);
		turma.setCargaHoraria(cargaHoraria);
		
		turma.alterarTurmaModel();
		
		return "AdminServlet?logica=ListaTurmasAdmin";
	}

}
