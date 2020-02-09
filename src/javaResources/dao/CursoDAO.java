package javaResources.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import javaResources.dao.connection.ConnectionDatabase;
import javaResources.model.CursoModel;

public class CursoDAO {

	public void insertCursoDAO(CursoModel curso) {
		Connection connection = null;
		PreparedStatement stmt = null;
		
		try {
			connection = new ConnectionDatabase().getConnection();
			stmt = connection.prepareStatement("INSERT INTO cursos (nome, requisito, ementa, carga_horaria, preco) VALUES (?, ?, ?, ?, ?)");
			stmt.setString(1, curso.getNome());
			stmt.setString(2, curso.getRequisito());
			stmt.setString(3, curso.getEmenta());
			stmt.setInt(4, curso.getCargaHoraria());
			stmt.setDouble(5, curso.getPreco());
			stmt.execute();
		} catch(SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao registrar curso DAO: " + e.getMessage());
		} finally {
			ConnectionDatabase.closeConnection(connection, stmt);
		}
	}
	
	public CursoModel listCursoByIdDAO(int id) {
        Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        CursoModel curso = null;

        try {
            connection = new ConnectionDatabase().getConnection();
            stmt = connection.prepareStatement("SELECT * FROM cursos WHERE id = " + id);
            rs = stmt.executeQuery();
            if (rs.next()) {
                curso = new CursoModel();
                curso.setNome(rs.getString("nome"));
                curso.setRequisito(rs.getString("requisito"));
                curso.setEmenta(rs.getString("ementa"));
                curso.setCargaHoraria(rs.getInt("carga_horaria"));
                curso.setPreco(rs.getDouble("preco"));
                return curso;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar curso pelo ID: " + e.getMessage());
        } finally {
            ConnectionDatabase.closeConnection(connection, stmt);
        }

        return null;
    }
	
	public void updateCursoDAO(CursoModel curso) {
        Connection connection = null;
        PreparedStatement stmt = null;

        try {
            connection = new ConnectionDatabase().getConnection();
            stmt = connection.prepareStatement("UPDATE cursos SET nome = ?, requisito = ?, ementa = ?, carga_horaria = ?, preco = ?");
            stmt.setString(1, curso.getNome());
            stmt.setString(2, curso.getRequisito());
            stmt.setString(3, curso.getEmenta());
            stmt.setInt(4, curso.getCargaHoraria());
            stmt.setDouble(5, curso.getPreco());
            stmt.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar curso DAO: " + e.getMessage());
        } finally {
            ConnectionDatabase.closeConnection(connection, stmt);
        }
    }
	
	public void deleteCursoDAO(int id) {
        Connection connection = null;
        PreparedStatement stmt = null;

        try {
            connection = new ConnectionDatabase().getConnection();
            stmt = connection.prepareStatement("DELETE FROM cursos WHERE id = " + id);
            stmt.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error ao deletar curso: " + e.getMessage());
        } finally {
            ConnectionDatabase.closeConnection(connection, stmt);
        }
    }
	
}
