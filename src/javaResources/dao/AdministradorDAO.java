package javaResources.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import javaResources.dao.connection.ConnectionDatabase;
import javaResources.model.AdministradorModel;

public class AdministradorDAO {
	
	public void insertAdministradorDAO(AdministradorModel administrador) {
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
	
	public AdministradorModel listAdministradorByIdDAO(int id) {
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

        return null;
    }
	
	public void updateAdministradorDAO(AdministradorModel administrador) {
        Connection connection = null;
        PreparedStatement stmt = null;

        try {
            connection = new ConnectionDatabase().getConnection();
            stmt = connection.prepareStatement("UPDATE administrador SET nome = ?, login = ?, senha = ?");
            stmt.setString(1, administrador.getNome());
            stmt.setString(2, administrador.getLogin());
            stmt.setString(3, administrador.getSenha());
            stmt.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar administrador DAO: " + e.getMessage());
        } finally {
            ConnectionDatabase.closeConnection(connection, stmt);
        }
    }

    public void deleteAdministradorDAO(int id) {
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
