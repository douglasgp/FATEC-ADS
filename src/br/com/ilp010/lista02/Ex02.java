package br.com.ilp010.lista02;

import java.util.Scanner;

/*
 * Escreva um programa que utilize uma fun��o para calcular o valor
 * futuro de um dep�sito D ap�s N meses com taxa de juros J. Os
* valores de D, N e I s�o dados pelo usu�rio. F�rmula: VF = D * (1 + J)N
 */
public class Ex02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Vari�veis
		double d;
		int n;
		double j;
		// Entrada de dados
		System.out.println("Informe o valor de dep�sito: ");
		d = scan.nextDouble();
		System.out.println("Informe a quantidade de meses: ");
		n = scan.nextInt();
		System.out.println("Informe a taxa de juros: ");
		j = scan.nextDouble();
		// Chamada da fun��o
		double resultado = valorFuturo(d, n, j);
		System.out.println(resultado);
	}

	// Declara��o da fun��o
	public static double valorFuturo(double dias, int meses, double juros) {
		double vf = dias * ((1 + juros) * meses);
		return vf;
	}
}
