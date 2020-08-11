package br.com.ied001.aulas;

public class Pilha02 {
	// Array interno para armazenar elemento da pilha
	private int v[];
	// Controle da pr�xima posi��o livre
	private int topo;

	// Construtor padr�o, cria pilha com tamanho 10
	public Pilha02() {
		v = new int[10];
	}

	// Construtor parametrizado com tamanho desejado
	public Pilha02(int tam) {
		v = new int[tam];
	}

	// Adiciona elemento na pilha
	public void adicionar(int e) {
		v[topo] = e;
		topo++;
	}

	// Retorna capaciade (m�xima) da pilha
	public int capacidade() {
		return v.length;
	}

	// Verifica se pilha est� cheia
	public boolean cheia() {
		return capacidade() == comprimento();
	}

	// Retorna o n�mero de elementos presentes na pilha
	public int comprimento() {
		return topo;
	}

	// Consulta, sem remover, o elemento da posi��o dada
	public int elemento(int pos) {
		return v[pos];
	}

	// Remove o elemento presente no topo da pilha
	public int remove() {
		return v[--topo];
	}

	// Verifica se pilha est� vazia
	public boolean vazia() {
		return comprimento() == 0;
	}

	// Retorna uma String com a representa��o da pilha
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < topo; i++) {
			sb.append(v[i]);
			sb.append(", ");
		}
		sb.append("]");
		return sb.toString();
	}

	/* Estrutura para ordenar uma pilha */
	public int[] ordenaPilha(int[] vetor) {
		int prox = 0;
		int aux = 0;
		while (aux < vetor.length) {
			for (int i = 0; i < vetor.length - 1; i++) {

				if (vetor[i] > vetor[i + 1]) {
					prox = vetor[i];
					vetor[i] = vetor[i + 1];
					vetor[i + 1] = prox;
				}
			}
			aux++;
		}
		return vetor;
	}

	public boolean verificaOrndena() {
		// TODO Auto-generated method stub
		return false;
	}

}
