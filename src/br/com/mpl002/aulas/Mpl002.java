package br.com.mpl002.aulas;

import java.util.Scanner;

public class Mpl002 {
	public static Scanner scan = new Scanner(System.in);

	public static void A02() {
		String var = null;
		System.out.println("Informe qtd variáveis: ");
		int qtdVar = scan.nextInt();
		int cont[] = new int[qtdVar];

		for (int i = 0; i < cont.length; i++) {
			System.out.println("Valor x" + (i + 1));
			cont[i] = scan.nextInt();
		}

		for (int i = 0; i < cont.length; i++) {
			System.out.println("x:" + (i + 1) +" = "+ cont[i]);
		}
	}

}
