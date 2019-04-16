package br.com.testes;

import java.util.Scanner;

public class NumeroPrimo {
	public static boolean ePrimo(long num) {
		if (num < 2)
			return false;
		for (long i = 2; i <= (num / 2); i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um valor inteiro: ");
		long x = scan.nextInt();
		if (ePrimo(x))
			System.out.println(x + " é primo.");
		else
			System.out.println(x + " não é primo.");
	}
}
