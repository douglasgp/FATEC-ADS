package br.com.ipl010.aula06;

import java.util.Scanner;

public class CalculadoraSimples {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o 1º número: ");
		int n1 = scan.nextInt();
		System.out.println("Digite o 2º número: ");
		int n2 = scan.nextInt();

		int soma = n1 + n2;
		System.out.println("Soma dos númmeros: " + soma);
		int sub = n1 - n2;
		System.out.println("Subtração dos númmeros: " + sub);
		int mult = n1 * n2;
		System.out.println("Multiplicação dos númmeros: " + mult);
		int div = n1 / n2;
		System.out.println("Divisão dos númmeros: " + div);
	}
}
/* Please tell me who you are.
Run
  git config --global user.email "you@example.com"
  git config --global user.name "Your Name"
to set your account's default identity.
Omit --global to set the identity only in this repository.
fatal: unable to auto-detect email address (got 'Douglas@POS-NOT-WIN8.(none)')
*/
