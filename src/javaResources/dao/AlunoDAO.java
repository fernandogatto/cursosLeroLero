package javaResources.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import javaResources.dao.connection.ConnectionDatabase;
import javaResources.model.AlunoModel;

public class AlunoDAO {

	public void insertAlunoDAO(AlunoModel aluno) {
		Connection connection = null;
		PreparedStatement stmt = null;
		
		try {
			connection = new ConnectionDatabase().getConnection();
			stmt = connection.prepareStatement("INSERT INTO alunos (cpf, nome, email, celular, login, senha, endereco, cidade, bairro, cep) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			stmt.setString(1, aluno.getCpf());
			stmt.setString(2, aluno.getNome());
			stmt.setString(3, aluno.getEmail());
			stmt.setString(4, aluno.getCelular());
			stmt.setString(5, aluno.getLogin());
			stmt.setString(6, aluno.getSenha());
			stmt.setString(7, aluno.getEndereco());
			stmt.setString(8, aluno.getCidade());
			stmt.setString(9, aluno.getBairro());
			stmt.setString(10, aluno.getCep());
			stmt.execute();
		} catch(SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao registrar aluno DAO: " + e.getMessage());
		} finally {
			ConnectionDatabase.closeConnection(connection, stmt);
		}
	}
	
	public AlunoModel listAlunoByIdDAO(int id) {
		Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        AlunoModel aluno = null;
		
        try {
        	connection = new ConnectionDatabase().getConnection();
        	stmt = connection.prepareStatement("SELECT * FROM alunos WHERE id =" + id);
        	rs = stmt.executeQuery();
        	if(rs.next()) {
        		aluno = new AlunoModel();
        		aluno.setCpf(rs.getString("cpf"));
        		aluno.setNome(rs.getString("nome"));
        		aluno.setEmail(rs.getString("email"));
        		aluno.setCelular(rs.getString("celular"));
        		aluno.setLogin(rs.getString("login"));
                aluno.setSenha(rs.getString("senha"));
                aluno.setEndereco(rs.getString("endereco"));
                aluno.setCidade(rs.getString("cidade"));
                aluno.setBairro(rs.getString("bairro"));
                aluno.setCep(rs.getString("cep"));
                aluno.setComentario(rs.getString("comentario"));
                aluno.setAprovado(rs.getBoolean("aprovado"));
        	}
        } catch(SQLException e) {
        	JOptionPane.showMessageDialog(null, "Erro ao listar aluno pelo ID: " + e.getMessage());
        } finally {
            ConnectionDatabase.closeConnection(connection, stmt);
        }
        
        return aluno;
	}
	
	public void updateAlunoDAO(AlunoModel aluno) {
		Connection connection = null;
        PreparedStatement stmt = null;
        
        try {
            connection = new ConnectionDatabase().getConnection();
            stmt = connection.prepareStatement("UPDATE alunos SET cpf = ?, nome = ?, email = ?, celular = ?, login = ?, senha = ?, endereco = ?, cidade = ?, bairro = ?, cep = ?, comentario = ?, aprovado = ? WHERE id = ?");
            stmt.setString(1, aluno.getCpf());
            stmt.setString(2, aluno.getNome());
            stmt.setString(3, aluno.getEmail());
            stmt.setString(4, aluno.getCelular());
            stmt.setString(5, aluno.getLogin());
            stmt.setString(6, aluno.getSenha());
            stmt.setString(7, aluno.getEndereco());
            stmt.setString(8, aluno.getCidade());
            stmt.setString(9, aluno.getBairro());
            stmt.setString(10, aluno.getCep());
            stmt.setString(11, aluno.getComentario());
            stmt.setBoolean(12, aluno.isAprovado());
            stmt.setInt(13, aluno.getId());
            stmt.executeUpdate();
        } catch (Exception e) {
        	JOptionPane.showMessageDialog(null, "Erro ao atualizar aluno DAO: " + e.getMessage());
        } finally {
            ConnectionDatabase.closeConnection(connection, stmt);
        }
	}
	
	public void deleteAlunoDAO(int id) {
        Connection connection = null;
        PreparedStatement stmt = null;

        try {
            connection = new ConnectionDatabase().getConnection();
            stmt = connection.prepareStatement("DELETE FROM alunos WHERE id = " + id);
            stmt.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error ao deletar aluno: " + e.getMessage());
        } finally {
            ConnectionDatabase.closeConnection(connection, stmt);
        }
    }
}
