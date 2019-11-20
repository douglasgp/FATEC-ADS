package br.com.ied001.aulas;

/**
 * Estrutura linear, com comportamento de lista: a inserção e remoção de
 * elementos pode ocorrer em qualquer posição. Implementação utilizaa o
 * armazenamento sequencial.
 */
public class Lista02 {
	// Array interno de elementos
	protected Object v[];
	// Controle da ocupação do array
	protected int fim = 0;

	// Construtor parametrizado com o tamanho da lista
	public Lista02(int tam) {
		v = new Object[tam];
	}

	// Construtor padrão. Cria lista com tamanho 4
	public Lista02() {
		this(4);
	}

	// Retorna o número máximo de elementos na lista
	public int capacidade() {
		return v.length;
	}

	// Retorna o número atual de elementos presentes na lista
	public int comprimento() {
		return fim;
	}

	// Representação textual da lista (relação dos elementos presentes
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < fim; i++) {
			sb.append(v[i]);
			sb.append(" ");
		}
		sb.append("]");
		return sb.toString();
	}

	/**
	 * Insere um novo elemento na posição indicada
	 * 
	 * @param pos  posiçao de inserção
	 * @param elem novo elemento a ser inserido
	 */
	public void inserir(int pos, Object elem) {
		if (pos < 0 || pos > fim) {
			throw new RuntimeException("pos=" + pos + " inválida");
		} else if (fim == capacidade()) {
			throw new RuntimeException("Lista cheia");
		}
		fim++;
		for (int i = fim - 1; i > pos; i--) {
			v[i] = v[i - 1];
		}
		v[pos] = elem;
	}

	/**
	 * Adiciona novo elemento ao final da lista
	 * 
	 * @param elem novo elemento adicionado
	 */
	public void adicionar(Object elem) {
		// Utiliza método inserir existente!
		inserir(fim, elem);
	}

	/*
	 * Verifica se lista está vazia
	 * 
	 * @return true se lista vazia, false nos outros casos.
	 */
	public boolean vazia() {
		return fim == 0;
	}

	/*
	 * Verifica se lista está cheia
	 * 
	 * @return true se lista cheia, false nos outros casos
	 */
	public boolean cheia() {
		return fim == v.length;
	}

	/*
	 * Retorna o elemeto existente na posição indicada, sem removê-lo
	 * 
	 * @param pos posição do elemento desejado
	 * 
	 * @return
	 */
	public Object elemento(int pos) {
		if (pos < 0 || pos > fim) {
			throw new RuntimeException("pos=" + pos + " inválida!");
		}
		return v[pos];
	}

	/*
	 * Remove o elemento da posição indicada
	 * 
	 * @param pos posição do elemento a ser removido
	 * 
	 * @return elemento removido da lista
	 */
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

}
