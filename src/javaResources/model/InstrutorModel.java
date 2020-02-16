package javaResources.model;

import java.sql.SQLException;
import java.util.List;

import javaResources.dao.InstrutorDAO;

public class InstrutorModel {

	private int id;
	private String nome;
	private String email;
	private int valorHora;
	private String login;
	private String senha;
	private String experiencia;
	private String tipoUsuario;
	
	public InstrutorModel() {
		this.tipoUsuario = "Instrutor";
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
	
	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public void inserirInstrutorModel() throws SQLException {
		new InstrutorDAO().inserirInstrutorDAO(this);
	}
	
	public InstrutorModel listarInstrutorPorIdModel(int id) {
		this.setId(id);
		return new InstrutorDAO().listarInstrutorPorIdDAO(this.getId());
	}
	
	public List<InstrutorModel> listarTodosInstrutoresModel() {
		return new InstrutorDAO().listarTodosInstrutoresDAO();
	}
	
	public List<TurmaModel> listarTodasTurmasPorInstrutorIdModel(int id) {
		return new InstrutorDAO().listarTodasTurmasPorInstrutorIdDAO(id);
	}
	
	public void alterarInstrutorModel() {
        new InstrutorDAO().alterarInstrutorDAO(this);
    }

    public void deletarInstrutorModel() {
        new InstrutorDAO().deletarInstrutorDAO(this.getId());
    }
}
