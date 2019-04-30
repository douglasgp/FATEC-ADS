package br.com.mca002.aulas;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DerivadasTombo1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Vari�veis
		int derivada = 0; // Vari�vel usada apenas para apresentar em qual grau da derivada est� sendo calculado.
		int coef;
		int pot = 0;
		int funcao;
		// Solicita do usu�rio um valor para coeficiente
		System.out.println("Informe o valor do coeficiente: ");
		coef = scan.nextInt();
		// Solicita do usu�rio um valor para pot�ncia
		System.out.println("Informe o valor da pot�ncia: ");
		pot = scan.nextInt();
		// Realiza c�lculo da derivada baseado no coeficiente e pot�ncia informados, n
		// vezes at� pot�ncia = 0
		for (int i = pot; i >= 0; i--) {
			derivada += 1;
			coef *= pot;
			pot -= 1;
			System.out.println("\nDerivada " + derivada + "� grau" + "\nCoeficiente = " + coef + "\nPot�ncia = " + pot);
			System.out.println(coef + "x ^" + pot);
		}
	}
}
