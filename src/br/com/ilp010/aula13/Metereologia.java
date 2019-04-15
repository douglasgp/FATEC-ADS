package br.com.ilp010.aula13;

import java.util.Scanner;

public class Metereologia {
	static final int DIAS = 10;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Array para os dados
		// double tMin[] = new double[DIAS];
		double tMin[] = {13.4, 5.2, 3.9, 1.6, 10.4, 5.4, 11.3, 15.7, -1.9, 18.3};
		//double tMax[] = new double[DIAS];
		double tMax[] = {23.4, 25.2, 23.9, 21.6, 30.4, 35.4, 21.3, 25.7, 21.9, 28.3};
		// double iPluvio[] = new double[DIAS];
		double iPluvio[] = {237, 222, 161, 82, 78, 50, 48, 36, 85, 127};
		// Leitura de dados
		/*
		for(int i = 0; i < DIAS; i++) {
			System.out.println("Informe a " + (i+1) + "º temperatura MÍNIMA:");
			tMin[i] = scan.nextDouble();
			System.out.println("Informe a " + (i+1) + "º temperatura MÁXIMA: ");
			tMax[i] = scan.nextDouble();
			System.out.println("Informe a " + (i+1) + "º valor do Índice Pluviométrico: ");
			iPluvio[i] = scan.nextDouble();
		}
		*/
		// Somar coluna
		double iPluvioAcumulado = 0;
		for(int i = 0; i < DIAS; i++) {
			iPluvioAcumulado += iPluvio[i];
		}
		double iPluvioMedio = iPluvioAcumulado / DIAS;
		// Estrutura para encontrar a maior temperatura do mês
		int diaMaiorMaxima = 0;
		double maiorMaxima = tMax[diaMaiorMaxima];
		for(int i =1; i < DIAS; i++) {
			if(tMax[i] > maiorMaxima) {
				maiorMaxima = tMax[i];
				diaMaiorMaxima = i;
			}
		}
		// Estrutura para encontrar a menor temperatura no mês.
		int diaMenorMinima = 0;
		double menorMinima = tMin[diaMenorMinima];
		for(int i = 0; i < DIAS; i++) {
			if(tMin[i] < menorMinima) {
				menorMinima = tMin[i];
				diaMenorMinima = i;
			}
		}
		System.out.println("Índice Pluviométrico: " + iPluvioMedio);
		System.out.println("Temperatura máxima: " + tMax[diaMaiorMaxima]);
		System.out.println("Temperatura mínima: " + tMin[diaMenorMinima]);
	}
}
