package br.com.ilp010.p1;

import java.util.Scanner;

public class Ex10Corrigido {
	public static void main(String[] args) {
		// Scanner
		Scanner in = new Scanner(System.in);
		// Array (arranjo)
		int array[] = new int[12];
		// Leitura dos doze valores
		for (int i = 0; i < array.length; i++) {
			System.out.print("array[" + i + "]? ");
			array[i] = in.nextInt();
		}
		// Processamento do array
		int somaPar = 0;
		int somaImpar = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				somaPar = somaPar + array[i];
			} else {
				somaImpar = somaImpar + array[i];
			}
		}
		// Exibição dos resultados
		System.out.println("Soma Pares   = " + somaPar);
		System.out.println("Soma Impares = " + somaImpar);
	}
}
