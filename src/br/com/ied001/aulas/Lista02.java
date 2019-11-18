package br.com.ied001.aulas;

/**
 * Estrutura linear, com comportamento de lista: a inser��o e remo��o de
 * elementos pode ocorrer em qualquer posi��o. Implementa��o utilizaa o
 * armazenamento sequencial.
 */
public class Lista02 {
	// Array interno de elementos
	protected Object v[];
	// Controle da ocupa��o do array
	protected int fim = 0;

	// Construtor parametrizado com o tamanho da lista
	public Lista02(int tam) {
		v = new Object[tam];
	}

	// Construtor padr�o. Cria lista com tamanho 4
	public Lista02() {
		this(4);
	}

	// Retorna o n�mero m�ximo de elementos na lista
	public int capacidade() {
		return v.length;
	}

	// Retorna o n�mero atual de elementos presentes na lista
	public int comprimento() {
		return fim;
	}

	// Representa��o textual da lista (rela��o dos elementos presentes
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
	 * Insere um novo elemento na posi��o indicada
	 * 
	 * @param pos  posi�ao de inser��o
	 * @param elem novo elemento a ser inserido
	 */
	public void inserir(int pos, Object elem) {
		if (pos < 0 || pos > fim) {
			throw new RuntimeException("pos=" + pos + " inv�lida");
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
		// Utiliza m�todo inserir existente!
		inserir(fim, elem);
	}

	/*
	 * Verifica se lista est� vazia
	 * 
	 * @return true se lista vazia, false nos outros casos.
	 */
	public boolean vazia() {
		return fim == 0;
	}

	/*
	 * Verifica se lista est� cheia
	 * 
	 * @return true se lista cheia, false nos outros casos
	 */
	public boolean cheia() {
		return fim == v.length;
	}

	/*
	 * Retorna o elemeto existente na posi��o indicada, sem remov�-lo
	 * 
	 * @param pos posi��o do elemento desejado
	 * 
	 * @return
	 */
	public Object elemento(int pos) {
		if (pos < 0 || pos > fim) {
			throw new RuntimeException("pos=" + pos + " inv�lida!");
		}
		return v[pos];
	}

	/*
	 * Remove o elemento da posi��o indicada
	 * 
	 * @param pos posi��o do elemento a ser removido
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
