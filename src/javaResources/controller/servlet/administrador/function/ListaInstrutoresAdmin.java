package javaResources.controller.servlet.administrador.function;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javaResources.controller.servlet.LogicaInterface;
import javaResources.model.InstrutorModel;

public class ListaInstrutoresAdmin implements LogicaInterface {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<InstrutorModel> instrutores = new InstrutorModel().listarTodosInstrutoresModel();
		request.setAttribute("instrutores", instrutores);
		
		return "/administrador/Instrutores.jsp";
	}

}
