package br.com.ilp010.aula05;

import java.util.Scanner;

public class Exemplo02 {
	public static void main(String[] args) {
		// Biblioteca que permite a leitura/atribui��o de dados informados pelo usu�rio
		Scanner scan = new Scanner(System.in);
		// Apresenta uma informa��o para o usu�rio
		System.out.println("Informe um n�mero inteiro: ");
		// Realiza a leitura de dados informados pelo usu�rio e atribui a uma vari�vel do tipo inteiro
		int num = scan.nextInt();
		System.out.println("Informe seu nome: ");
		// Realiza a leitura de dados informados pelo usu�rio e atribui a uma vari�vel do tipo String
		String nome = scan.next();
		// Apresenta para o usu�rio as informa��es que ele informou.
		System.out.println("Nome: " + nome);
		System.out.println("N�mero: " + num);
	}

}
