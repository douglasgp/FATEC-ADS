package br.com.ilp010.aula30;
/*
 * 1º. Declarar 3 matrizes
 * 2º. Ler valores para matriz A
 * 3º. Ler valores para matriz B
 * 4º. Soma matrizes onde:
 * 	C[l][c] = A[[l][c] + B[[l][c]
 */

import java.util.Scanner;

public class ConsolidaMatriz {
	private static int LINHAS;
	private static int COLUNAS;
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Informe o nº de linhas: ");
		LINHAS = scan.nextInt();
		System.out.println("Informe o nº de colunas: ");
		COLUNAS = scan.nextInt();
		// Criar matriz
		int A[][] = new int[LINHAS][COLUNAS];
		int B[][] = new int[LINHAS][COLUNAS];
		int res[][] = new int[LINHAS][COLUNAS];
		// Estrutura para percorrer as linhas da matriz
		for (int nlin = 0; nlin < LINHAS; nlin++) {
			// Estrutura para percorre as colunas da matriz
			for (int ncol = 0; ncol < COLUNAS; ncol++) {
				// Solicita do usuário valores da 1º matriz
				System.out.println("A[" + nlin + "][" + ncol + "]: ");
				A[nlin][ncol] = scan.nextInt();
			}
		}
		// Estrutura para percorrer as linhas da matriz
		for(int nlin = 0; nlin < LINHAS; nlin++) {
			// Estrura para percorrer as colunas da matriz
			for(int ncol = 0; ncol < COLUNAS; ncol++) {
				// Solicita do usuário valores da 2º matriz
				System.out.println("B["+nlin+"]["+ncol+"]: ");
				B[nlin][ncol] = scan.nextInt();
			}
		}
		// Soma valores correspondentes às posiçãos das duas matrizes: A + B
		for(int nlin = 0; nlin < LINHAS; nlin++) {
			for(int ncol =0; ncol < COLUNAS; ncol++) {
				res[nlin][ncol] = A[nlin][ncol] + B[nlin][ncol];
			}
		}
		// Apresenta os valores informados da matriz
		for (int nlin = 0; nlin < LINHAS; nlin++) {
			// Estrutura para percorre as colunas da matriz
			for (int ncol = 0; ncol < COLUNAS; ncol++) {
				// Solicita do usuário valores da 1º matriz
				System.out.printf("%4d ", res[nlin][ncol]);
			}
			System.out.println("|");
		}
	}
}
