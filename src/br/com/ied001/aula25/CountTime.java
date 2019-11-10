package br.com.ied001.aula25;

import java.util.Arrays;

public class CountTime {
	public static void main(String[] args) {
		int cont = 0;
		long soma = 0;
		long media = 0;

		// Cria um laço que roda 100 vezes
		for (int i = 0; i < 100; i++) {
			// Cria um array
			int v[] = new int[1000];
			// Cria um laço
			for (int j = 0; j < v.length; j++) {
				// Contagem de trás para frente
				v[i] = v.length - i;
			}
			// Tempo de inicio
			long inicio = System.nanoTime();
			// Ordenação do array
			Arrays.sort(v);
			// Tempo de finalização
			long fim = System.nanoTime();
			// Contador +1
			cont++;
			// Tempo de duração
			long tempo_total = fim - inicio;
			// Soma todos os tempos
			soma = soma + tempo_total;
			// Média de tempo
			media = soma / 100;
			// Imprime na tela
			System.out.println("Passagem Nº: " + cont);
			System.out.println("Inicio: " + inicio);
			System.out.println("Fim: " + fim);
			System.out.println("Tempo Total: " + (tempo_total));
			System.out.println("\n");
		}
		System.out.println("Total de ciclos realizados: " + cont);
		System.out.println("Soma total de tempo executados: " + soma + " nano segundos");
		System.out.println("Média de tempo: " + media + " nano segundos");
	}

}
