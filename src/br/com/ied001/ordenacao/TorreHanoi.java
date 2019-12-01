package br.com.ied001.ordenacao;

import br.com.ied001.aulas.*;
public class TorreHanoi {
	public static int qtd = 5;	
	public static void main(String[] args) {
		// Cria uma nova pilha
		Pilha02 pIni = new Pilha02();
		Pilha02 pFin = new Pilha02();
		Pilha02 pAux = new Pilha02();
		
		boolean status;
		
		// Variável para a quantidade de elementos da pilha

		// Cria e insere no Vetor, quantidade de nº aleatórios, gerados por função de classe externa
		int[] vetor = GeraNumero.geraInt(qtd);
		/* Estrutura para exibir valores gerados e, atribuí-los a uma pilha */
		for (int i = 0; i < vetor.length; i++) {
			// Exibe números gerados
			System.out.println((i+1)+"º  valor: " + vetor[i]);
			// Insere números gerados a uma pilha
			pIni.adicionar(vetor[i]);
		}
		/* Exibe pilha DESORDENADA */
		System.out.println("\n- - - Pilha Deserdenada - - - ");
		System.out.println(pIni.toString());

		/* Remove elementos desordenados da pilha */
		for (int i = 0; i < vetor.length; i++) {
			pIni.remove();
		}
		/* Ordena a pilha */
		pIni.ordenaPilha(vetor);
		status = pIni.verificaOrndena();
		
		System.out.println("\n- - - Pilha Ordenada - - - ");
		for (int i = 0; i < vetor.length; i++) {
			pIni.adicionar(vetor[i]);
			// System.out.println(vetor[i]);
		}
		// Exibe pilha
		System.out.println(pIni.toString());
		
		if(status) {
			System.out.println("Fim");
		}
		/* -> Ordena a pilha
		pilha1.ordenaPilha(vetor);
		-> Exibe pilha ORDENADA
		System.out.println("\n- - - Pilha Ordenada - - - ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}*/
		
	}
	
	public static void hanoi(int qtd, Pilha02 ini, Pilha02 fim, Pilha02 aux) {
		if(qtd > 0) {
			hanoi(qtd -1, ini, fim, aux);
			System.out.printf("Mover de %s para o %s",ini,fim);
			hanoi(qtd-1, aux, ini, fim);
		}
	}

}
