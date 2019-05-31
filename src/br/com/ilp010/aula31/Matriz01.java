package br.com.ilp010.aula31;

import java.util.Scanner;

public class Matriz01 {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// 1. Ler tamanho das LINHAS e COLUNAS das matrizes
		System.out.println("Informe o número de linhas: ");
		int numLin = scan.nextInt();
		System.out.println("Informe o número de colunas: ");
		int numCol = scan.nextInt();
		// 1.1. Declara contador a ser usado dentro do 'for'
		int res = 0;
		// 2. Criar matrizes A, B, e C dos mesmos tamnhos
		int mat1[][] = new int[numLin][numCol];
		int mat2[][] = new int[numLin][numCol];
		int matR[][] = new int[numLin][numCol];
		// 3. Ler matriz A
		for (int l = 0; l < numLin; l++) {
			for (int c = 0; c < numCol; c++) {
				System.out.println("mat1[" + l + "][" + c + "]: ");
				mat1[l][c] = scan.nextInt();
			}
		}
		// 4. Ler matriz B
		for (int l = 0; l < numLin; l++) {
			for (int c = 0; c < numCol; c++) {
				System.out.println("mat2[" + l + "][" + c + "]: ");
				mat2[l][c] = scan.nextInt();
			}
		}
		// 5. Somar as posições das matrizes A e B atribuindo o resultado à matriz C
		for (int l = 0; l < numLin; l++) {
			for (int c = 0; c < numCol; c++) {
				matR[l][c] = mat1[l][c] + mat2[l][c];
			}
		}
		// 6. Exibir resultado da matriz C
		for (int l = 0; l < numLin; l++) {
			for (int c = 0; c < numCol; c++) {
				System.out.printf("| %2d ", matR[l][c]);
			}
			System.out.println("|");
		}
		// 7. Apresentar pré-visualização das matrizes
		System.out.println("\n= = MATRIZ 1 = = ");
		for (int l = 0; l < numLin; l++) {
			for (int c = 0; c < numCol; c++) {
				System.out.printf("| %2d ", mat1[l][c]);
			}
			System.out.println(" | ");
		}
		System.out.println("\n= = MATRIZ 2 = = ");
		for (int l = 0; l < numLin; l++) {
			for (int c = 0; c < numCol; c++) {
				System.out.printf("| %2d ", mat2[l][c]);
			}
			System.out.println(" | ");
		}
	}
}
