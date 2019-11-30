package br.com.ied001.aulas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.swing.JOptionPane;

public class LeituraTexto {
	public static void main(String[] args) {
		String arq = JOptionPane.showInputDialog("Nome do arquivo: ");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(arq));
			System.out.println("Arquivo '" + arq + "' aberto.");
		} catch (FileNotFoundException e) {
			System.out.println(e);
			System.exit(-1);
		}
		try {
			String line;
			System.out.println("--- Cabeçalho ---");
			// Leitura do stream
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			System.out.println("--- Rodapé ---");
			br.close();
			System.out.println("Arquivo '" + arq + "' fechado.");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
