package br.com.ilp010.lista01;

import java.util.Scanner;

/*
 * Escreva uma aplicação que leia um número variável de argumentos numéricos
 * inteiros determinando qual o maior valor recebido. A sequência de valores será
 * interrompida quando o usuário fornecer um valor negativo (valor < 0). 
 */
public class Excercicio20 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Declaração das variáveis
		int valor = 0;
		int numMaior = 0;
		// Estrutura que solicita números inteiros
		do {
			System.out.println("Informe um número inteiro: ");
			valor = scan.nextInt();
			if (valor > numMaior) {
				numMaior = valor;
			}
		} while (valor >= 0);
		System.out.println("Maior valor = " + numMaior);
	}
}
