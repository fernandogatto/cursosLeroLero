package javaResources.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import javaResources.dao.connection.ConnectionDatabase;
import javaResources.model.InstrutorModel;

public class InstrutorDAO {

	public void insertInstrutorDAO(InstrutorModel instrutor) {
		Connection connection = null;
		PreparedStatement stmt = null;
		
		try {
			connection = new ConnectionDatabase().getConnection();
			stmt = connection.prepareStatement("INSERT INTO instrutores (nome, email, valor_hora, login, senha, experiencia) VALUES (?, ?, ?, ?, ?, ?)");
			stmt.setString(1, instrutor.getNome());
			stmt.setString(2, instrutor.getEmail());
			stmt.setInt(3, instrutor.getValorHora());
			stmt.setString(4, instrutor.getLogin());
			stmt.setString(5, instrutor.getSenha());
			stmt.setString(6, instrutor.getExperiencia());
			stmt.execute();
		} catch(SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao registrar instrutor DAO: " + e.getMessage());
		} finally {
			ConnectionDatabase.closeConnection(connection, stmt);
		}
	}
	
	public InstrutorModel listInstrutorByIdDAO(int id) {
		Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        InstrutorModel instrutor = null;
		
        try {
        	connection = new ConnectionDatabase().getConnection();
        	stmt = connection.prepareStatement("SELECT * FROM instrutores WHERE id = ?");
        	rs = stmt.executeQuery();
        	if(rs.next()) {
        		instrutor = new InstrutorModel();
        		instrutor.setNome(rs.getString("nome"));
        		instrutor.setEmail(rs.getString("email"));
        		instrutor.setValorHora(rs.getInt("valor_hora"));
        		instrutor.setLogin(rs.getString("login"));
                instrutor.setSenha(rs.getString("senha"));
                instrutor.setExperiencia(rs.getString("experiencia"));
        	}
        } catch(SQLException e) {
        	JOptionPane.showMessageDialog(null, "Erro ao listar instrutor pelo ID: " + e.getMessage());
        } finally {
            ConnectionDatabase.closeConnection(connection, stmt);
        }
        
        return instrutor;
	}
	
	public ArrayList<InstrutorModel> listAllInstrutoresDAO() {
		Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<InstrutorModel> instrutores = new ArrayList<>();
        InstrutorModel instrutor = null;
        
        try {
        	connection = new ConnectionDatabase().getConnection();
            stmt = connection.prepareStatement("SELECT * FROM instrutores");
            rs = stmt.executeQuery();
            
            while(rs.next()) {
            	instrutor = new InstrutorModel();
            	instrutor.setId(rs.getInt("id"));
            	instrutor.setNome(rs.getString("nome"));
            	instrutor.setEmail(rs.getString("email"));
            	instrutor.setValorHora(rs.getInt("valor_hora"));
            	instrutor.setLogin(rs.getString("login"));
            	instrutor.setSenha(rs.getString("senha"));
            	instrutor.setExperiencia(rs.getString("experiencia"));
            	instrutores.add(instrutor);
            }        	
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar todos os instrutores: " + e.getMessage());
        } finally {
            ConnectionDatabase.closeConnection(connection, stmt, rs);
        }

        return instrutores;
	}
	
	public void updateInstrutorDAO(InstrutorModel instrutor) {
		Connection connection = null;
        PreparedStatement stmt = null;
        
        try {
            connection = new ConnectionDatabase().getConnection();
            stmt = connection.prepareStatement("UPDATE instrutores SET nome = ?, email = ?, valor_hora = ?, login = ?, senha = ?, experiencia = ?");
            stmt.setString(1, instrutor.getNome());
            stmt.setString(2, instrutor.getEmail());
            stmt.setInt(3, instrutor.getValorHora());
            stmt.setString(4, instrutor.getLogin());
            stmt.setString(5, instrutor.getSenha());
            stmt.setString(6, instrutor.getExperiencia());
            stmt.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar instrutor DAO: " + e.getMessage());
        } finally {
            ConnectionDatabase.closeConnection(connection, stmt);
        }
	}
	
	public void deleteInstrutorDAO(int id) {
        Connection connection = null;
        PreparedStatement stmt = null;

        try {
            connection = new ConnectionDatabase().getConnection();
            stmt = connection.prepareStatement("DELETE FROM instrutores WHERE id = " + id);
            stmt.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error ao deletar instrutor: " + e.getMessage());
        } finally {
            ConnectionDatabase.closeConnection(connection, stmt);
        }
    }
}
