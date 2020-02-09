package javaResources.model;

//import java.util.Date; ?
import java.sql.Date;

public class TurmaModel {
	
	private int id;
	private int idInstrutor;
	private int idCurso;
	private Date dataInicio;
	private Date dataFinal;
	private int cargaHoraria;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getIdInstrutor() {
		return idInstrutor;
	}

	public void setIdInstrutor(int idInstrutor) {
		this.idInstrutor = idInstrutor;
	}

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
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
