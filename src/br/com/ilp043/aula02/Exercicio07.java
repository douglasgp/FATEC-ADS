package br.com.ilp043.aula02;

import java.util.Scanner;

public class Exercicio07 {
	public static Scanner scan = new Scanner(System.in);
	public static int tamVetor = 5;
	public static int vetInt[] = new int[tamVetor];
	
	public static void main(String[] args) {
		// Variáveis para armazenar resultado da soma de nº negativos e positivos
		int neg = 0;
		int pos = 0;
		// Estrutura para percorrer vetor
		for (int i = 0; i < vetInt.length; i++) {
			// Solicita um número
			System.out.println("Informe " + (i + 1) + "º número: ");
			// Armazena na posição i o valor informado
			vetInt[i] = scan.nextInt();
			scan.hasNextLine();
			// Se valor maior que zero
			if (vetInt[i] > 0) {
				// Variável recebe e soma o valor na posição i
				pos += vetInt[i];
			// Se valor manor que zero
			} else {
				// Variável recebe e soma valor na posição i
				neg += vetInt[i];
			}
		}
		// Exibe resultado
		System.out.println("Total negativo: " + neg);
		System.out.println("Total positivo: " + pos);

	}
}
