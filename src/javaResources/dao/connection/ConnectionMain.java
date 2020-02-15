package javaResources.dao.connection;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionMain {

	public static void main(String[] args) throws SQLException {
		Connection connection = new ConnectionDatabase().getConnection();
		System.out.println("conectado");
		connection.close();
	}

}
