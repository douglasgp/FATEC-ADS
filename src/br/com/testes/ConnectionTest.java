package br.com.testes;

import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import br.com.fatec.jdbc.ConnectionFactory;

public class ConnectionTest {
	public static void main(String[] args) {
		try {
			Connection connection = new ConnectionFactory().getConnection();
			JOptionPane.showMessageDialog(null, "Open connection!");
			connection.close();
		} catch (SQLException e) {
			throw new RuntimeException("Connection Error!");
		}
	}
	/*
	public void connectionTest() {
		try {
			Connection connection = new ConnectionFactory().getConnection();
			JOptionPane.showMessageDialog(null, "Open connection!");
			connection.close();
		} catch (Exception e) {
			throw new RuntimeException("Connection Error!");
		}
	}*/

}
