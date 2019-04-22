package br.com.ilp010.p1;

import java.util.Scanner;

public class Ex09Corrigido {
	public static void main(String[] args) {
		// Scanner
		Scanner in = new Scanner(System.in);
		// Leitura dos três valores
		System.out.print("A? ");
		double A = in.nextDouble();
		System.out.print("B? ");
		double B = in.nextDouble();
		System.out.print("C? ");
		double C = in.nextDouble();
		// Acionamento da função
		boolean resultado = testaPA(A, B, C);
		// Exibição do resultado
		if (resultado) {
			System.out.println("Valores formam PA");
		} else {
			System.out.println("Valores NÃO formam PA");
		}
	}

	public static boolean testaPA(double A, double B, double C) {
		if ((B - A) == (C - B)) {
			// caso verdade, retorna true
			return true;
		} else {
			// caso false, retorna false
			return false;
		}
	}
}