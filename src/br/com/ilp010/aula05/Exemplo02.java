package br.com.ilp010.aula05;

import java.util.Scanner;

public class Exemplo02 {
	public static void main(String[] args) {
		// Biblioteca que permite a leitura/atribuição de dados informados pelo usuário
		Scanner scan = new Scanner(System.in);
		// Apresenta uma informação para o usuário
		System.out.println("Informe um número inteiro: ");
		// Realiza a leitura de dados informados pelo usuário e atribui a uma variável do tipo inteiro
		int num = scan.nextInt();
		System.out.println("Informe seu nome: ");
		// Realiza a leitura de dados informados pelo usuário e atribui a uma variável do tipo String
		String nome = scan.next();
		// Apresenta para o usuário as informações que ele informou.
		System.out.println("Nome: " + nome);
		System.out.println("Número: " + num);
	}

}
