package javaResources.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import javaResources.dao.connection.ConnectionDatabase;
import javaResources.model.MatriculaModel;

public class MatriculaDAO {

	public void inserirMatriculaDAO(MatriculaModel matricula) {
		Connection connection = null;
		PreparedStatement stmt = null;
		
		try {
			connection = new ConnectionDatabase().getConnection();
			stmt = connection.prepareStatement("INSERT INTO matriculas (turmas_id, alunos_id, data_matricula, nota) VALUES (?, ?, ?, ?)");
			stmt.setInt(1, matricula.getIdTurma());
			stmt.setInt(2, matricula.getIdAluno());
			
			java.util.Date data = matricula.getDataMatricula();
			java.sql.Date dataMatricula = new java.sql.Date (data.getTime());
			stmt.setDate(3, dataMatricula);
			
			stmt.setDouble(4, matricula.getNota());
			stmt.execute();
		} catch(SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao registrar matricula DAO: " + e.getMessage());
		} finally {
			ConnectionDatabase.closeConnection(connection, stmt);
		}
	}
	
	public MatriculaModel listarMatriculaPorIdDAO(int id) {
        Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        MatriculaModel matricula = null;

        try {
            connection = new ConnectionDatabase().getConnection();
            stmt = connection.prepareStatement("SELECT * FROM matriculas WHERE id = " + id);
            rs = stmt.executeQuery();
            if (rs.next()) {
                matricula = new MatriculaModel();
                matricula.setIdTurma(rs.getInt("turmas_id"));
                matricula.setIdAluno(rs.getInt("alunos_id"));
                matricula.setDataMatricula(rs.getDate("data_matricula"));
                matricula.setNota(rs.getDouble("nota"));
                return matricula;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar matricula pelo ID: " + e.getMessage());
        } finally {
            ConnectionDatabase.closeConnection(connection, stmt);
        }

        return null;
    }
	
	public List<Integer> listarTurmasPorAlunoDAO(int id) {
        Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Integer> turmas = new ArrayList<>();
        
        try {
        	connection = new ConnectionDatabase().getConnection();
            stmt = connection.prepareStatement("SELECT turmas_id FROM matriculas WHERE alunos_id =" + id);
            rs = stmt.executeQuery();
            
            while(rs.next()) {
            	turmas.add(rs.getInt("turmas_id"));
        	}    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar turmas pelo ID do aluno: " + e.getMessage());
        } finally {
            ConnectionDatabase.closeConnection(connection, stmt);
        }

        return turmas;
    }
	
	public List<Integer> listarNotasPorAlunoDAO(int id) {
        Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Integer> notas = new ArrayList<>();
        
        try {
        	connection = new ConnectionDatabase().getConnection();
            stmt = connection.prepareStatement("SELECT notas FROM matriculas WHERE alunos_id =" + id);
            rs = stmt.executeQuery();
            
            while(rs.next()) {
            	notas.add(rs.getInt("notas"));
        	}    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar notas pelo ID do aluno: " + e.getMessage());
        } finally {
            ConnectionDatabase.closeConnection(connection, stmt);
        }

        return notas;
    }
	
	public List<Integer> listarAlunosPorTurmaDAO(int id) {
        Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Integer> alunos = new ArrayList<>();
        
        try {
        	connection = new ConnectionDatabase().getConnection();
            stmt = connection.prepareStatement("SELECT alunos_id FROM matriculas WHERE turmas_id =" + id);
            rs = stmt.executeQuery();
            
            while(rs.next()) {
            	alunos.add(rs.getInt("alunos_id"));
        	}    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar alunos pelo ID da turma: " + e.getMessage());
        } finally {
            ConnectionDatabase.closeConnection(connection, stmt);
        }

        return alunos;
    }
	
	public List<MatriculaModel> listarTodasMatriculasDAO() {
		Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<MatriculaModel> matriculas = new ArrayList<>();
        MatriculaModel matricula = null;
        
        try {
        	connection = new ConnectionDatabase().getConnection();
            stmt = connection.prepareStatement("SELECT * FROM matriculas");
            rs = stmt.executeQuery();
            
            while(rs.next()) {
            	matricula = new MatriculaModel();
            	matricula.setId(rs.getInt("id"));
        		matricula.setIdTurma(rs.getInt("turma_id"));
        		matricula.setIdAluno(rs.getInt("aluno_id"));
        		matricula.setDataMatricula(rs.getDate("data"));
        		matricula.setNota(rs.getInt("nota"));
        		
        		matriculas.add(matricula);
        	}     	
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar todas as matriculas: " + e.getMessage());
        } finally {
            ConnectionDatabase.closeConnection(connection, stmt, rs);
        }

        return matriculas;
	}
	
	public List<MatriculaModel> listarTodasMatriculasPorAlunoIdDAO(int id) {
		Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<MatriculaModel> matriculas = new ArrayList<>();
        MatriculaModel matricula = null;
        
        try {
        	connection = new ConnectionDatabase().getConnection();
            stmt = connection.prepareStatement("SELECT * FROM matriculas WHERE alunos_id = " + id);
            rs = stmt.executeQuery();
            
            while(rs.next()) {
            	matricula = new MatriculaModel();
            	matricula.setId(rs.getInt("id"));
        		matricula.setIdTurma(rs.getInt("turmas_id"));
        		matricula.setIdAluno(rs.getInt("alunos_id"));
        		matricula.setDataMatricula(rs.getDate("data_matricula"));
        		matricula.setNota(rs.getInt("nota"));
        		
        		matriculas.add(matricula);
        	}     	
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar todas as matriculas por aluno id: " + e.getMessage());
        } finally {
            ConnectionDatabase.closeConnection(connection, stmt, rs);
        }

        return matriculas;
	}
	
	public void alterarMatriculaDAO(MatriculaModel matricula) {
        Connection connection = null;
        PreparedStatement stmt = null;

        try {
            connection = new ConnectionDatabase().getConnection();
            stmt = connection.prepareStatement("UPDATE matriculas SET turmas_id = ?, alunos_id = ?, data_matricula = ?, nota = ? WHERE id = ?");
            stmt.setInt(1, matricula.getIdTurma());
            stmt.setInt(2, matricula.getIdAluno());
            
            java.util.Date data = matricula.getDataMatricula();
			java.sql.Date dataMatricula = new java.sql.Date (data.getTime());
			stmt.setDate(3, dataMatricula);
            
			stmt.setDouble(4, matricula.getNota());
            stmt.setInt(5, matricula.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar matricula DAO: " + e.getMessage());
        } finally {
            ConnectionDatabase.closeConnection(connection, stmt);
        }
    }
	
	public MatriculaModel listarMatriculaPorAlunoETurmaDAO(int aluno_id, int turma_id) {
        Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        MatriculaModel matricula = null;
        try {
        	connection = new ConnectionDatabase().getConnection();
            stmt = connection.prepareStatement("SELECT * FROM matriculas WHERE alunos_id =" + aluno_id + " AND turmas_id=" + turma_id);
            rs = stmt.executeQuery();
            
            if (rs.next()) {
            	matricula = new MatriculaModel();
            	matricula.setId(rs.getInt("id"));
        		matricula.setIdTurma(rs.getInt("turmas_id"));
        		matricula.setIdAluno(rs.getInt("alunos_id"));
        		matricula.setDataMatricula(rs.getDate("data_matricula"));
        		matricula.setNota(rs.getDouble("nota"));
        		
        		return matricula;
        	}     	
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar matricula pelo aluno e turma: " + e.getMessage());
        } finally {
            ConnectionDatabase.closeConnection(connection, stmt, rs);
        }
        return null;
	}
        
    public void darNotaMatriculaDAO(MatriculaModel matricula, double nota) {
    	 Connection connection = null;
         PreparedStatement stmt = null;
         ResultSet rs = null;
      
        try {
            connection = new ConnectionDatabase().getConnection();
            stmt = connection.prepareStatement("UPDATE matriculas SET nota = "+ nota +" WHERE id = " + matricula.getId());
            
            stmt.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar nota na matricula DAO: " + e.getMessage());
        } finally {
            ConnectionDatabase.closeConnection(connection, stmt);
        }
    }
	
	public void deletarMatriculaDAO(int id) {
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