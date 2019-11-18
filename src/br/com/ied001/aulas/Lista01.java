package br.com.ied001.aulas;

public class Lista01 {
	// Array interno para armazenar elemento da lista
	private Object v[];
	// Controle da proxima posição livre
	private int fim;

	// Construtor padrão, cria pilha com tamanho 10
	public Lista01() {
		v = new Object[10];
		fim = 0;
	}

	// Construtor parametrizado com tamanho desejado
	public Lista01(int tam) {
		v = new Object[tam];
		fim = 0;
	}

	// Inserir elemento na posição da lista
	public void inserir(int pos, Object elem) {
		if (pos < 0 || pos > fim) {
			throw new RuntimeException("pos=" + pos + " inválida");
		} else if (fim == capacidade()) {
			throw new RuntimeException("lista cheia");
		}
		fim++;
		for (int i = fim - 1; i > pos; i--) {
			v[i] = v[i - 1];
		}
		v[pos] = elem;
	}

	// Adiciona elemento na lista
	public void adicionar(Object elem) {
		inserir(fim, elem);
	}

	// Retorna capacidade (maxima) da lista
	public int capacidade() {
		return v.length;
	}

	// Verifica se a lista está cheia
	public boolean cheia() {
		// return v.length==fim;
		return capacidade() == comprimento();
	}

	// Retorna o número de elementos presentes na lista
	public int comprimento() {
		return fim;
	}

	// Consulta, sem remover, o elemento da posição dada
	public Object elemento(int pos) {
		if (pos >= fim) {
			throw new RuntimeException("Posição inválida!");
		}
		return v[pos];
	}

	// Remove o elemento presente no início da fila
	public Object remover(int pos) {
		if (vazia()) {
			throw new RuntimeException("Lista vazia");
		}
		Object aux = elemento(pos);
		for (int i = pos + 1; i < fim; i++) {
			v[i - 1] = v[i];
		}
		fim--;
		return aux;
	}

	// Retorna o elemento do final sem removê-lo
	public Object fim() {
		return elemento(fim - 1);
	}

	// Retorna o elemento do início sem removê-lo
	public Object inicio() {
		return elemento(0);
	}

	// Verifica se lista está vazia
	public boolean vazia() {
		return comprimento() == 0;
	}

	// Retorna uma String com a representação da lista
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < fim - 1; i++) {
			sb.append(v[i]);
			sb.append(", ");
		}
		if (fim > 0) {
			sb.append(v[fim - 1]);
		}
		sb.append("]");
		return sb.toString();
	}

}
