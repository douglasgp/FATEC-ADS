package br.com.ilp010.lista01;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nome = "Ferdinando";

		int repete = 10;
		// Estrutura para repetir o nome
		for (int i = 0; i < 10; i++) {
			System.out.println((i+1) + "º vez: " +nome);
		}
	}
}
