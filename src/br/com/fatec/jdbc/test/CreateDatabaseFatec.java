package br.com.fatec.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class CreateDatabaseFatec {
	public static void main(String[] args) throws Exception {
		String connectionString = "jdbc:mysql://localhost:3306";
		String user = "root";
		String password = "";

		//System.out.println("Opening connection ... ");
		JOptionPane.showMessageDialog(null, "Opening connection ...");
		Connection con = DriverManager.getConnection(connectionString, user, password);

		//System.out.println("Deleting the class database ...");
		JOptionPane.showMessageDialog(null, "Deleting the fatec database ...");
		String sql = "DROP DATABASE IF EXISTS fatec";
		PreparedStatement comand = con.prepareStatement(sql);
		comand.execute();
		comand.close();

		//System.out.println("Create the class database ...");
		JOptionPane.showMessageDialog(null, "Create the fatec database ...");
		sql = "CREATE DATABASE fatec";
		comand = con.prepareStatement(sql);
		comand.execute();
		comand.close();
		
		//System.out.println("Close connection ...");
		JOptionPane.showMessageDialog(null, "Close connection ... ");
		con.close();
	}

}
