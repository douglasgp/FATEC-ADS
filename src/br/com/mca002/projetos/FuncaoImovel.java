package br.com.mca002.projetos;

import java.util.Scanner;

public class FuncaoImovel {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Declara��o das Vari�veis
		double valorImovel = 300000;
		int parc = 10;
		int porc = 20;
		double valorEntrada = (valorImovel * porc) / 100;

		double valorParcela = (valorImovel - valorEntrada) / parc;

		System.out.println("Valor total do Im�vel: R$ " + valorImovel);
		System.out.println("Quantidade das parcelas: " + parc);
		System.out.println("Valor de entrada: R$ " + valorEntrada);
		System.out.println("Valor de cada parcela: R$ " + valorParcela);

	}
}
