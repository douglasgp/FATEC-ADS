package br.com.ied001.aulas;

public class Pilha02Principal {
	public static void main(String[] args) {
		// Criar uma pilha
		Pilha02 p2 = new Pilha02(6);

		// Encher a pilha
		int e = 10;
		while (!p2.cheia()) {
			System.out.println(e + "-->" + p2);
			p2.adicionar(e);
			e = e + 10;
		}
		System.out.println(p2);

		// Esvaziar a pilha
		while (!p2.vazia()) {
			e = p2.remove();
			System.out.println(p2 + "-->" + e);
		}
	}

}
