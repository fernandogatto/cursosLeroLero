package javaResources.controller.servlet.function;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javaResources.controller.servlet.LogicaInterface;
import javaResources.model.AlunoModel;

public class ListaAlunosLogica implements LogicaInterface {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<AlunoModel> alunos = new AlunoModel().listAllAlunosModel();
		request.setAttribute("alunos", alunos);
		
		return "/WEB-INF/jsp/Alunos.jsp";
	}

}
