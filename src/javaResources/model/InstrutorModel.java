package javaResources.model;

import java.sql.SQLException;

import javaResources.dao.InstrutorDAO;

public class InstrutorModel {

	private int id;
	private String nome;
	private String email;
	private int valorHora;
	private String login;
	private String senha;
	private String experiencia;
	
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
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getValorHora() {
		return valorHora;
	}
	
	public void setValorHora(int valorHora) {
		this.valorHora = valorHora;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getExperiencia() {
		return experiencia;
	}
	
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	
	public void insertInstrutorModel() throws SQLException {
		new InstrutorDAO().insertInstrutorDAO(this);
	}
	
	public InstrutorModel listInstrutorByIdModel(int id) {
		this.setId(id);
		return new InstrutorDAO().listInstrutorByIdDAO(this.getId());
	}
	
	public void updateInstrutorModel() {
        new InstrutorDAO().updateInstrutorDAO(this);
    }

    public void deleteInstrutorModel() {
        new InstrutorDAO().deleteInstrutorDAO(this.getId());
    }
}
