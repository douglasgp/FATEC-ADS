package br.com.ied001.aulas;

public class Pilha02 {
	// Array interno para armazenar elemento da pilha
	private int v[];
	// Controle da próxima posição livre
	private int topo;

	// Construtor padrão, cria pilha com tamanho 10
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

	// Retorna capaciade (máxima) da pilha
	public int capacidade() {
		return v.length;
	}

	// Verifica se pilha está cheia
	public boolean cheia() {
		return capacidade() == comprimento();
	}

	// Retorna o número de elementos presentes na pilha
	public int comprimento() {
		return topo;
	}

	// Consulta, sem remover, o elemento da posição dada
	public int elemento(int pos) {
		return v[pos];
	}

	// Remove o elemento presente no topo da pilha
	public int remove() {
		return v[--topo];
	}

	// Verifica se pilha está vazia
	public boolean vazia() {
		return comprimento() == 0;
	}

	// Retorna uma String com a representação da pilha
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < topo; i++) {
			sb.append(v[i]);
			sb.append(", ");
		}
		sb.append("]");
		return sb.toString();
	}

}
