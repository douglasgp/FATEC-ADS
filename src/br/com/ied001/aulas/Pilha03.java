package br.com.ied001.aulas;

// Pilha de (elementos) inteiros
public class Pilha03 {
	// Array interno dos elementos da pilha
	private Object[] v;
	// Controle da pilha
	private int topo = 0;

	// Construtor padrão
	public Pilha03() {
		v = new Object[6];
	}

	// Construtor parametrizado com o tamanho da pilha
	public Pilha03(int tamanho) {
		v = new Object[tamanho];
	}

	// Verifica se pilha está cheia
	public boolean cheia() {
		return topo == v.length;
	}

	// Verifica se pilha está vazia
	public boolean vazia() {
		return topo == 0;
	}

	// Empilha um elemento
	public void adicionar(Object valor) {
		empilhar(valor);
	}

	// Operação para colocar novo elemento na pilha
	public void empilhar(Object valor) {
		if (!cheia()) {
			v[topo] = valor;
			topo++;
		} else {
			throw new RuntimeException("Pilha cheia!");
		}
	}

	// Operação para retirar um elemento da pilha
	public Object desempilhar() {
		if (!vazia()) {
			topo--;
			return v[topo];
		} else {
			throw new RuntimeException("Pilha vazia");
		}
	}

	// Retorna capaciade da pilha
	public int capacidade() {
		return v.length;
	}

	// Retorna o comprimento da pilha
	public int comprimento() {
		return topo;
	}

	// Consulta elemento presente na pilha
	public Object elemento(int posicao) {
		if (posicao < topo) {
			return v[posicao];
		} else {
			throw new RuntimeException("Posição inexistente!");
		}
	}

	// Visão geral da pilha
	public String toString() {
		String aux = "[";
		for (int i = 0; i < topo; i++) {
			aux = aux + v[i] + " | ";
		}
		aux = aux + "] " + comprimento();
		return aux;
	}

}
