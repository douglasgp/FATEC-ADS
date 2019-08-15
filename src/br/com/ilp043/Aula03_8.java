package br.com.ilp043;

import java.util.Scanner;

/*
 * Escreva um programa que leia um número inteiro qualquer 
 * entre 1000 e 9999, ou seja, n1n2n3n4, apresentando a 
 * soma dos dígitos n1+n3 e n2+n4
 */
public class Aula03_8 {
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int valor = 0;
		int dez = 100;
		int res = 0;
		System.out.println("Informe um nº: ");
		valor = scan.nextInt();
		
		res = valor^valor;
		
		System.out.println(res);
	}
}
