package br.com.mca002.projetos;

import java.util.Scanner;

public class Derivadas {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Declaração das variáveis
		int x = 5;
		double valorX1[] = new double[x];
		// Entrada das itens

		for (int i = 0; i < valorX1.length; i++) {
			System.out.println("Infome o valor de x" + i);
			valorX1[i] = scan.nextDouble();
		}
		for (int i = 0; i <= valorX1.length; i++) {
			System.out.println(valorX1[i]);
		}
	}
}
