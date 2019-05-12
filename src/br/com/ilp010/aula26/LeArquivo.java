package br.com.ilp010.aula26;

import java.io.BufferedReader;
import java.io.FileReader;

public class LeArquivo {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new FileReader("etiqueta.txt"));
		String linha = bf.readLine();
		int l = 0;
		while ((linha = bf.readLine()) != null) {
			System.out.println(l + " - " + linha);
			l++;
		}
		bf.close();
	}
}
