package br.com.ilp010.lista01;

import java.util.Scanner;

/*
 * Construa uma aplicação de console que receba (leia) um número inteiro n,
 * exibindo (imprimindo) o produto, de todos os números naturais de 1 até n
 * (inclusive), ou seja o resultado de 1 * 2 * ... * n.
 */
public class Exercicio05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Solicita do usuário um número inteiro
		System.out.println("Informe um número inteiro: ");
		int num = scan.nextInt();
		int produto = 1;
		// Estrutura para extrair o produto da soma dos números
		for(int i = 1; i <= num; i++) {
			produto *= i;
			System.out.println(produto);
		}
		System.out.println(produto);
	}
}
