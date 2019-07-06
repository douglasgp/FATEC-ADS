package br.com.ilp010.aula24;

import java.io.FileWriter;
import java.io.PrintWriter;

public class EscreveTexto {
	public static void main(String[] args) throws Exception{
		PrintWriter pw = new PrintWriter(new FileWriter("arquivo2.txt"));
		pw.println("Início do arquivo");
		for(int i = 0; i < 5; i++) {
			pw.print(i);
			pw.print(", ");
		}
		pw.println("Fim");
		pw.close();
	}
}
