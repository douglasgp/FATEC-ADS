package br.com.ilp010.lista01;

import java.util.Scanner;

/*
 * Construa uma aplicação de console que receba (leia) um número inteiro n,
 * imprimindo uma contagem, de um em um, de todos os números naturais de 0
 * até n (inclusive): 0, 1, 2, ..., n
 */
public class Exercicio03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Solicita do usuário um número inteiro
		System.out.println("Informe um número inteiro: ");
		int num = scan.nextInt();
		// Estrutura para apresentar a contagem dos números
		for(int i = num; i > -1; i--) {
			System.out.println(i);
		}
	}
}
