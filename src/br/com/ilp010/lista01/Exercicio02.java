package br.com.ilp010.lista01;

/*
 * Aplica��o de console que recebe uma String fornecida pelo usu�rio e 
 * tamb�m um n�mero inteiro n, imprimindo n vezes tal String.
 */
import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Solicita ao usu�rio um n�mero inteiro
		System.out.println("Informe um n�mero inteiro: ");
		int num = scan.nextInt();
		// Solicita ao usu�rio uma String
		System.out.println("Informe uma String: ");
		String palavra = scan.next();
		// Estrutura para repetir a String
		for (int i = 0; i < num; i++) {
			System.out.println(i + ": " + palavra);
		}
	}
}
