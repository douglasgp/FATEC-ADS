package br.com.ilp010.lista01;

import java.util.Scanner;

/*
 * Escreva uma aplica��o que leia um n�mero vari�vel de argumentos num�ricos
 * inteiros determinando qual o maior valor recebido. A sequ�ncia de valores ser�
 * interrompida quando o usu�rio fornecer um valor negativo (valor < 0). 
 */
public class Excercicio20 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Declara��o das vari�veis
		int valor = 0;
		int numMaior = 0;
		// Estrutura que solicita n�meros inteiros
		do {
			System.out.println("Informe um n�mero inteiro: ");
			valor = scan.nextInt();
			if (valor > numMaior) {
				numMaior = valor;
			}
		} while (valor >= 0);
		System.out.println("Maior valor = " + numMaior);
	}
}
