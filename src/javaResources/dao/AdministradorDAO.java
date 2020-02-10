package javaResources.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import javaResources.dao.connection.ConnectionDatabase;
import javaResources.model.AdministradorModel;

public class AdministradorDAO {
	
	public void inserirAdministradorDAO(AdministradorModel administrador) {
		Connection connection = null;
		PreparedStatement stmt = null;
		
		try {
			connection = new ConnectionDatabase().getConnection();
			stmt = connection.prepareStatement("INSERT INTO administrador (nome, login, senha) VALUES (?, ?, ?)");
			stmt.setString(1, administrador.getNome());
			stmt.setString(2, administrador.getLogin());
			stmt.setString(3, administrador.getSenha());
			stmt.execute();
		} catch(SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao registrar administrador DAO: " + e.getMessage());
		} finally {
			ConnectionDatabase.closeConnection(connection, stmt);
		}
	}
	
	public AdministradorModel listarAdministradorPorIdDAO(int id) {
        Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        AdministradorModel administrador = null;

        try {
            connection = new ConnectionDatabase().getConnection();
            stmt = connection.prepareStatement("SELECT * FROM administrador WHERE id = " + id);
            rs = stmt.executeQuery();
            if (rs.next()) {
                administrador = new AdministradorModel();
                administrador.setNome(rs.getString("nome"));
                administrador.setLogin(rs.getString("login"));
                administrador.setSenha(rs.getString("senha"));
                return administrador;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar administrador pelo ID: " + e.getMessage());
        } finally {
            ConnectionDatabase.closeConnection(connection, stmt);
        }

        return administrador;
    }
	
	public List<AdministradorModel> listarTodosAdministradoresDAO() {
		Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<AdministradorModel> administradores = new ArrayList<>();
        AdministradorModel administrador = null;
        
        try {
        	connection = new ConnectionDatabase().getConnection();
            stmt = connection.prepareStatement("SELECT * FROM admnistrador");
            rs = stmt.executeQuery();
            
            while(rs.next()) {
            	administrador = new AdministradorModel();
            	administrador.setId(rs.getInt("id"));
            	administrador.setNome(rs.getString("nome"));
            	administrador.setLogin(rs.getString("login"));
            	administrador.setSenha(rs.getString("senha"));
            	administradores.add(administrador);
            }        	
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar todos os administradores: " + e.getMessage());
        } finally {
            ConnectionDatabase.closeConnection(connection, stmt, rs);
        }
        
        return administradores;
	}
	
	public void alterarAdministradorDAO(AdministradorModel administrador) {
        Connection connection = null;
        PreparedStatement stmt = null;

        try {
            connection = new ConnectionDatabase().getConnection();
            stmt = connection.prepareStatement("UPDATE administrador SET nome = ?, login = ?, senha = ? WHERE id = ?");
            stmt.setString(1, administrador.getNome());
            stmt.setString(2, administrador.getLogin());
            stmt.setString(3, administrador.getSenha());
            stmt.setInt(4, administrador.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar administrador DAO: " + e.getMessage());
        } finally {
            ConnectionDatabase.closeConnection(connection, stmt);
        }
    }

    public void deletarAdministradorDAO(int id) {
        Connection connection = null;
        PreparedStatement stmt = null;

        try {
            connection = new ConnectionDatabase().getConnection();
            stmt = connection.prepareStatement("DELETE FROM administrador WHERE id = " + id);
            stmt.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error ao deletar administrador: " + e.getMessage());
        } finally {
            ConnectionDatabase.closeConnection(connection, stmt);
        }
    }

}