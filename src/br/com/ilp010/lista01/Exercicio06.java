package br.com.ilp010.lista01;

/*
 * Construa uma aplica��o que leia tr�s argumentos reais fornecidos pelo usu�rio,
 * imprimindo-os em ordem decrescente. 
 */
import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int vetor[] = {1,5,3,8,3,6,2,7,4,9};
		int aux = 0;
		for(int i = 0; i < vetor.length; i++) {
			while(aux != vetor.length) {
				System.out.println(vetor[i]);
			}
			
		}
	}

}
