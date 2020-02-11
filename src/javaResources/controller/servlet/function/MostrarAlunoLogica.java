package javaResources.controller.servlet.function;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javaResources.controller.servlet.LogicaInterface;
import javaResources.model.AlunoModel;

public class MostrarAlunoLogica implements LogicaInterface {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int id = Integer.parseInt(request.getParameter("id"));
		AlunoModel aluno = new AlunoModel().listAlunoByIdModel(id);
		request.setAttribute("aluno", aluno);
		request.setAttribute("id", id);
		
		return "/WEB-INF/jsp/AlterarAluno.jsp";
	}

}