package br.com.ilp010.lista02;
/*
 * Escreva um programa que utilize uma fun��o para converter o valor
 * de temperatura Celsius dado pelo usu�rio em uma temperatura
 * Fahrenheit. F�rmula: F = (C*9/5) + 32; 
 */
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Vari�veis
		double c;
		// Entrada de dados
		System.out.println("Informe uma temperatura em Graus Celsius: ");
		c = scan.nextDouble();
		// Chamada da fun��o
		double resultado = converteTemp(c);
		System.out.println(c + "� Celsius = " + resultado + "� Fahrenhait");
	}

	// Declara��o da fun��o
	public static double converteTemp(double celsius) {
		double f = (celsius * 9 / 5) + 32;
		return f;
	}
}
