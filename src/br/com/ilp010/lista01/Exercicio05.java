package br.com.ilp010.lista01;

import java.util.Scanner;

/*
 * Construa uma aplica��o de console que receba (leia) um n�mero inteiro n,
 * exibindo (imprimindo) o produto, de todos os n�meros naturais de 1 at� n
 * (inclusive), ou seja o resultado de 1 * 2 * ... * n.
 */
public class Exercicio05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Solicita do usu�rio um n�mero inteiro
		System.out.println("Informe um n�mero inteiro: ");
		int num = scan.nextInt();
		int produto = 1;
		// Estrutura para extrair o produto da soma dos n�meros
		for(int i = 1; i <= num; i++) {
			produto *= i;
			System.out.println(produto);
		}
		System.out.println(produto);
	}
}
