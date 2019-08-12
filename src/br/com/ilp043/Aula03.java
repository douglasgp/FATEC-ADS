package br.com.ilp043;

import java.util.Scanner;

public class Aula03 {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// Variável com a quantidade valores
		int qtd = 10;
		// Declaração de array com a quantidade da var. "qtd"
		int arranjo[] = new int[qtd];
		// Variável para armazenar o total da soma dos elementos do array
		int total = 0;
		// Estrutura para solicitar do usuário os valores do array
		for (int i = 0; i < arranjo.length; i++) {
			// Solicita do usuário valor da "n" posição
			System.out.println("Informe " + (i+1) + " valor: ");
			// Armazena na posição "i" o valor informado
			arranjo[i] = scan.nextInt();
		}
		// Estrutura para exibir os valores informados
		for (int i = 0; i < arranjo.length; i++) {
			// Exibe valores
			System.out.println((i+1) + "º: " + arranjo[i]);
		}
		// Estrutura para somar todos os valores informados
		for (int i = 0; i < arranjo.length; i++) {
			// Variável acumula e soma valores informados
			total += arranjo[i];
		}
		// Exibe a soma total
		System.out.println("Total: " + total);
		
		
	}

}
