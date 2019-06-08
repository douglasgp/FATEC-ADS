package br.com.ilp010.aula31;

import java.util.Scanner;

public class Matriz02 {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// 1. Solicita do usuário tamanho das matrizes NUMLIN e NUMCOL
		System.out.println("Informe o nº de linhas: ");
		int nLinhas = scan.nextInt();
		System.out.println("Informe o nº de Colunas: ");
		int nColunas = scan.nextInt();
		
		// 1.2 Identificação de matriz
		String mA = "A";
		String mB = "B";
		String res = "Resultado";
		
		// 2. Criar matrizes A, B e C (com o mesmo tamanho)
		double a[][] = MatrizLib.criaMatriz(nLinhas, nColunas);
		double b[][] = MatrizLib.criaMatriz(nLinhas, nColunas);
		double resultado[][] = MatrizLib.criaMatriz(nLinhas, nColunas);
		
		// 3. Ler matriz A
		MatrizLib.leMatriz(a, mA);
		
		// 4. Ler matriz B
		MatrizLib.leMatriz(b, mB);
		
		// 5. Somar matriz A com matriz B (por posição) colocando o resultado na matriz C.
		MatrizLib.somaMatriz(a, b, resultado);
		
		// 6. Exibir o resultado (matriz C).
		MatrizLib.exibeMatriz(resultado, res);
	}
}
