package br.com.fatec.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://192.168.0.101/fatec", "root", "");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
