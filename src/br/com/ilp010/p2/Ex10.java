package br.com.ilp010.p2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * Escreva um programa Java que seja capaz de criar um arquivo de texto contendo o texto fornecido pelo usuário durante a execução do programa.

Assim, o programa deve:

solicitar ao usuário um nome de arquivo (uma String que poderia ser denominada nomeArquivo);
abrir um arquivo texto de maneira a permitir sua escrita;
solicitar ao usuário várias linha de texto (lidas com o nextLine() de um objeto Scanner),
até que uma String especial seja digitada (algo como "<!>" ou outro conteúdo improvável);
fechar o arquivo (o que encerra o programa).
Não é necessário efetuar o tratamento de exceções, de modo que o método main pode ser declarado como:
public static void main(String[] args) throws Exception

Lembre que a comparação de string é feita com o método equals(), por exemplo:
linha.equals("<!>") retorna true ou false, conforme linha seja ou não igual a "<!>".
 */
public class Ex10 {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o nome do arquivo: ");
		String nArquivo = scan.nextLine();

		PrintWriter pw = new PrintWriter(new FileWriter(nArquivo + ".txt"));

		BufferedReader bf = new BufferedReader(new FileReader(nArquivo + ".txt"));
		String linha = bf.readLine();
		int l = 0;
		System.out.println("Arquivo aberto para escrita: ");

		linha = scan.nextLine();

		while ((linha = bf.readLine()) != null) {
			System.out.println(l + " - " + linha);

			l++;
		}
		bf.close();
	}
}
