package br.com.testes;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteTxt1 {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o nome do arquivo a ser criado: ");
		String arquivo = scan.nextLine();
		PrintWriter pw = new PrintWriter(new FileWriter("src/br/com/testes/"+arquivo+".txt"));
		pw.println("Início do arquivo");
		for(int i = 0; i < 5; i++) {
			pw.print(i);
			pw.print(", ");
		}
		pw.print("Fim!");
		pw.close();
	}
}
