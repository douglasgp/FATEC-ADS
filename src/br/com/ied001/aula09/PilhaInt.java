package br.com.ied001.aula09;

public class PilhaInt {
	// Declara vetor
	private int vet[];
	// Declara variável de controle;
	private int topo = 0;
	// Construtor com valor da variável tam
	public PilhaInt(int tam) {
		vet = new int[tam];
	}
	// Contrutor com valor padrão 
	public PilhaInt() {
		this(4);
	}
	// Função para retornar quantidade de elementos atualmente no vetor
	public int comprimento() {
		return topo;
	}
	// Função para retornar capacidade do vetor
	public int capacidade() {
		return vet.length;
	}
	// Função para inserir um elemento ao vetor
	public void adicionar(int elem) {
		vet[topo] = elem;
		topo++;
	}
	// Função para remover elemento do vetor
	public int remove() {
		topo--;
		return vet[topo];
	}
	// Função para quando vetor estiver vazio
	public boolean vazio() {
		return topo == 0;
	}
	public boolean cheia(int elem){
		if(vet.length == topo);
		return true;
	};
	
	/* PENDENTES de implementação
	 * public int elemento(int p){};
	 * public String toStriing(){};
	 */
	
}
