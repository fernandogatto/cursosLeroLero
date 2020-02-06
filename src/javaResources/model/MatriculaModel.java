package javaResources.model;

import java.sql.Date;

public class MatriculaModel {

	private int id;
	private TurmaModel turma;
	private AlunoModel aluno;
	private Date dataMatricula;
	private double nota;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public TurmaModel getTurma() {
		return turma;
	}
	
	public void setTurma(TurmaModel turma) {
		this.turma = turma;
	}
	
	public AlunoModel getAluno() {
		return aluno;
	}
	
	public void setAluno(AlunoModel aluno) {
		this.aluno = aluno;
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
}
