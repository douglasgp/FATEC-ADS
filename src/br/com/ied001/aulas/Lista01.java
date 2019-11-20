package br.com.ied001.aulas;

public class Lista01 {
	// Array interno para armazenar elemento da lista
	private Object v[];
	// Controle da proxima posi��o livre
	private int fim;

	// Construtor padr�o, cria pilha com tamanho 10
	public Lista01() {
		v = new Object[10];
		fim = 0;
	}

	// Construtor parametrizado com tamanho desejado
	public Lista01(int tam) {
		v = new Object[tam];
		fim = 0;
	}

	// Inserir elemento na posi��o da lista
	public void inserir(int pos, Object elem) {
		if (pos < 0 || pos > fim) {
			throw new RuntimeException("pos=" + pos + " inv�lida");
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

	// Verifica se a lista est� cheia
	public boolean cheia() {
		// return v.length==fim;
		return capacidade() == comprimento();
	}

	// Retorna o n�mero de elementos presentes na lista
	public int comprimento() {
		return fim;
	}

	// Consulta, sem remover, o elemento da posi��o dada
	public Object elemento(int pos) {
		if (pos >= fim) {
			throw new RuntimeException("Posi��o inv�lida!");
		}
		return v[pos];
	}

	// Remove o elemento presente no in�cio da fila
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

	// Retorna o elemento do final sem remov�-lo
	public Object fim() {
		return elemento(fim - 1);
	}

	// Retorna o elemento do in�cio sem remov�-lo
	public Object inicio() {
		return elemento(0);
	}

	// Verifica se lista est� vazia
	public boolean vazia() {
		return comprimento() == 0;
	}

	// Retorna uma String com a representa��o da lista
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
