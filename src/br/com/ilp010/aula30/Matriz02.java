package br.com.ilp010.aula30;

import java.util.Scanner;

public class Matriz02 {
	private static int LINHA;
	private static int COLUNA;
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Linha: ");
		LINHA = scan.nextInt();
		System.out.println("Coluna: ");
		COLUNA = scan.nextInt();
		// Declara e cria matriz bidimensional
		int a[][] = new int[LINHA][COLUNA];
		// Laço para percorrer as linhas da matriz
		for (int l = 0; l < LINHA; l++) {
			// laço para percorrer as colunas da matriz
			for (int c = 0; c < COLUNA; c++) {
				System.out.print("a["+l+"]["+c+"]=?");
				a[l][c] = scan.nextInt();
			}
		}
		// Laço para percorrer as linhas da matriz
		for(int l = 0; l < LINHA; l++) {
			// Laço para percorrer as colunas da matriz
			for(int c = 0; c < COLUNA; c++) {
				System.out.printf("| %4d ", a[l][c]);
			}
			System.out.println("|");
		}
	}
}
