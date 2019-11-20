package br.com.ied001.aulas;

public class Pilha01 {
	// Array interno para armazenar elemento da pilha
	private Object v[];
	// Controle da próxima posição livre
	private int topo;

	// Construtor padrão, cria pilha com tamanho 10
	public Pilha01() {
		v = new Object[10];
		topo = 0;
	}

	// Construtor parametrizado com tamanho desejado
	public Pilha01(int tam) {
		v = new Object[tam];
		topo = 0;
	}

	// Adiciona elemento na pilha
	public void adicionar(Object e) {
		v[topo] = e;
		topo++;
	}

	// Retorna capacidade (máxima) da pilha
	public int capacidade() {
		return v.length;
	}

	// Verifica se pilha está cheia
	public boolean cheia() {
		// return v.lenght == topo;
		return capacidade() == comprimento();
	}

	// Retorna o número de elementos presentes a pilha
	public int comprimento() {
		return topo;
	}

	// Consulta, sem remover, o elemento da posição dada
	public Object elemento(int pos) {
		if (pos >= topo) {
			throw new RuntimeException("Posição invália!");
		}
		return v[pos];
	}

	// Remove o elemento presente no topo da pilha
	public Object remover() {
		return v[--topo];
	}

	// Retorna o elemento do topo sem removê-lo
	public Object topo() {
		return elemento(topo - 1);
	}

	// Verifica se pilha está vazia
	public boolean vazia() {
		return comprimento() == 0;
	}

	// Retorna uma String com a representação da pilha
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < topo - 1; i++) {
			sb.append(v[i]);
			sb.append(", ");
		}
		if (topo > 0) {
			sb.append(v[topo - 1]);
		}
		sb.append("]");
		return sb.toString();
	}

}
