package br.com.ied001.aulas;

public class Fila01 {
	// Lista interna para armazenar e adm elementos da fila
	private Lista01 lista01;

	// Construtor padr�o, cria pilha com tamanho 10
	public Fila01() {
		lista01 = new Lista01(10);
	}

	// Construtor parametrizado com tamanho desejado
	public Fila01(int tam) {
		lista01 = new Lista01(tam);
	}

	// Construtor parametrizado com lista (decora��o)
	public Fila01(Lista01 lista01) {
		this.lista01 = lista01;
	}

	// Adiciona elemento na fila
	public void adicionar(Object e) {
		lista01.adicionar(e);
	}

	// Retorna capacidade (m�xima) da fila
	public int capacidade() {
		return lista01.capacidade();
	}

	// Verifica se fila est� cheia
	public boolean cheia() {
		return lista01.cheia();
	}

	// Retorna o n�mero de elementos presentes na fila
	public int comprimento() {
		return lista01.comprimento();
	}

	// Consulta, sem remover, o elemento da posi��o dada
	public Object elemento(int pos) {
		return lista01.elemento(pos);
	}

	// Retorna o elemento do final sem remov�-lo
	public Object fim() {
		return lista01.elemento(lista01.comprimento() - 1);
	}

	// Retorna o elemento do in�cio sem remov�-lo
	public Object inicio() {
		return lista01.elemento(0);
	}

	// Remove o elemento presente no in�cio da fila
	public Object remover() {
		return lista01.remover(0);
	}

	// Verifica se fila est� vazia
	public boolean vazia() {
		return lista01.vazia();
	}

	// Retorna uma String com a representa��o da fila
	public String toString() {
		return "[" + lista01.toString() + "]";
	}

}
