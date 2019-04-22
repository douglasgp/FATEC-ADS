package br.com.ilp010.lista02;

import java.util.Scanner;

/*
 * Escreva um programa que utilize duas fun��es: uma que realize a
 * soma dos n�meros inteiros entre INI e FIM (par�metros que
* indicam o valor inicial e final da soma, ambos inclu�dos na soma) e
* outra para determinar valor de uma m�dia (dados os par�metros
 * soma e n�mero de valores).
 */
public class Ex04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Vari�veis
		int ini, fim;
		// Entrada de dados
		System.out.println("Informe um valor inicial: ");
		ini = scan.nextInt();
		System.out.println("Informe um valor final: ");
		fim = scan.nextInt();
		// Uso do m�todo soma
		int resultadoSoma = somaNum(ini, fim);
		System.out.println(resultadoSoma);
		// Uso do m�todo media
		double resultadoMedia = mediaNum(ini, fim, resultadoSoma);
		System.out.println(resultadoMedia);
	}

	// Fun��o para somar aos n�meros entre inicio e fim
	public static int somaNum(int inicio, int fim) {
		int soma = 0;
		for (int i = inicio; i <= fim; i++) {
			soma += i;
		}
		return soma;
	}

	public static double mediaNum(int inicio, int fim, int resultadoSoma) {
		int temp = fim - inicio;
		double media = 0;
		media = resultadoSoma / temp;
		return media;

	}
}
