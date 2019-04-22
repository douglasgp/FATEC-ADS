package br.com.ilp010.p1;

import java.util.Scanner;

public class Ex09Corrigido {
	public static void main(String[] args) {
		// Scanner
		Scanner in = new Scanner(System.in);
		// Leitura dos tr�s valores
		System.out.print("A? ");
		double A = in.nextDouble();
		System.out.print("B? ");
		double B = in.nextDouble();
		System.out.print("C? ");
		double C = in.nextDouble();
		// Acionamento da fun��o
		boolean resultado = testaPA(A, B, C);
		// Exibi��o do resultado
		if (resultado) {
			System.out.println("Valores formam PA");
		} else {
			System.out.println("Valores N�O formam PA");
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