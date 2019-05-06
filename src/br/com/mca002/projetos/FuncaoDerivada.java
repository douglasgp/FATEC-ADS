package br.com.mca002.projetos;

import java.util.Scanner;

public class FuncaoDerivada {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Declara��o das vari�veis
		int x = 0;
		// Entrada de dados
		System.out.println("Fun��o de 1� grau: informe o valor de 'x': ");
		x = scan.nextInt();
		// Chamada do m�todo
		int resultado = funcaoUm(x);
		System.out.println("x = " + x);
		System.out.println("f(x) = 2.x +1");
		System.out.println("\nf(" + x + ") = 2." + x + " +1 = " + resultado);
		int resultado2 = funcaoDois(resultado);
		System.out.println("f(" + resultado + ") = 2." + resultado + " +1 = " + resultado2);
		int resultadoDeltaX = deltaX(resultado, x);
		System.out.println("\nDelta x = " + resultadoDeltaX);
		int resultadoDeltaY = deltaY(resultado2, resultado);
		System.out.println("Delta y = " + resultadoDeltaY);
		double taxaVariacao = variacao(resultadoDeltaY, resultadoDeltaX);
		System.out.println("\nTaxa de Varia��o: " + taxaVariacao);
	}

	// C�lculo da 1� fun��o
	public static int funcaoUm(int x1) {
		int resultado1 = 2 * x1 + 1;
		return resultado1;
	}

	// C�lculo da 2� fun��o baseada no resultado da 1� fun��o
	public static int funcaoDois(int x2) {
		int resultado2 = 2 * x2 + 1;
		return resultado2;
	}

	// C�lculo de deltaX
	public static int deltaX(int resultado, int x) {
		int resultadoX = resultado - x;
		return resultadoX;
	}

	// C�lculo de deltaY
	public static int deltaY(int resultado2, int resultado) {
		int resultadoY = resultado2 - resultado;
		return resultadoY;
	}

	// C�lculo da varia��o
	public static double variacao(int resultY, int resultX) {
		double varia = resultY / resultX;
		return varia;
	}
}
