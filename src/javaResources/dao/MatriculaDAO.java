package javaResources.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import javaResources.dao.connection.ConnectionDatabase;
import javaResources.model.MatriculaModel;

public class MatriculaDAO {

	public void insertMatriculaDAO(MatriculaModel matricula) {
		Connection connection = null;
		PreparedStatement stmt = null;
		
		try {
			connection = new ConnectionDatabase().getConnection();
			stmt = connection.prepareStatement("INSERT INTO matriculas (turmas_id, alunos_id, data_matricula, nota) VALUES (?, ?, ?, ?)");
			stmt.setInt(1, matricula.getId());
			stmt.setInt(2, matricula.getTurmasId());
			stmt.setInt(3, matricula.getAlunosId());
			stmt.setDate(4, matricula.getDataMatricula());
			stmt.setDouble(6, matricula.getNota());
			stmt.execute();
		} catch(SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao registrar matricula DAO: " + e.getMessage());
		} finally {
			ConnectionDatabase.closeConnection(connection, stmt);
		}
	}
	
	public MatriculaModel listMatriculaByIdDAO(int id) {
        Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        MatriculaModel matricula = null;

        try {
            connection = new ConnectionDatabase().getConnection();
            stmt = connection.prepareStatement("SELECT * FROM matricula WHERE id = " + id);
            rs = stmt.executeQuery();
            if (rs.next()) {
                matricula = new MatriculaModel();
                matricula.setTurmasId(rs.getString("turmas_id"));
                matricula.setAlunosId(rs.getString("alunos_id"));
                matricula.setEmenta(rs.getString("data_matricula"));
                matricula.setCargaHoraria(rs.getInt("nota"));
                return matricula;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar matricula pelo ID: " + e.getMessage());
        } finally {
            ConnectionDatabase.closeConnection(connection, stmt);
        }

        return null;
    }
	
	public void updateMatriculaDAO(MatriculaModel matricula) {
        Connection connection = null;
        PreparedStatement stmt = null;

        try {
            connection = new ConnectionDatabase().getConnection();
            stmt = connection.prepareStatement("UPDATE matriculas SET turmas_id = ?, alunos_id = ?, data_matricula = ?, nota = ?");
            stmt.setString(1, matricula.getNome());
            stmt.setString(2, matricula.getRequisito());
            stmt.setString(3, matricula.getEmenta());
            stmt.setInt(4, matricula.getCargaHoraria());
            stmt.setDouble(5, matricula.getPreco());
            stmt.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar matricula DAO: " + e.getMessage());
        } finally {
            ConnectionDatabase.closeConnection(connection, stmt);
        }
    }
	
	public void deleteMatriculaDAO(int id) {
        Connection connection = null;
        PreparedStatement stmt = null;

        try {
            connection = new ConnectionDatabase().getConnection();
            stmt = connection.prepareStatement("DELETE FROM matriculas WHERE id = " + id);
            stmt.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error ao deletar matricula: " + e.getMessage());
        } finally {
            ConnectionDatabase.closeConnection(connection, stmt);
        }
    }
	
}
