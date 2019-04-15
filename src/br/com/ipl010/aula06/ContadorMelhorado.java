package br.com.ipl010.aula06;

import java.util.Scanner;

public class ContadorMelhorado {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int valorInicial;
		do {
			System.out.println("Valor inicial maior que 0: ");
			valorInicial = scan.nextInt();
		} while (valorInicial <= 0);

		int valorFinal = 0;
		int passo = 1;
		// Contador e valor inicial
		int contador = valorInicial;

		for (int i = valorInicial; i > 0; i = i - passo) {
			System.out.println(contador);
			// Atualização do contador.
			contador = contador - 1;
			Thread.sleep(500);
		}
		System.out.println("Buuummm!!!");
	}

}
