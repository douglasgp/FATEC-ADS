package br.com.ilp010.lista02;

import java.util.Scanner;

/*
 * Escreva um programa que utilize uma função para calcular o IMC de
 * uma pessoa, que fornece seu peso e sua altura.
 * IMC = Massa / Altura²
 */
public class Ex03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Variáveis
		double peso;
		double altura;
		// Entrada de dados
		System.out.println("Informe seu peso: ");
		peso = scan.nextDouble();
		System.out.println("Informe sua altura: ");
		altura = scan.nextDouble();
		// Invocação da função
		double IMC = calculaImc(peso, altura);
		System.out.println(IMC);
	}

	public static double calculaImc(double p, double a) {
		double imc = (p / a) * 2;
		return imc;
	}
}
