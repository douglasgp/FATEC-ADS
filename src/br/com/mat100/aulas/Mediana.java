package br.com.mat100.aulas;

import java.util.Arrays;
import java.util.Scanner;

public class Mediana {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Solicita do usuário uma quantidade de elementos
		System.out.println("Infome a quantidade de total de elementos: ");
		int num = scan.nextInt();
		// Declaração das variáveis
		// int num = 0;
		int vetor[] = new int[num];
		int mediana = 0;
		int aux = 0;
		// Estrutura para solicitar do usuário o valores do vetor.
		System.out.println("Você irá informar " + num + " valores inteiros!");
		// Mensagem para apresentar quantidade de valores que deverá ser informado.
		for (int i = 0; i < num; i++) {
			System.out.println("Inform o " + (i + 1) + "º valor: ");
			vetor[i] = scan.nextInt();
		}
		// 1º Passo: Realizar ordenação crescente
		Arrays.parallelSort(vetor);
		System.out.println("Ordenação crescente dos valores!");
		for (int i = 0; i < num; i++) {
			System.out.println((i + 1) + "º posição: " + vetor[i]);
		}
		// 2º Identificar posição central
		if (vetor.length % 2 == 0) {
			aux = (vetor.length / 2);
			mediana = vetor[aux];
		} else {
			aux = (vetor.length - 1) / 2;
			mediana = vetor[aux];
		}

		// 3º Resgatar valor da posição central
		System.out.println("Posição central = " + (aux + 1) + "º = " + mediana);
	}
}
