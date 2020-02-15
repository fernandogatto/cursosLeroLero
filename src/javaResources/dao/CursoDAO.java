package javaResources.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import javaResources.dao.connection.ConnectionDatabase;
import javaResources.model.CursoModel;

public class CursoDAO {

	public void inserirCursoDAO(CursoModel curso) {
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
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao registrar curso DAO: " + e.getMessage());
		} finally {
			ConnectionDatabase.closeConnection(connection, stmt);
		}
	}
	
	public CursoModel listarCursoPorIdDAO(int id) {
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
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar curso pelo ID: " + e.getMessage());
        } finally {
            ConnectionDatabase.closeConnection(connection, stmt);
        }

        return null;
    }
	
	public List<CursoModel> listarTodosCursosDAO() {
		Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<CursoModel> cursos = new ArrayList<>();
        CursoModel curso = null;
        
        try {
        	connection = new ConnectionDatabase().getConnection();
            stmt = connection.prepareStatement("SELECT * FROM cursos");
            rs = stmt.executeQuery();
            
            while(rs.next()) {
            	curso = new CursoModel();
            	curso.setId(rs.getInt("id"));
            	curso.setNome(rs.getString("nome"));
            	curso.setRequisito(rs.getString("requisito"));
            	curso.setEmenta(rs.getString("ementa"));
            	curso.setCargaHoraria(rs.getInt("carga_horaria"));
            	curso.setPreco(rs.getDouble("preco"));
            	cursos.add(curso);
            }        	
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar todos os cursos: " + e.getMessage());
        } finally {
            ConnectionDatabase.closeConnection(connection, stmt, rs);
        }

        return cursos;
	}
	

	
	public void alterarCursoDAO(CursoModel curso) {
        Connection connection = null;
        PreparedStatement stmt = null;

        try {
            connection = new ConnectionDatabase().getConnection();
            stmt = connection.prepareStatement("UPDATE cursos SET nome = ?, requisito = ?, ementa = ?, carga_horaria = ?, preco = ? WHERE id = ?");
            stmt.setString(1, curso.getNome());
            stmt.setString(2, curso.getRequisito());
            stmt.setString(3, curso.getEmenta());
            stmt.setInt(4, curso.getCargaHoraria());
            stmt.setDouble(5, curso.getPreco());
            stmt.setInt(6, curso.getId());
            
            stmt.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar curso DAO: " + e.getMessage());
        } finally {
            ConnectionDatabase.closeConnection(connection, stmt);
        }
    }
	
	public void deletarCursoDAO(int id) {
        Connection connection = null;
        PreparedStatement stmt = null;

        try {
            connection = new ConnectionDatabase().getConnection();
            stmt = connection.prepareStatement("DELETE FROM cursos WHERE id = " + id);
            stmt.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ao deletar curso: " + e.getMessage());
        } finally {
            ConnectionDatabase.closeConnection(connection, stmt);
        }
    }
	
}
