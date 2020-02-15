package javaResources.controller.servlet.administrador.function;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javaResources.controller.servlet.LogicaInterface;
import javaResources.model.CursoModel;

public class InserirCursoAdmin implements LogicaInterface {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String nome = request.getParameter("nome");
		String requisito = request.getParameter("requisito");
		String ementa = request.getParameter("ementa");
		int cargaHoraria = Integer.parseInt(request.getParameter("carga_horaria"));
		String precoString = request.getParameter("preco");
		double preco = Double.parseDouble(precoString.substring (0, precoString.length() - 2).replaceAll("[,]", ""));
		
		CursoModel curso = new CursoModel();
		curso.setNome(nome);
		curso.setRequisito(requisito);
		curso.setEmenta(ementa);
		curso.setCargaHoraria(cargaHoraria);
		curso.setPreco(preco);
		
		curso.inserirCursoModel();
		
		return "AdminServlet?logica=ListaCursosAdmin";
	}

}
