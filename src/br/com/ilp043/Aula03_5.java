package br.com.ilp043;
/*
 * Escreva um programa que leia um arranjo de 10 elementos inteiros, 
 * exibindo o maior valor armazenado.
 */
import java.util.Scanner;

public class Aula03_5 {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// Variável com a quantidade valores
		int qtd = 10;
		// Declaração de array com a quantidade da var. "qtd"
		int arranjo[] = new int[qtd];
		// Estrutura para solicitar do usuário os valores do array
		for (int i = 0; i < arranjo.length; i++) {
			// Solicita do usuário valor da "n" posição
			System.out.println("Informe " + (i + 1) + " valor: ");
			// Armazena na posição "i" o valor informado
			arranjo[i] = scan.nextInt();
		}
		// Variável para armazenar o num maior
		int numMaior = arranjo[0];
		// Estrutura para armazenar em variável o maior número 
		for (int i = 0; i < arranjo.length; i++) {
			// Se elemento na posição i for maior que o valor armazenado na variável "numMaior"
			if(arranjo[i] > numMaior) {
				numMaior = arranjo[i];
			}
		}
		// Exibe o maior nº entre os elementos do array
		System.out.println("Maior número: " + numMaior);
	}

}
