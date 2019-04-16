package br.com.ilp010.lista01;

import java.util.Scanner;

/*
 * Escreva uma aplicação de console que leia três valores numéricos reais que
 * representam o tamanho de três segmentos de reta, determinando se eles
 * podem formar um triângulo. Caso seja possível a formação de um triângulo,
 * exiba no console qual o tipo (equilátero, isósceles ou escaleno). 
 */
public class Exercicio12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Variáveis
		double a;
		double b;
		double c;

		double lado[] = new double[3];
		// Entrada de dados
		System.out.println("= = = = Calcula Triângulo = = = = = \n\n ");
		System.out.println("Informe o 1º valor: ");
		a = scan.nextDouble();
		System.out.println("Informe o 2º valor: ");
		b = scan.nextDouble();
		System.out.println("Informe o 3º valor: ");
		c = scan.nextDouble();

		if (a + b == c && a + c == b && b + c == a) {
			System.out.println("Os lados formam um Triângulo Eqüilátero!");
		} else if (a + b == c && a + c == b && b + c != a) {
			System.out.println("Os lados formam um Triângulo Isósceles!");
		} else if (a + b != c && a + c != b && b + c != a) {
			System.out.println("Os lados formam um Triângulo Escaleno!");
		} else {
			System.out.println("Os lados não formam um Triângulo!");
		}
	}
}
