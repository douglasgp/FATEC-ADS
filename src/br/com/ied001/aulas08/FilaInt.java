package br.com.ied001.aulas08;

public class FilaInt {
	
	private int v[];
	private int fim = 0;
	// Método consntrutor 1 com parâmetos
	public FilaInt(int tam) {
		v = new int[tam];
	}
	// Método constutor 2 com parâmetros
	public FilaInt() {
		this(4);
	}
	public int comprimento() {
		return fim;
	}
	
	public int capacidade() {
		return v.length;
	}
	
	public String toString() {
		String aux = " [ ";
		for(int i = 0; i < fim; i++) {
			aux = aux + v[i] + " | ";
		}
		aux = aux + " ] " + comprimento();
		return aux;
	}
	/**
	 * Consulta de elemento na fila
	 */
	public int elemento(int p) {
		if(p < fim) {
			return v[p];
		} else {
			throw new RuntimeException("Posição Inexistente!");
		}
	}
	/**
	 * Insere elemento em uma posição na fila
	 */
	public void adicionar(int elem) {
		v[fim] = elem;
		fim++;
	}
	public int remover() {
		if(vazia()) {
			throw new RuntimeException("Vazia");
		}
		int aux = v[0];
		for(int i=1; i < fim; i++) {
			v[i-1] = v[i];
		}
		fim--;
		return aux;
	}
	public boolean vazia() {
		return fim == 0;
	}
	public boolean cheia() {
		return fim == v.length;
	}

}
