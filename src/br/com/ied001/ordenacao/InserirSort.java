package br.com.ied001.ordenacao;

public class InserirSort {
	public static void main(String[] args) {

		int quantidade = 20;
		int[] vetor = new int[quantidade];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * quantidade);
			System.out.println(vetor[i]);
		}
		long tempoInicial = System.currentTimeMillis();
		
		inserirSort(vetor);

		long tempoFinal = System.currentTimeMillis();

		System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");
	}

	public static void inserirSort(int[] vetor) {
		int j;
		int chave;
		int i;

		for (j = 1; j < vetor.length; j++) {
			chave = vetor[j];
			for (i = j - 1; (i >= 0) && (vetor[i] > chave); i--) {
				vetor[i + 1] = vetor[i];
			}
			vetor[i + 1] = chave;
		}
	}

}
