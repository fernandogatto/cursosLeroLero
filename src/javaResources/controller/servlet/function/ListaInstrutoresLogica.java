package javaResources.controller.servlet.function;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javaResources.controller.servlet.LogicaInterface;
import javaResources.model.InstrutorModel;

public class ListaInstrutoresLogica implements LogicaInterface {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<InstrutorModel> instrutores = new InstrutorModel().listAllInstrutoresModel();
		request.setAttribute("instrutores", instrutores);
		
		return "/WEB-INF/jsp/Instrutores.jsp";
	}

}
