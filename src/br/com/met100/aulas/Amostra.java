package br.com.met100.aulas;

import java.util.Scanner;

public class Amostra {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int amostra = 0;
		int resultado;
		System.out.println("Informe o Espa�o Amostra: ");
		amostra = scan.nextInt();
		
		resultado = amostra*amostra;
		
		System.out.println("Espa�o amosta = " + resultado);
		
	}
}
