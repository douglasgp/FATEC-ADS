package br.com.ilp010.aula30;
/*
 * 1�. Declarar 3 matrizes
 * 2�. Ler valores para matriz A
 * 3�. Ler valores para matriz B
 * 4�. Soma matrizes onde:
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
		System.out.println("Informe o nª de colunas: ");
		COLUNAS = scan.nextInt();
		// Criar matriz
		int A[][] = new int[LINHAS][COLUNAS];
		int B[][] = new int[LINHAS][COLUNAS];
		int res[][] = new int[LINHAS][COLUNAS];
		// Estrutura para percorrer as linhas da matriz
		for (int nlin = 0; nlin < LINHAS; nlin++) {
			// Estrutura para percorre as colunas da matriz
			for (int ncol = 0; ncol < COLUNAS; ncol++) {
				// Solicita do usuário valores da 1ês matriz
				System.out.println("A[" + nlin + "][" + ncol + "]: ");
				A[nlin][ncol] = scan.nextInt();
			}
		}
		// Estrutura para percorrer as linhas da matriz
		for(int nlin = 0; nlin < LINHAS; nlin++) {
			// Estrura para percorrer as colunas da matriz
			for(int ncol = 0; ncol < COLUNAS; ncol++) {
				// Solicita do usu�rio valores da 2� matriz
				System.out.println("B["+nlin+"]["+ncol+"]: ");
				B[nlin][ncol] = scan.nextInt();
			}
		}
		// Soma valores correspondentes �s posi��os das duas matrizes: A + B
		for(int nlin = 0; nlin < LINHAS; nlin++) {
			for(int ncol =0; ncol < COLUNAS; ncol++) {
				res[nlin][ncol] = A[nlin][ncol] + B[nlin][ncol];
			}
		}
		// Apresenta os valores informados da matriz
		for (int nlin = 0; nlin < LINHAS; nlin++) {
			// Estrutura para percorre as colunas da matriz
			for (int ncol = 0; ncol < COLUNAS; ncol++) {
				// Solicita do usu�rio valores da 1� matriz
				System.out.printf("%4d ", res[nlin][ncol]);
			}
			System.out.println("|");
		}
	}
}
