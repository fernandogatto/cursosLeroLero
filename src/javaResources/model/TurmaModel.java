package javaResources.model;

import java.sql.Date;

public class TurmaModel {
	
	private int id;
	private InstrutorModel instrutor;
	private CursoModel curso;
	private Date dataInicio;
	private Date dataFinal;
	private int cargaHoraria;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public InstrutorModel getInstrutor() {
		return instrutor;
	}
	
	public void setInstrutor(InstrutorModel instrutor) {
		this.instrutor = instrutor;
	}
	
	public CursoModel getCurso() {
		return curso;
	}
	
	public void setCurso(CursoModel curso) {
		this.curso = curso;
	}
	
	public Date getDataInicio() {
		return dataInicio;
	}
	
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	
	public Date getDataFinal() {
		return dataFinal;
	}
	
	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

}
