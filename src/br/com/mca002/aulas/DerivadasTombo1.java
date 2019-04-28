package br.com.mca002.aulas;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DerivadasTombo1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Variáveis
		int derivada = 0;
		int coef;
		int pot = 0;
		int funcao;
		// Entrada de dados
		System.out.println("Informe o valor do coeficiente: ");
		coef = scan.nextInt();
		System.out.println("Informe o valor da potência: ");
		pot = scan.nextInt();
		/*
		 * coef *= pot; pot -= 1; System.out.println("Potência = " + pot +
		 * "\nCoeficiente = " + coef);
		 */
		for (int i = pot; i > 0; i--) {
			derivada += 1;
			coef *= pot;
			pot -= 1;
			System.out.println("\nDerivada " + derivada + "º grau" + "\nCoeficiente = " + coef + "\nPotência = " + pot);
			System.out.println(coef + "x ^" + pot);
		}
	}
}
