package javaResources.model;

import java.sql.SQLException;
import java.util.List;

import javaResources.dao.AdministradorDAO;

public class AdministradorModel {

	private int id;
	private String nome;
	private String login;
	private String senha;
	private String tipoUsuario;
	
	public AdministradorModel() {
		this.tipoUsuario = "Administrador";
	}
	
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
	
	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public void inserirAdministradorModel() throws SQLException {
		new AdministradorDAO().inserirAdministradorDAO(this);
	}
	
	public AdministradorModel listarAdministradorPorIdModel(int id) {
		this.setId(id);
		return new AdministradorDAO().listarAdministradorPorIdDAO(this.getId());
	}
	
	public List<AdministradorModel> listarTodosAdministradoresModel() {
		return new AdministradorDAO().listarTodosAdministradoresDAO();
	}
	
	public void alterarAdministradorModel() {
        new AdministradorDAO().alterarAdministradorDAO(this);
    }

    public void deletarAdministradorModel() {
        new AdministradorDAO().deletarAdministradorDAO(this.getId());
    }
}
