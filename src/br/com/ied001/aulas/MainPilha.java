package br.com.ied001.aulas;

import ed.linear.PilhaInt;

public class MainPilha {
	public static void main(String[] args) {
		// Usar pilha de inteiros
		PilhaInt p = new PilhaInt();
		System.out.println("Pilha: " + p.capacidade());

		int valor = 14;
		while (!p.pilhaCheia()) {
			p.empilhar(valor);
			System.out.println("Pilha: " + p);
			valor++;
		}

		while (!p.pilhaVazia()) {
			System.out.println(p.desempilhar());
			System.out.println("Pilha: " + p);
		}
	}
}
