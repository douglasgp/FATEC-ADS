package br.com.mca002.p1;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 4;
		int xIni[] = new int[num];
		int xFim[] = new int[num];
		// Entrada de dados para armazenar no vetor de valor INICIAL
		for (int i = 0; i < xIni.length; i++) {
			System.out.println("Informe o " + (i + 1) + "º valor inicial: ");
			xIni[i] = scan.nextInt();
			// Entrada de dados para armazenar no vetor de valor FINAL
			for (int j = 0; j < xFim.length; j++) {
				System.out.println("Informe o " + (j + 1) + "º valor final: ");
				xFim[j] = scan.nextInt();
			}
		}
	}

	public static int calcFreq(int xI, int xF) {
		int resultado = 0;

		return resultado;
	}
}
