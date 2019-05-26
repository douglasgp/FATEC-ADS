package br.com.ilp010.aula30;

public class Matriz01 {
	// Tamanho da matriz
	private final static int LINHA = 3;
	private final static int COLUNA = 4;

	public static void main(String[] args) {
		// Declara e cria matriz bidimensional
		int[][] a = new int[LINHA][COLUNA];

		int contador = 0;
		// Laço para percorrer as linhas da matriz
		for (int l = 0; l < LINHA; l++) {
			// laço para percorrer as colunas da matriz
			for (int c = 0; c < COLUNA; c++) {
				a[l][c] = contador;
				contador++;
			}
		}

		// Laço para percorrer as linhas da matriz
		for (int l = 0; l < LINHA; l++) {
			// laço para percorrer as colunas da matriz
			for (int c = 0; c < COLUNA; c++) {
				System.out.printf("| %2d",a[l][c]);
			}
			System.out.println("|");
		}
	}

}
