package br.com.ilp010.p2;

/*
 * Escreva um programa Java que realize as seguintes tarefas:

leia valores inteiros para preencher um array de tamanho 20 (os valores são fornecidos pelo usuário durante a execução do programa);
o programa deve, então, solicitar um número inteiro adicional.
determine, por meio de uma função construída para esta finalidade, quantas vezes este número adicional ocorre dentre os valores do arquivo, por exemplo:
Array { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9 }
valor 3 --> duas ocorrências, função retorna 2
valor 11 --> nenhuma ocorrência, função retorna 0
valor 10 --> uma ocorrência, função retorna 1
Este programa DEVE ser de console (portanto os números serão lidos com um objeto da classe Scanner).
Caso a solução apresentada não contenha a função solicitada, ocorrerá o desconto de 1/3 do valor da questão.
 */
import java.util.Scanner;

public class E09 {
	// Elemento que recebe o tamanho do vetor
	private static int VALOR = 20;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Declaração do vetor com o tamanho de VALOR
		int num[] = new int[VALOR];
		// Estrutura para solicitar do usuário os valores
		for (int i = 0; i < VALOR; i++) {
			System.out.println("Informe o " + (i + 1) + "º valor (" + (i + 1) + "-|20):");
			num[i] = scan.nextInt();
		}
		// Número adicional
		int adicional = num[4];
		int contador = 0;
		for (int i = 0; i < VALOR; i++) {
			if (num[i] == adicional) {
				contador++;
			}
		}
		System.out.println("Frequência: " + contador);
		
	}

	// IMPLEMENTAÇÃO DE FUNÇÃO INCOMPLETA!
	// Função que verifica quantidade de vezes que valor aparece
	public static int freqValor(int[] resFunc) {
		int resultado = 0;
		int adicional = resFunc[4];
		int contador = 0;
		for (int i = 0; i < VALOR; i++) {
			if (resFunc[i] == adicional) {
				contador++;
			}
		}

		return contador;
	}

}
