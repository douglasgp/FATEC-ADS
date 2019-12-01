package br.com.ied001.aulas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class LeituraTexto2 {
	public static void main(String[] args) {
		String arq = JOptionPane.showInputDialog("Nome do arquivo: ");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(arq));
		} catch (FileNotFoundException e) {
			System.out.println(e);
			System.exit(-1);
		}
		try {
			String line;
			System.out.println("--- Cabeçalho ---");
			// Leitura do stream
			String nome = JOptionPane.showInputDialog("Digite seu nome: ");
			BufferedWriter bw = new BufferedWriter(new FileWriter(arq));
			bw.write("Autor: ");
			bw.write(nome);
			bw.write("");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
