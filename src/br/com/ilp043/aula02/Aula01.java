package br.com.ilp043.aula02;

import java.util.Scanner;

public class Aula01 {
	public static Scanner scan = new Scanner(System.in);
	public static double z[] = new double[5];
	public static boolean vet[] = new boolean[5];
	public static int opcao = 0;

	public static void aula01() {

		do {
			System.out.println("Informe posição: ");
			opcao = scan.nextInt();
			if (opcao >= 5) {
				System.out.println("ERRO! Posição maior 5");
			} else {
				System.out.println("Informe valor da posição " + opcao + ": ");
				z[opcao] = scan.nextInt();
				for (int i = 0; i < z.length; i++) {
					System.out.println((i) + ": " + z[i]);
				}
			}
		} while (zCheio(vet) == false);
	}

	public static boolean zCheio(boolean vet[]) {
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] == false)
				return false;
		}
		return true;
	}

}
