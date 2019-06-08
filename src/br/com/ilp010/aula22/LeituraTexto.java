package br.com.ilp010.aula22;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class LeituraTexto {
	public static void main(String a[]) {
		if(a.length == 0) {
			System.out.println("uso:\nJava LeituraTexto <nomeArquivo>");
			System.exit(-1);
		}
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(a[0]));
			System.out.println("Arquivo '" + a[0] + "' aberto.");
		} catch (FileNotFoundException e) {
			System.out.println(e);
			System.exit(-1);
		}
		try {
			String line;
			System.out.println("=== Conteudo ===");
			// Leitura do stream
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			System.out.println("=== Conte�do ===");
			br.close();
			System.out.println("Arquivo '" + a[0] + "' fechado.");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
