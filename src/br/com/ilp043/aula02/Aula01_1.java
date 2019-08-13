package br.com.ilp043.aula02;

import java.util.Scanner;

import br.com.modelos.Veiculo;

public class Aula01_1 {
	public static Scanner scan = new Scanner(System.in);
	public static int caracteristicaVeiculo = 3;
	public static int vagas = 20;
	public static Veiculo[][] vetVeic = new Veiculo[vagas][caracteristicaVeiculo];
	public static Veiculo veiculo = new Veiculo(null, null, null);
	public static int[] posicoes = new int[vagas];
	public static int numVaga = 0;
	public static boolean[] mapa = new boolean[vagas];
	
	public static void main(String[] args) {
		
		do {
			System.out.println("Informe nº vaga: ");
			numVaga = scan.nextInt();
			if(statusVaga(numVaga) != false) {
				System.out.println("Vaga ocupada escolha outra vaga:");
			}else {
				System.out.println("Informe dados do veículo");
				System.out.println("Modelo: ");
				String marca = scan.nextLine();
				System.out.println("Marca: ");
				String modelo = scan.nextLine();
				System.out.println("Placa: ");
				String placa = scan.nextLine();
				for (int i = 0; i < vetVeic.length; i++) {
					for (int j = 0; j < caracteristicaVeiculo; j++) {
						vetVeic[i][j].setModelo(modelo);
						vetVeic[i][j].setMarca(marca);
						vetVeic[i][j].setPlaca(placa);
					}
				}
			}
		} while (zCheio(mapa) == false);
	}
	public static boolean zCheio(boolean vet[]) {
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] == false)
				return false;
		}
		return true;
	}
	// Método para retornar status da vaga
	public static boolean statusVaga(int posVaga) {
		for (int i = 0; i < posicoes.length; i++) {
			if(posicoes[posVaga] != posicoes[i])
				return true;
		}
		return false;
	}
	// Método para exibir vagas e seuas ocupações
	public static void exibeVagas() {
		System.out.printf(" %7S | %7S | %7S | %S","Nº Vaga","Modelo","Marca","Placa");
		for (int i = 0; i < vagas; i++) {
			for (int j = 0; j < caracteristicaVeiculo; j++) {
				System.out.printf(" %2d | %7S | %7S | %S", posicoes[i], vetVeic[i][j].getModelo(), vetVeic[i][j].getMarca(), vetVeic[i][j].getPlaca());
			}
		}
	}
}
