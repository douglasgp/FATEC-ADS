package br.com.ilp010.lista01;

import java.util.Scanner;

public class ProdutoVetor {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int valor[] = { 1, 2, 3, 4, 5 };
		int total = valor[0];
		for (int i = 0; i <= 5; i++) {
			total *= valor[i];
			System.out.println(total);
		}
		System.out.println("Total = " + total);
	}
}
