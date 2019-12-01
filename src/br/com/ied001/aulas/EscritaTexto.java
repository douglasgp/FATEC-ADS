package br.com.ied001.aulas;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class EscritaTexto {
	public static void main(String[] args) throws IOException {
		String arq = JOptionPane.showInputDialog("Nome do arquivo: ");
		// Uso do stream
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(arq))){
			System.out.println("Arquivo '"+arq+"' aberto.");
			System.out.println("Gerando conteúdo ...");
			String line;
			for (int i = 0; i < 10; i++) {
				line = "numero #" +i+" = " + Math.random() + "\r\n";
				bw.write(line,0,line.length());
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
			System.exit(-1);
		}catch (IOException e){
			System.out.println(e);
		} // bw.close() implicito
		System.out.println("Arquivo '" + arq + "' fechado.");
	}
}
