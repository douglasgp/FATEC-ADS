package br.com.ilp010.lista01;

import java.util.Scanner;

/*
 * Escreva uma aplica��o de console que leia um valor num�rico inteiro indicando
 * se o valor dado � par ou �mpar. 
 */
public class Exercicio07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int valor;
		// Entrada de dados
		System.out.println("Informe um valor inteiro: ");
		valor = scan.nextInt();
		if (valor % 2 == 0) {
			System.out.println(valor + " � PAR!");
		} else {
			System.out.println(valor + " � �MPAR!");
		}

	}
}
