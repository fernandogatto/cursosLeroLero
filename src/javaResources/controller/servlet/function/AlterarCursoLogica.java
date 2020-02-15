package javaResources.controller.servlet.function;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javaResources.controller.servlet.LogicaInterface;
import javaResources.model.CursoModel;

public class AlterarCursoLogica implements LogicaInterface {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int id = Integer.parseInt(request.getParameter("id"));
		String nome = request.getParameter("nome");
		String requisito = request.getParameter("requisito");
		String ementa = request.getParameter("ementa");
		int cargaHoraria = Integer.parseInt(request.getParameter("carga_horaria"));
		String precoString = request.getParameter("preco");
		  double preco = Double.parseDouble(precoString.substring (0, precoString.length() - 2).replaceAll("[,]", ""));
		
		CursoModel curso = new CursoModel();
		curso.setId(id);
		curso.setNome(nome);
		curso.setRequisito(requisito);
		curso.setEmenta(ementa);
		curso.setCargaHoraria(cargaHoraria);
		curso.setPreco(preco);
		
		curso.alterarCursoModel();
		
		return "LogicaServlet?logica=ListaCursosLogica";
	}

}
