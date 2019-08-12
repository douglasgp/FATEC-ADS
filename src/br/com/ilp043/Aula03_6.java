package br.com.ilp043;

import java.util.Scanner;

public class Aula03_6 {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// Solicita do usuário o tamanho do array
		System.out.println("Tamanho array: ");
		// Armazena em variável o tamanho do array
		int tamanho = scan.nextInt();
		// Macete para consumir uso da tecla "Enter" após inserir tamanho do array
		scan.nextLine();
		// Estrutura para solicitar do usuário as Strings
		String arranjo[] = new String[tamanho];
		for (int i = 0; i < arranjo.length; i++) {
			// Solicita do usuário as Strings
			System.out.println("Informe " + (i+1) + " String: ");
			// Armazena na posção i a String informada pelo usuário
			arranjo[i] = scan.nextLine();
		}
		// Estrutura para exibir cada posição do arranjo
		for (int i = 0; i < arranjo.length; i++) {
			System.out.println(arranjo[i]);
		}
	}

}
