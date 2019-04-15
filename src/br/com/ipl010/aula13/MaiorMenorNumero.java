package br.com.ipl010.aula13;

import java.util.Scanner;

public class MaiorMenorNumero {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Tamanho do vetor
		int n = 5;
		// Declaração do vetor
		int v[] = new int[n];
		// Entrada de dados
		for (int i = 0; i < n; i++) {
			System.out.println("Informe o " + (i + 1) + "º valor: ");
			v[i] = scan.nextInt();
		}
		// Estrutura para somar todos os valores e definir o maior e o menor valor
		int soma = 0;
		int menor = v[0];
		int maior = v[0];
		for (int i = 0; i < n; i++) {
			soma = soma + v[i];
			if (v[i] < menor)
				menor = v[i];
			if (v[i] > maior) {
				maior = v[i];
			}
		}
		// Estrutura para apresentar o resultado ao usuário.
		System.out.println("\n");
		for (int i = 0; i < n; i++) {
			if (v[i] == menor)
				System.out.printf("v[%d] = %2d <--- menor valor\n", i, v[i]);
			// System.out.println("v[" + i + "] = " + v[i] + " <--- menor valor");
			else if (v[i] == maior)
				System.out.printf("v[%d] = %2d <--- maior vlaor\n", i, v[i]);
			// System.out.println("v[" + i + "] = " + v[i] + " <--- maior valor");
		}
		System.out.println("\nSoma = " + soma);
	}
}
