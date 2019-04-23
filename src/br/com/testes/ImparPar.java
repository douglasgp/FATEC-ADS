package br.com.testes;

import java.util.Scanner;

public class ImparPar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Variáveis
		int num = 10;
		int valor[] = { 12, 23, 36, 48, 51, 62, 73, 84, 95 };
		// Entrada de dados
		for (int i = 0; i <= valor.length; i++) {
			if (valor[i] % 2 == 0) {
				System.out.println(valor[i] + " é PAR");
			} else {
				System.out.println(valor[i] + " é ÍMPAR");
			}
		}
	}
}
