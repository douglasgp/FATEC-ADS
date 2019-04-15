package br.com.ilp010.lista01;

import java.util.Scanner;

/*
 * Construa uma aplicação de console que receba (leia) um número inteiro n,
 * exibindo (imprimindo) a soma, de todos os números naturais de 1 até n
 * (inclusive), ou seja o resultado de 1 + 2 + ... + n. 
 */
public class Exercicio04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Solicita do usuário um número
		System.out.println("Informe um númeor inteiro: ");
		int num = scan.nextInt();
		int soma = 0;
		int i = 0;
		// Estrutura para somar os números naturais
		for (i = 0; i <= num; i++) {
			soma += i;
		}
		System.out.println("A soma de todos os números é = " + soma);
	}
}
