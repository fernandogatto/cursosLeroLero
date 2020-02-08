package javaResources.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import javaResources.dao.connection.ConnectionDatabase;
import javaResources.model.TurmaModel;

public class TurmaDAO {

	public void insertTurmaDAO(TurmaModel turma) {
		Connection connection = null;
		PreparedStatement stmt = null;
		
		try {
			connection = new ConnectionDatabase().getConnection();
			stmt = connection.prepareStatement("INSERT INTO turmas (instrutores_id, cursos_id, data_inicio, data_final, carga_horaria) VALUES (?, ?, ?, ?, ?, ?)");
			stmt.setInt(1, turma.getId());
			stmt.setString(2, turma.getInstrutoresId());
			stmt.setString(3,  turma.getCursosId());
			stmt.setInt(4, turma.getDataInicio());
			stmt.setString(5, turma.getDataFinal());
			stmt.setString(6, turma.getCargaHoraria());
			stmt.execute();
		} catch(SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao registrar turma DAO: " + e.getMessage());
		} finally {
			ConnectionDatabase.closeConnection(connection, stmt);
		}
	}
	
	public TurmaModel listTurmaByIdDAO(int id) {
		Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        TurmaModel turma = null;
		
        try {
        	connection = new ConnectionDatabase().getConnection();
        	stmt = connection.prepareStatement("SELECT * FROM turmas WHERE id = ?");
        	rs = stmt.executeQuery();
        	if(rs.next()) {
        		turma = new TurmaModel();
        		turma.setInstrutoresId(rs.getString("instrutores_id"));
        		turma.setCursosId(rs.getString("cursos_id"));
        		turma.setDataInicio(rs.getInt("data_inicio"));
        		turma.setDataFinal(rs.getString("data_final"));
        		turma.setCargaHoraria(rs.getString("carga_horaria"));
        	}
        } catch(SQLException e) {
        	JOptionPane.showMessageDialog(null, "Erro ao listar turma pelo ID: " + e.getMessage());
        } finally {
            ConnectionDatabase.closeConnection(connection, stmt);
        }
        
        return turma;
	}
	
	public void updateTurmaDAO(TurmaModel turma) {
		Connection connection = null;
        PreparedStatement stmt = null;
        
        try {
            connection = new ConnectionDatabase().getConnection();
            stmt = connection.prepareStatement("UPDATE turmas SET instrutores_id = ?, cursos_id = ?, data_inicio = ?, data_final = ?, carga_horaria = ?");
            stmt.setString(1, turma.getInstrutoresId());
            stmt.setString(2, turma.getCursosId());
            stmt.setInt(3, turma.getDataInicio());
            stmt.setString(4, turma.getDataFinal());
            stmt.setString(5, turma.getCargaHoraria());
            stmt.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar turma DAO: " + e.getMessage());
        } finally {
            ConnectionDatabase.closeConnection(connection, stmt);
        }
	}
	
	public void deleteTurmaDAO(int id) {
        Connection connection = null;
        PreparedStatement stmt = null;

        try {
            connection = new ConnectionDatabase().getConnection();
            stmt = connection.prepareStatement("DELETE FROM turmas WHERE id = " + id);
            stmt.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error ao deletar turma: " + e.getMessage());
        } finally {
            ConnectionDatabase.closeConnection(connection, stmt);
        }
    }
}
