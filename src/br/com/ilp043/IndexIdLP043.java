package br.com.ilp043;

import java.util.Scanner;

public class IndexIdLP043 {
	public static Scanner scan = new Scanner(System.in);
	public static int aula = 0;
	
	public static void main(String[] args) {
		System.out.println("Escolha uma aula:\n"
				+ "1. Aula 1");
		aula = scan.nextInt();
		String mensagem = "Bem-vindo a Aula ";
		switch (aula) {
		case 1:
			System.out.println(mensagem + aula+"");
			Aula01.aula01();
			break;

		default:
			break;
		}
	}

}
