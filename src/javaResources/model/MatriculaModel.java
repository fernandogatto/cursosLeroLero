package javaResources.model;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import javaResources.dao.MatriculaDAO;

public class MatriculaModel {

	private int id;
	private int idTurma;
	private int idAluno;
	private Date dataMatricula;
	private double nota;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getIdTurma() {
		return idTurma;
	}

	public void setIdTurma(int idTurma) {
		this.idTurma = idTurma;
	}

	public int getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}

	public Date getDataMatricula() {
		return dataMatricula;
	}
	
	public void setDataMatricula(Date dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	
	public double getNota() {
		return nota;
	}
	
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	public void inserirMatriculaModel() throws SQLException {
		new MatriculaDAO().inserirMatriculaDAO(this);
	}
	
	public MatriculaModel listarMatriculaPorIdModel(int id) {
		this.setId(id);
		return new MatriculaDAO().listarMatriculaPorIdDAO(this.getId());
	}
	
	public List<MatriculaModel> listarTodasMatriculasModel() {
		return new MatriculaDAO().listarTodasMatriculasDAO();
	}
	
	public List<Integer> listarAlunosPorTurmaModel(int id) {
		return new MatriculaDAO().listarAlunosPorTurmaDAO(id);
	}
	
	public List<Integer> listarNotasPorAlunoModel(int id) {
		return new MatriculaDAO().listarNotasPorAlunoDAO(id);
	}
	
	public void alterarMatriculaModel() throws Exception {
        new MatriculaDAO().alterarMatriculaDAO(this);
    }
	
	public MatriculaModel listarMatriculaPorAlunoETurmaModel(int aluno_id, int turma_id) {
		return new MatriculaDAO().listarMatriculaPorAlunoETurmaDAO(aluno_id, turma_id);
	}
	
	public void darNotaMatriculaModel(MatriculaModel matricula, double nota) throws Exception {
        new MatriculaDAO().darNotaMatriculaDAO(matricula, nota);
    }

    public void deletarMatriculaModel() {
        new MatriculaDAO().deletarMatriculaDAO(this.getId());
    }
}
