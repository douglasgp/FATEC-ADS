package br.com.mpl002.aulas;

import java.util.Scanner;

public class Main {
	public static Scanner scan = new Scanner(System.in);
	public static int opcao = 0;
	public static void main(String[] args) {
		System.out.println("Informe a aula:\n");
		System.out.println("\n1. Aula 2) Conceitos inciais sobre matrizes");
		opcao = scan.nextInt();
		switch (opcao) {
		case 1:
			Mpl002.A02();
			break;

		default:
			break;
		}
	}

}
