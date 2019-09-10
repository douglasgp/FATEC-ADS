package br.com.ied001.exercicios;

import java.util.Scanner;

public class Pilha401Main {
	public static void main(String[] args) {
		int elemento = 0;
		Scanner scan = new Scanner(System.in);
		
		Pilha401 p1 = new Pilha401();
		System.out.println("Pilha: " + p1);
		
		int valor = p1.capacidade();
		
		System.out.println(valor);
		while(!p1.pilhaCheia()) {
			p1.adicionaElemento(valor);
			System.out.println("Pilha: " + p1);
			valor++;
		}
	}

}
