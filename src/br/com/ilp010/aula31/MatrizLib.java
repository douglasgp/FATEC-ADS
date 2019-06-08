package br.com.ilp010.aula31;

import java.util.Scanner;

public class MatrizLib {
	public static Scanner scan = new Scanner(System.in);

	// Função para criar matriz
	public static double[][] criaMatriz(int nLin, int nCol) {
		return new double[nLin][nCol];
	}

	// Função para ler matriz
	public static void leMatriz(double[][] mat,String id) {
		System.out.println("= = = = = Matriz - "+id+" = = = = = ");
		for (int lin = 0; lin < mat.length; lin++) {
			for (int col = 0; col < mat[lin].length; col++) {
				System.out.println("Mat"+id+"[" + lin + "][" + col + "]:");
				mat[lin][col] = scan.nextDouble();
			}
		}
	}

	// Função para somar matriz
	public static void somaMatriz(double[][] matA, double[][] matB, double[][] AmaisB) {
		for (int lin = 0; lin < AmaisB.length; lin++) {
			for (int col = 0; col < AmaisB[lin].length; col++){
				AmaisB[lin][col] = matA[lin][col] + matB[lin][col];
			}			
		}
	}

	// Função para exibie matriz
	public static void exibeMatriz(double[][] AmaisB, String id) {
		System.out.println("= = = = = "+id+" = = = = = ");
		for (int lin = 0; lin < AmaisB.length; lin++) {
			for (int col = 0; col < AmaisB[lin].length; col++) {
				System.out.printf("%6.1f | ", AmaisB[lin][col]);
			}
			System.out.println();
		}
	}

}
