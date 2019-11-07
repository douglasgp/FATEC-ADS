package br.com.ied001.aula04;
/*
 * Pilha com elementos do tipo inteiro
 */
public class PilhaInt {
	// Criação de um array do tipo inteiro sem informar seu tamanho
	private int[] v;
	// Variável para controle da capacidade de armazenamento da pilha iniciada em 0.
	private int topo = 0;

	/** Construtor default */
	public PilhaInt() {
		v = new int[6];
	}

	/**
	 * Construtor parametrizado (recebe parâmetros) para informar seu tamanho
	 * (capacidade)
	 */
	public PilhaInt(int tamanho) {
		v = new int[tamanho];
	}

	/**
	 * Método verificador se pilha está cheia
	 */
	public boolean pilhaCheia() {
		return topo == v.length;
	}

	/**
	 * Método verificador se pilha está vazia
	 */
	public boolean pilhaVazia() {
		return topo == 0;
	}

	/**
	 * Operação de inserção de elemento novo na pilha
	 */
	public void empilhar(int valor) {
		if (!pilhaCheia()) {
			v[topo] = valor;
			topo++;
		} else {
			throw new RuntimeException("Pilha CHEIA!");
		}
	}

	/**
	 * Operação de remoção de elemento na pilha
	 */
	public int desempilhar() {
		if (!pilhaVazia()) {
			topo--;
			return v[topo];
		} else {
			throw new RuntimeException("Pilha VAZIA!");
		}
	}

	/**
	 * Retorna capacidade da pilha
	 */
	public int capacidade() {
		return v.length;
	}

	/**
	 * Retorna a quantidade de elementos presentes na pilha (ou seu comprimento)
	 */
	public int comprimento() {
		return topo;
	}

	/**
	 * Consulta elemento presente na pilha
	 */
	public int elemento(int posicao) {
		if (posicao < topo) {
			return v[posicao];
		} else {
			throw new RuntimeException("Posição Inexistente!");
		}
	}

	/**
	 * Exibe pilha
	 */
	public String toString() {
		String aux = "[ ";
		for (int i = 0; i < topo; i++) {
			aux = aux + v[i] + " | ";
		}
		aux = aux + " ] " + comprimento();
		return aux;
	}
}
