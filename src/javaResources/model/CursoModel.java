package javaResources.model;

import java.sql.SQLException;
import java.util.List;

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
	
	public void inserirCursoModel() throws SQLException {
		new CursoDAO().inserirCursoDAO(this);
	}
	
	public CursoModel listarCursoPorIdModel(int id) {
		this.setId(id);
		return new CursoDAO().listarCursoPorIdDAO(this.getId());
	}
	
	public List<CursoModel> listarTodosCursosModel() {
		return new CursoDAO().listarTodosCursosDAO();
	}
	
	public void alterarCursoModel() throws Exception {
        new CursoDAO().alterarCursoDAO(this);
    }

    public void deletarCursoModel() {
        new CursoDAO().deletarCursoDAO(this.getId());
    }
}
