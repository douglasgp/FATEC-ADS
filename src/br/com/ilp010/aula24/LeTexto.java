package br.com.ilp010.aula24;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class LeTexto {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Informe o nome do arquivo: ");
			String arquivo;
			arquivo = scan.next();
			// Biblioteca para uso da leitura e escrita
			// BufferedReader � o duto, e a aplica��o controla o arquivo pelo duto de
			// passagem.
			BufferedReader br = new BufferedReader(new FileReader("src/br/com/ilp010/trabalho2/"+arquivo + ".txt"));
			String linha;
			int l = 1;
			while ((linha = br.readLine()) != null) {
				System.out.println(l + ": " + linha);
				l++;
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
