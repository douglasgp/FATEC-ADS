package br.com.ilp010.lista02;
/*
 * Escreva um programa que utilize uma função para converter o valor
 * de temperatura Celsius dado pelo usuário em uma temperatura
 * Fahrenheit. Fórmula: F = (C*9/5) + 32; 
 */
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Variáveis
		double c;
		// Entrada de dados
		System.out.println("Informe uma temperatura em Graus Celsius: ");
		c = scan.nextDouble();
		// Chamada da função
		double resultado = converteTemp(c);
		System.out.println(c + "º Celsius = " + resultado + "º Fahrenhait");
	}

	// Declaração da função
	public static double converteTemp(double celsius) {
		double f = (celsius * 9 / 5) + 32;
		return f;
	}
}
