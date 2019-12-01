package br.com.ied001.ordenacao;
import br.com.ied001.aulas.*;
public class TorreHanoi {
	
	public static void main(String[] args) {
		// Cria uma nova pilha
		Pilha02 pilha1 = new Pilha02();
		
		// Variável para a quantidade de elementos da pilha
		int qtd = 5;
		// Cria e insere no Vetor, quantidade de nº aleatórios, gerados por função de classe externa
		int[] vetor = GeraNumero.geraInt(qtd);
		/*Estrutura para exibir valores gerados e, atribuí-los a uma pilha */
		for (int i = 0; i < vetor.length; i++) {
			// Exibe números gerados
			System.out.println((i+1)+"º  valor: " + vetor[i]);
			// Insere números gerados a uma pilha
			pilha1.adicionar(vetor[i]);
		}
		/* Exibe pilha DESORDENADA */
		System.out.println("\n- - - Pilha Deserdenada - - - ");
		System.out.println(pilha1.toString());
		/* Ordena a pilha */
		pilha1.ordenaPilha(vetor);
		/* Exibe pilha ORDENADA */
		System.out.println("\n- - - Pilha Ordenada - - - ");
		// System.out.println(pilha.ordenaPilha());
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
		// System.out.println(aux);
		// int[] vetor = new int[qtd];
	}

}
