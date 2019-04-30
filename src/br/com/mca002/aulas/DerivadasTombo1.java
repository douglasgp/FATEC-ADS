package br.com.mca002.aulas;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DerivadasTombo1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Variáveis
		int derivada = 0; // Variável usada apenas para apresentar em qual grau da derivada está sendo calculado.
		int coef;
		int pot = 0;
		int funcao;
		// Solicita do usuário um valor para coeficiente
		System.out.println("Informe o valor do coeficiente: ");
		coef = scan.nextInt();
		// Solicita do usuário um valor para potência
		System.out.println("Informe o valor da potência: ");
		pot = scan.nextInt();
		// Realiza cálculo da derivada baseado no coeficiente e potência informados, n
		// vezes até potência = 0
		for (int i = pot; i >= 0; i--) {
			derivada += 1;
			coef *= pot;
			pot -= 1;
			System.out.println("\nDerivada " + derivada + "º grau" + "\nCoeficiente = " + coef + "\nPotência = " + pot);
			System.out.println(coef + "x ^" + pot);
		}
	}
}
