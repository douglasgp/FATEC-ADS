package br.com.ied001.exercicios;
/*
 * Exercício 1 do slide ED-2018-04-Pilhas
 * 1. Escreva um programa que utilize uma pilha para armazenar 10 valores
 * inteiros dados pelo usuário, apresentando-os após sua entrada.
 */
public class Pilha401 {
	
	private int vPilha[];
	private int topo = 0;
	/*
	 * Construtor defaul parametrizado
	 */
	public Pilha401() {
		vPilha = new int[10];
	}
	/*
	 * Verifica se pilha está cheia
	 */
	public boolean pilhaCheia() {
		return topo == vPilha.length;
	}
	/*
	 * Verifica se pilha está vazia
	 */
	public boolean pilhaVazia() {
		return topo == 0;
	}
	/*
	 * Retorna a capacidade de armazenamento da pilha
	 */
	public int capacidade() {
		return vPilha.length;
	}
	/*
	 * Exibe o comprimento da pilha (qtd de elementos presentes na pilha)
	 */
	public int comprimento() {
		return topo;
	}
	/*
	 * Adiciona novo elemento na pilha
	 */
	public void adicionaElemento(int novoElemento) {
		if(!pilhaCheia()) {
			vPilha[topo] = novoElemento;
			topo++;
		} else {
			throw new RuntimeException("Pilha CHEIA!");
		}
	}
	/*
	 * Exibe informações da pilha
	 */
	public String toString() {
		String aux = "[ ";
		for (int i = 0; i < topo; i++) {
			aux = aux + vPilha[i] + " | ";
		}
		aux = aux + " ] " + comprimento();
		return aux;
	}
	
}
