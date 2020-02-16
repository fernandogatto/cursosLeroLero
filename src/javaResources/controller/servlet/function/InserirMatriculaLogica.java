package javaResources.controller.servlet.function;

import java.time.LocalDate;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javaResources.controller.servlet.LogicaInterface;
import javaResources.model.MatriculaModel;

public class InserirMatriculaLogica implements LogicaInterface {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int turmaId = Integer.parseInt(request.getParameter("id"));
		int alunoId = Integer.parseInt(request.getParameter("alunoId"));
		Date dateNow = new Date();	
		double nota = Double.parseDouble(request.getParameter("nota"));
		
		
		MatriculaModel matricula = new MatriculaModel();
		matricula.setIdTurma(turmaId);
		matricula.setIdAluno(alunoId);
		matricula.setDataMatricula(dateNow);
		matricula.setNota(nota);
		
		matricula.inserirMatriculaModel();
		
		return "/WEB-INF/jsp/MatriculaRegistrada.jsp";
	}

}