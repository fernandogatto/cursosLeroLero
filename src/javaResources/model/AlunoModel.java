package javaResources.model;

import java.sql.SQLException;
import java.util.List;

import javaResources.dao.AlunoDAO;

public class AlunoModel {

	private int id;
	private String cpf;
	private String nome;
	private String email;
	private String celular;
	private String login;
	private String senha;
	private String endereco;
	private String cidade;
	private String bairro;
	private String cep;
	private String comentario;
	private boolean aprovado;
	private String tipoUsuario;
	
	public AlunoModel() {
		this.tipoUsuario = "ALuno";
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
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
	
	public String getCelular() {
		return celular;
	}
	
	public void setCelular(String celular) {
		this.celular = celular;
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
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String getComentario() {
		return comentario;
	}
	
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	public boolean isAprovado() {
		return aprovado;
	}
	
	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public void insertAlunoModel() throws SQLException {
		new AlunoDAO().insertAlunoDAO(this);
	}
	
	public AlunoModel listAlunoByIdModel(int id) {
		this.setId(id);
		return new AlunoDAO().listAlunoByIdDAO(this.getId());
	}

	public List<AlunoModel> listAllAlunosModel() {
		return new AlunoDAO().listAllAlunosDAO();
	}
	
	public void updateAlunoModel() {
        new AlunoDAO().updateAlunoDAO(this);
    }

    public void deleteAlunoModel() {
        new AlunoDAO().deleteAlunoDAO(this.getId());
    }
	
}
