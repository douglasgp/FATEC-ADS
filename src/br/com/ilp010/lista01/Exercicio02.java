package br.com.ilp010.lista01;

/*
 * Aplicação de console que recebe uma String fornecida pelo usuário e 
 * também um número inteiro n, imprimindo n vezes tal String.
 */
import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Solicita ao usuário um número inteiro
		System.out.println("Informe um número inteiro: ");
		int num = scan.nextInt();
		// Solicita ao usuário uma String
		System.out.println("Informe uma String: ");
		String palavra = scan.next();
		// Estrutura para repetir a String
		for (int i = 0; i < num; i++) {
			System.out.println(i + ": " + palavra);
		}
	}
}
