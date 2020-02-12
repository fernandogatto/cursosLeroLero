package javaResources.controller.servlet.function;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javaResources.controller.servlet.LogicaInterface;
import javaResources.model.CursoModel;

public class InserirCursoLogica implements LogicaInterface {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String nome = request.getParameter("nome");
		String requisito = request.getParameter("requisito");
		String ementa = request.getParameter("ementa");
		int cargaHoraria = Integer.parseInt(request.getParameter("carga_horaria"));
		double preco = Double.parseDouble(request.getParameter("preco"));
		
		CursoModel curso = new CursoModel();
		curso.setNome(nome);
		curso.setRequisito(requisito);
		curso.setEmenta(ementa);
		curso.setCargaHoraria(cargaHoraria);
		curso.setPreco(preco);
		
		curso.inserirCursoModel();
		
		return "CursoAdicionado.jsp";
	}

}
