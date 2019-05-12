package br.com.ilp010.aula26;

import java.io.FileWriter;
import java.io.PrintWriter;

public class CriaArquivo {
	public static void main(String[] args) throws Exception {
		// Cria o arquivo para escrita
		PrintWriter ca = new PrintWriter(new FileWriter("etiqueta.txt"));

		// Escreve no arquivo
		ca.println();
		ca.println("Douglas Galdino Pereira");
		ca.println("Rua Projetada B");
		ca.println("110");
		ca.println("Chácara");
		ca.println("Jardim Iguatemi");
		ca.println("Bragança Paulista");
		ca.println("SP");
		ca.println("12922-000");

		ca.close();
	}
}
