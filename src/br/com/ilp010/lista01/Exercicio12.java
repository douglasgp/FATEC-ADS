package br.com.ilp010.lista01;

import java.util.Scanner;

/*
 * Escreva uma aplica��o de console que leia tr�s valores num�ricos reais que
 * representam o tamanho de tr�s segmentos de reta, determinando se eles
 * podem formar um tri�ngulo. Caso seja poss�vel a forma��o de um tri�ngulo,
 * exiba no console qual o tipo (equil�tero, is�sceles ou escaleno). 
 */
public class Exercicio12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Vari�veis
		double a;
		double b;
		double c;

		double lado[] = new double[3];
		// Entrada de dados
		System.out.println("= = = = Calcula Tri�ngulo = = = = = \n\n ");
		System.out.println("Informe o 1� valor: ");
		a = scan.nextDouble();
		System.out.println("Informe o 2� valor: ");
		b = scan.nextDouble();
		System.out.println("Informe o 3� valor: ");
		c = scan.nextDouble();

		if (a + b == c && a + c == b && b + c == a) {
			System.out.println("Os lados formam um Tri�ngulo Eq�il�tero!");
		} else if (a + b == c && a + c == b && b + c != a) {
			System.out.println("Os lados formam um Tri�ngulo Is�sceles!");
		} else if (a + b != c && a + c != b && b + c != a) {
			System.out.println("Os lados formam um Tri�ngulo Escaleno!");
		} else {
			System.out.println("Os lados n�o formam um Tri�ngulo!");
		}
	}
}
