package br.com.ilp010.lista01;

import java.util.Scanner;

/*
 * Construa uma aplica��o que leia tr�s argumentos reais fornecidos pelo usu�rio,
 * imprimindo-os em ordem decrescente. 
 */
public class Exercicio06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Vari�veis
		double n1, n2, n3;
		// Entrada de dados
		System.out.println("Informe o 1� n�mero: ");
		n1 = scan.nextDouble();
		System.out.println("Informe o 2� n�mero: ");
		n2 = scan.nextDouble();
		System.out.println("Informe o 3� n�mero: ");
		n3 = scan.nextDouble();
		if (n1 > n2 && n1 > n3 && n2 > n3) {
			System.out.println(n1 + "\n" + n2 + "\n" + n3);
		} else if (n2 > n1 && n2 > n3 && n1 > n3) {
			System.out.println(n2 + "\n" + n1 + "\n" + n3);
		} else if (n3 > n1 && n3 > n2 && n1 > n2) {
			System.out.println(n3 + "\n" + n1 + "\n" + n2);
		} else if(n3>n1 && n3>n2 && n2>n1){
			System.out.println(n3 + "\n" + n2 + "\n" + n1);
		}
	}
}
