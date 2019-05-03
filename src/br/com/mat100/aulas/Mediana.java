package br.com.mat100.aulas;

import java.util.Arrays;
import java.util.Scanner;

public class Mediana {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Solicita do usu�rio uma quantidade de elementos
		System.out.println("Infome a quantidade de total de elementos: ");
		int num = scan.nextInt();
		// Declara��o das vari�veis
		// int num = 0;
		int vetor[] = new int[num];
		int mediana = 0;
		int aux = 0;
		// Estrutura para solicitar do usu�rio o valores do vetor.
		System.out.println("Voc� ir� informar " + num + " valores inteiros!");
		// Mensagem para apresentar quantidade de valores que dever� ser informado.
		for (int i = 0; i < num; i++) {
			System.out.println("Inform o " + (i + 1) + "� valor: ");
			vetor[i] = scan.nextInt();
		}
		// 1� Passo: Realizar ordena��o crescente
		Arrays.parallelSort(vetor);
		System.out.println("Ordena��o crescente dos valores!");
		for (int i = 0; i < num; i++) {
			System.out.println((i + 1) + "� posi��o: " + vetor[i]);
		}
		// 2� Identificar posi��o central
		if (vetor.length % 2 == 0) {
			aux = (vetor.length / 2);
			mediana = vetor[aux];
		} else {
			aux = (vetor.length - 1) / 2;
			mediana = vetor[aux];
		}

		// 3� Resgatar valor da posi��o central
		System.out.println("Posi��o central = " + (aux + 1) + "� = " + mediana);
	}
}
