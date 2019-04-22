package br.com.fatec.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class CreateTableClass {
	public static void main(String[] args) throws Exception {
		String connectionString = "jdbc:mysql://localhost:3306/fatec";
		String user = "root";
		String password = "";
		
		JOptionPane.showMessageDialog(null, "Opening connection ...");
		Connection con = DriverManager.getConnection(connectionString, user, password);
		
		JOptionPane.showMessageDialog(null, "Create table Class ...");
		String sql = "CREATE TABLE Class("+
				"id BIGINT NOT NULL AUTO_INCREMENT, "+
				"";
	}
}
