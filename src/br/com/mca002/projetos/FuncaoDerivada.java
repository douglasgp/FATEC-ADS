package br.com.mca002.projetos;

import java.util.Scanner;

public class FuncaoDerivada {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Declara��es das vari�veis
		int x = 0;
		// Entrada de dados
		System.out.println("Fun��o de 1� grau: informe o valor de 'x': ");
		x = scan.nextInt();
		// Chamada do método da 1� fun��o
		int resultado = funcaoUm(x);
		System.out.println("x = " + x);
		System.out.println("Fun��o gen�rica:\nf(x) = 2.x +1");
		// Apresenta o resultado da 1� fun��o a partir da entrada do valor em x
		System.out.println("\nf(" + x + ") = 2." + x + " +1 = " + resultado);
		// Chama o método da 2º função
		int resultado2 = funcaoDois(resultado);
		// Apresenta o resultado da 2º função
		System.out.println("f(" + resultado + ") = 2." + resultado + " +1 = " + resultado2);
		// Chama o método do cálculo de deltaX
		int resultadoDeltaX = deltaX(resultado, x);
		// Apresenta o resultado do cálculo de deltaX
		System.out.println("\n∆x = " + resultadoDeltaX);
		// Chama o método do cálculo de deltaY
		int resultadoDeltaY = deltaY(resultado2, resultado);
		// Apresenta o resultado do cálculo de deltaY
		System.out.println("∆y = " + resultadoDeltaY);
		// Chama o método que calcula a derivada
		double taxaVariacao = variacao(resultadoDeltaY, resultadoDeltaX);
		// Apresenta ao usuário o resultado da derivada (taxa de variação)
		System.out.println("\nTaxa de Variação: " + taxaVariacao);
		// Chama o método função deltaX
		int funDeltaX = fDeltaX(resultadoDeltaX, x);
		// Apresenta função genérica do cálculo de (x+deltax)
		System.out.println("\nFunção genérica:\nf(x + ∆x)");
		// Apresenta o resultado do cálculo da função delta x
		System.out.println("f(" + x + "+" + funDeltaX + ") = " + resultado);
		// Chama o método função deltaY
		int funDeltaY = fDeltaY(resultadoDeltaY, resultado);
		// Apresenta o resultado do cálculo da função delta y
		System.out.println("f(" + resultado + "+" + funDeltaY + ") = " + resultadoDeltaY);
	}

	// Cálculo da 1º função
	public static int funcaoUm(int x1) {
		int resultado1 = 2 * x1 + 1;
		return resultado1;
	}

	// Cálculo da 2º função baseada no resultado da 1º função
	public static int funcaoDois(int x2) {
		int resultado2 = 2 * x2 + 1;
		return resultado2;
	}

	// Cálculo de deltaX
	public static int deltaX(int resultado, int x) {
		int resultadoX = resultado - x;
		return resultadoX;
	}

	// Cálculo de deltaY
	public static int deltaY(int resultado2, int resultado) {
		int resultadoY = resultado2 - resultado;
		return resultadoY;
	}

	// Cálculo da taxa de variação variação
	public static double variacao(int resultY, int resultX) {
		double varia = resultY / resultX;
		return varia;
	}

	// Cálculo da função de (x + deltaX)
	// Verifica��o
	public static int fDeltaX(int resultadoDeltaX, int x) {
		int funDeltaX = x + (resultadoDeltaX - x);
		return funDeltaX;
	}

	// Cálculo da função de (y + deltaY)
	public static int fDeltaY(int resultadoDeltaY, int resultado) {
		int funDeltaY = resultado + (resultadoDeltaY - resultado);
		return funDeltaY;
	}
}
