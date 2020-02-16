package javaResources.controller.servlet.administrador.function;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javaResources.controller.servlet.LogicaInterface;
import javaResources.model.CursoModel;
import javaResources.model.InstrutorModel;
import javaResources.model.TurmaModel;

public class VerTurmaAdmin implements LogicaInterface {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int id = Integer.parseInt(request.getParameter("id"));
		TurmaModel turma = new TurmaModel().listarTurmaPorIdModel(id);
		request.setAttribute("turma", turma);
		request.setAttribute("id", id);
		
		Date dataInicio = turma.getDataInicio();
		String dataInicioString = new SimpleDateFormat("dd/MM/yyyy").format(dataInicio);
		request.setAttribute("dataInicio", dataInicioString);
		
		Date dataFinal = turma.getDataFinal();
		String dataFinalString = new SimpleDateFormat("dd/MM/yyyy").format(dataFinal);
		request.setAttribute("dataFinal", dataFinalString);
		
		CursoModel curso = new CursoModel().listarCursoPorIdModel(turma.getIdCurso());
		InstrutorModel instrutor = new InstrutorModel().listarInstrutorPorIdModel(turma.getIdInstrutor());
		request.setAttribute("cursoNome", curso.getNome());
		request.setAttribute("instrutorNome", instrutor.getNome());
	
		
		return "/administrador/VerTurma.jsp";
	}

}
