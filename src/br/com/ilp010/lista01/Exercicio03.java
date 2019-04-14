package br.com.ilp010.lista01;

import java.util.Scanner;

/*
 * Construa uma aplica��o de console que receba (leia) um n�mero inteiro n,
 * imprimindo uma contagem, de um em um, de todos os n�meros naturais de 0
 * at� n (inclusive): 0, 1, 2, ..., n
 */
public class Exercicio03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Solicita do usu�rio um n�mero inteiro
		System.out.println("Informe um n�mero inteiro: ");
		int num = scan.nextInt();
		// Estrutura para apresentar a contagem dos n�meros
		for(int i = num; i > -1; i--) {
			System.out.println(i);
		}
	}
}
