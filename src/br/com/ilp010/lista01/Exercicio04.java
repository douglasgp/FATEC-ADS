package br.com.ilp010.lista01;

import java.util.Scanner;

/*
 * Construa uma aplica��o de console que receba (leia) um n�mero inteiro n,
 * exibindo (imprimindo) a soma, de todos os n�meros naturais de 1 at� n
 * (inclusive), ou seja o resultado de 1 + 2 + ... + n. 
 */
public class Exercicio04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Solicita do usu�rio um n�mero
		System.out.println("Informe um n�meor inteiro: ");
		int num = scan.nextInt();
		int soma = 0;
		int i = 0;
		// Estrutura para somar os n�meros naturais
		for (i = 0; i <= num; i++) {
			soma += i;
		}
		System.out.println("A soma de todos os n�meros � = " + soma);
	}
}
