package javaResources.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import javaResources.dao.connection.ConnectionDatabase;
import javaResources.model.InstrutorModel;
import javaResources.model.CursoModel;
import javaResources.model.TurmaModel;

public class TurmaDAO {

	private static InstrutorModel instrutor;
	private static CursoModel curso;
	
	public void inserirTurmaDAO(TurmaModel turma) {
		Connection connection = null;
		PreparedStatement stmt = null;
		
		try {
			connection = new ConnectionDatabase().getConnection();
			stmt = connection.prepareStatement("INSERT INTO turmas (instrutores_id, cursos_id, data_inicio, data_final, carga_horaria) VALUES (?, ?, ?, ?, ?)");
			stmt.setInt(1, turma.getIdInstrutor());
			stmt.setInt(2, turma.getIdCurso());
			stmt.setDate(3, turma.getDataInicio());
			stmt.setDate(4, turma.getDataFinal());
			stmt.setInt(5, turma.getCargaHoraria());
			stmt.execute();
		} catch(SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao registrar turma DAO: " + e.getMessage());
		} finally {
			ConnectionDatabase.closeConnection(connection, stmt);
		}
	}
	
	public TurmaModel listarTurmaPorIdDAO(int id) {
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
        		turma.setIdInstrutor(rs.getInt("instrutores_id"));
        		turma.setIdCurso(rs.getInt("cursos_id"));
        		turma.setDataInicio(rs.getDate("data_inicio"));
        		turma.setDataFinal(rs.getDate("data_final"));
        		turma.setCargaHoraria(rs.getInt("carga_horaria"));
        	}
        } catch(SQLException e) {
        	JOptionPane.showMessageDialog(null, "Erro ao listar turma pelo ID: " + e.getMessage());
        } finally {
            ConnectionDatabase.closeConnection(connection, stmt);
        }
        
        return turma;
	}
	
	public List<TurmaModel> listarTodasTurmasDAO() {
		Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<TurmaModel> turmas = new ArrayList<>();
        TurmaModel turma = null;
        
        try {
        	connection = new ConnectionDatabase().getConnection();
            stmt = connection.prepareStatement("SELECT * FROM turmas");
            rs = stmt.executeQuery();
            
            while(rs.next()) {
            	turma = new TurmaModel();
        		turma.setIdInstrutor(rs.getInt("instrutores_id"));
        		turma.setIdCurso(rs.getInt("cursos_id"));
        		turma.setDataInicio(rs.getDate("data_inicio"));
        		turma.setDataFinal(rs.getDate("data_final"));
        		turma.setCargaHoraria(rs.getInt("carga_horaria"));
        	}     	
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar todas as turmas: " + e.getMessage());
        } finally {
            ConnectionDatabase.closeConnection(connection, stmt, rs);
        }

        return turmas;
	}
	
	public void alterarTurmaDAO(TurmaModel turma) {
		Connection connection = null;
        PreparedStatement stmt = null;
        
        try {
            connection = new ConnectionDatabase().getConnection();
            stmt = connection.prepareStatement("UPDATE turmas SET instrutores_id = ?, cursos_id = ?, data_inicio = ?, data_final = ?, carga_horaria = ? WHERE id = ?");
            stmt.setInt(1, turma.getIdInstrutor());
            stmt.setInt(2, turma.getIdCurso());
            stmt.setDate(3, turma.getDataInicio());
            stmt.setDate(4, turma.getDataFinal());
            stmt.setInt(5, turma.getCargaHoraria());
            stmt.setInt(6, turma.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar turma DAO: " + e.getMessage());
        } finally {
            ConnectionDatabase.closeConnection(connection, stmt);
        }
	}
	
	public void deletarTurmaDAO(int id) {
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