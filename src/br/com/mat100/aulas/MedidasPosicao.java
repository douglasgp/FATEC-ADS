package br.com.mat100.aulas;

import java.util.Scanner;

public class MedidasPosicao {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Declara��o das vari�veis
		int num = 4;
		int vetor[] = new int[num];
		double media = 0;
		// Estrutura para solicitar do usu�rio valores n vezes do tamanho do vetor
		for (int i = 0; i < num; i++) {
			System.out.println("Informe um valor inteiro: ");
			vetor[i] = scan.nextInt();
		}
		// Estrutura para calcular a m�dia de todos os valores informados pelo usu�rio
		for (int i = 0; i < vetor.length; i++) {
			media += vetor[i];
		}
		// C�lculo para dividir o resultado da soma dos valores informados pela quantidade de elementos.
		media /= num;
		System.out.println("M�dia = " + media);
	}
}
