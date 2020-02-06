package javaResources.model;

import java.sql.SQLException;

import javaResources.dao.AdministradorDAO;

public class AdministradorModel {

	private int id;
	private String nome;
	private String login;
	private String senha;
	
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
	
	public void insertAdministradorModel() throws SQLException {
		new AdministradorDAO().insertAdministradorDAO(this);
	}
	
	public AdministradorModel listAdministradorByIdModel(int id) {
		this.setId(id);
		return new AdministradorDAO().listAdministradorByIdDAO(this.getId());
	}
	
	public void updateAdministradorModel() {
        new AdministradorDAO().updateAdministradorDAO(this);
    }

    public void deleteAdministradoryModel() {
        new AdministradorDAO().deleteAdministradorDAO(this.getId());
    }
}
