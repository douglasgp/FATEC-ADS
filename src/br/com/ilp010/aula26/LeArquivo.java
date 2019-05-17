package br.com.ilp010.aula26;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class LeArquivo {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o nome do arquivo para leitura: ");
		String arquivo = scan.next();
		
		BufferedReader bf = new BufferedReader(new FileReader(arquivo + ".db"));
		String linha = bf.readLine();
		int l = 0;
		while ((linha = bf.readLine()) != null) {
			System.out.println(l + " - " + linha);
			l++;
		}
		bf.close();
	}
}
