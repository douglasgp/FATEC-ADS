package br.com.ied001.ordenacao;

import java.util.Random;

public class GeraNumero {
	// Instancia um aobjeto da classe Random usando o construtor padr�o
	public static Random gerador = new Random();

	public static int[] geraInt(int quantidade) {
		int[] valor = new int[quantidade];
		// Imprime uma sequ�ncia de 10 n�meros inteiros aleat�rios
		for (int i = 0; i < quantidade; i++) {
			valor[i] = gerador.nextInt(quantidade*quantidade);
			// System.out.println(gerador.nextLong());
		}
		return valor;
	}
	// M�todo principal para testar as funcionalidades de gera��o de valores
	/*
	public static void main(String[] args) {
		int qtd = 20;
		int[] vetor = new int[qtd];
		vetor = geraInt(qtd);

		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}*/

}
