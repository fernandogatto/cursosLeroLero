package javaResources.controller.servlet.administrador.function;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javaResources.controller.servlet.LogicaInterface;
import javaResources.model.AlunoModel;

public class MostrarAlunoAdmin implements LogicaInterface {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int id = Integer.parseInt(request.getParameter("id"));
		AlunoModel aluno = new AlunoModel().listAlunoByIdModel(id);
		request.setAttribute("aluno", aluno);
		request.setAttribute("id", id);
		
		return "/administrador/AlterarAluno.jsp";
	}

}
