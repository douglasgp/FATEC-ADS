package br.com.ipl010.aula06;

import java.util.Scanner;

public class CalculadoraSimples {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o 1� n�mero: ");
		int n1 = scan.nextInt();
		System.out.println("Digite o 2� n�mero: ");
		int n2 = scan.nextInt();

		int soma = n1 + n2;
		System.out.println("Soma dos n�mmeros: " + soma);
		int sub = n1 - n2;
		System.out.println("Subtra��o dos n�mmeros: " + sub);
		int mult = n1 * n2;
		System.out.println("Multiplica��o dos n�mmeros: " + mult);
		int div = n1 / n2;
		System.out.println("Divis�o dos n�mmeros: " + div);
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
