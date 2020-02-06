package javaResources.model;

import java.sql.SQLException;

import javaResources.dao.CursoDAO;

public class CursoModel {

	private int id;
	private String nome;
	private String requisito;
	private String ementa;
	private int cargaHoraria;
	private double preco;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getRequisito() {
		return requisito;
	}
	
	public void setRequisito(String requisito) {
		this.requisito = requisito;
	}
	
	public String getEmenta() {
		return ementa;
	}
	
	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void insertCursoModel() throws SQLException {
		new CursoDAO().insertCursoDAO(this);
	}
	
	public CursoModel listCursoByIdModel(int id) {
		this.setId(id);
		return new CursoDAO().listCursoByIdDAO(this.getId());
	}
	
	public void updateCursoModel() {
        new CursoDAO().updateCursoDAO(this);
    }

    public void deleteCursoModel() {
        new CursoDAO().deleteCursoDAO(this.getId());
    }
}
