package javaResources.dao.connection;

import java.sql.*;

public class ConnectionDatabase {
    public Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost/escola", "root", null);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static void closeConnection (Connection a) {
        try {
            if (a != null)
                a.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void closeConnection (Connection a, PreparedStatement stmt) {
        closeConnection(a);
        try {
            if (stmt != null)
                stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void closeConnection (Connection a, PreparedStatement stmt, ResultSet rs) {
        closeConnection(a, stmt);
        try {
            if (rs != null)
                rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}