package br.com.fatec.iso100;

import java.util.Scanner;

public class Ex1MP {
	public static Scanner scan = new Scanner(System.in);
	public static int NLIN = 1;
	public static int NCOL = 1;

	public static void main(String[] args) {
		int nome[][] = new int[NLIN][NCOL];
		// nome = { { "Macarrão", "Biscoito", "Arroz", "Feijão" },{ "Feijão",
		// "Detergente", "Carne", "Maçã" } };

		for (int l = 0; l < NLIN; l++) {
			for (int c = 0; c < NCOL; c++) {
				System.out.println("Programa " + (l+1) + " - Clock " + (c+1));
				nome[l][c] = scan.nextInt();
			}
			System.out.println(" ");
		}

		for (int l = 0; l < NLIN; l++) {
			for (int c = 0; c < NCOL; c++) {
				System.out.printf(" %2d", nome[l][c]);
			}
			System.out.println(" - ");
		}
	}

}
