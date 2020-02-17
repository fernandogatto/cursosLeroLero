package javaResources.controller.servlet.function;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javaResources.controller.servlet.LogicaInterface;
import javaResources.model.AlunoModel;
import javaResources.model.CursoModel;
import javaResources.model.MatriculaModel;
import javaResources.model.TurmaModel;

public class VerAlunoLogica implements LogicaInterface {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int id = Integer.parseInt(request.getParameter("id"));
		AlunoModel aluno = new AlunoModel().listAlunoByIdModel(id);
		request.setAttribute("aluno", aluno);
		request.setAttribute("id", id);
		
////		List<TurmaModel> matriculas = new MatriculaModel().listarTodasMatriculasPorAlunoIdModel(id);
//		List<AlunoTurmasModel> turmasAluno = new ArrayList<>();
//		
//		AlunoTurmasModel turmaAluno = null;
//		
//		for(MatriculaModel matricula : new MatriculaModel().listarTodasMatriculasPorAlunoIdModel(id)) { 
//			TurmaModel turma = new TurmaModel().listarTurmaPorIdModel(matricula.getIdTurma());
//			CursoModel curso = new CursoModel().listarCursoPorIdModel(turma.getIdCurso());
//			String cursoNome = curso.getNome();
//			double nota = matricula.getNota();
//						
//			turmaAluno.setNomeCurso(cursoNome);
//			turmaAluno.setNota(nota);
//			
//			turmasAluno.add(turmaAluno);
//			
//			
//			
////			String dataInicioString = new SimpleDateFormat("dd/MM/yyyy").format(turma.getDataInicio());
////			String dataFinalString = new SimpleDateFormat("dd/MM/yyyy").format(turma.getDataFinal());
//			
//		}
//		request.setAttribute("turmasAluno", turmasAluno);
		
		return "/WEB-INF/jsp/VerAluno.jsp";
	}

}
