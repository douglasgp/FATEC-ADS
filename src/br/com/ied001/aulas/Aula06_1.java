package br.com.ied001.aulas;
/*
 *  INTERFACE
 */
public class Aula06_1 {
	
	// proteger as estruturas que podem ser modificadas
	private int v[] = new int[6];
	private int topo = 0;
	
	// função para empilhar conteúdo
	public void empilhar(int o) {
		if(!cheia()) {
			v[topo] = 0;
			topo++;
		}else {
			throw new RuntimeException();
		}
	}
	// função para desmpilhar
	public int desempilhar() {
		if(!vazia()) {
			topo--;
			return v[topo];
		}else {
			throw new RuntimeException();
		}
	}	
	// função para informar se está cheia
	public boolean cheia() {
		return topo == v.length;
	}
	// função para informar se está vazia
	public boolean vazia() {
		return topo == 0;
	}
	// Criar pilha de tamanho diferentes
	

}
