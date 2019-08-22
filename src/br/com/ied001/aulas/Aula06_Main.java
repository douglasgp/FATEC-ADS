package br.com.ied001.aulas;

import java.util.Scanner;
/*
 *  IMPLEMENTAÇÃO
 */
public class Aula06_Main {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		Aula06_1 a6 = new Aula06_1();

		while (a6.cheia()) {
			System.out.println("Informar valor:");
			int valor = scan.nextInt();
			a6.empilhar(valor);
		}
		
		while(!a6.vazia()) {
			a6.desempilhar();
		}
	}

}
