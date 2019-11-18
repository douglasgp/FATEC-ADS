package br.com.ied001.aulas;

public class Fila02 {
	// Array interno dos elementos da fila
	private Object[] v;
	// controle da fila
	private int fim = 0;

	// Construtor padrão
	public Fila02() {
		v = new Object[6];
	}

	// Construtor parametrizado com tamanho da fila
	public Fila02(int tamanho) {
		v = new Object[tamanho];
	}

	// Verifica se fila está cheia
	public boolean cheia() {
		return fim == v.length;
	}

	// Verifica se fila está vazia
	public boolean vazia() {
		return fim == 0;
	}

	public void adicionar(Object valor) {
		entrar(valor);
	}

	// Operação para colocar novo elemento na fila
	public void entrar(Object valor) {
		if (!cheia()) {
			v[fim] = valor;
			fim++;
		} else {
			throw new RuntimeException("Fila cheia");
		}
	}

	public Object remover() {
		return sair();
	}

	public Object sair() {
		if (!vazia()) {
			Object aux = v[0];
			for (int i = 0; i < fim - 1; i++) {
				v[i] = v[i + 1];
			}
			fim--;
			return aux;
		} else {
			throw new RuntimeException("Fila vazia");
		}
	}

	/*
	 * Retorna capacidade da pilha (número máximo de elemento que podem ser
	 * armazenados na pilha
	 */
	public int capacidade() {
		return v.length;
	}

	/*
	 * Retorna o comprimento da pilha (número de elementos armazenados no momento da
	 * pilha)
	 */
	public int comprimento() {
		return fim;
	}

	// Consulta um elemento presente da pilha
	public Object elemento(int posicao) {
		if (posicao < fim) {
			return v[posicao];
		} else {
			throw new RuntimeException("Posição inexistente!");
		}
	}

	// Visão geral da pilha
	public String toString() {
		String aux = "[";
		for (int i = 0; i < fim; i++) {
			aux = aux + v[i] + " | ";
		}
		aux = aux + "]" + comprimento();
		return aux;
	}

}
