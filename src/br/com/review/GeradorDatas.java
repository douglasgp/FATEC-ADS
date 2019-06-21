package br.com.review;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class GeradorDatas {
	public static Scanner scan = new Scanner(System.in);
	
	public static int TAMANHO = 0;
	public static int OPCAO_DISCIPLINA = 0;
	
	public static int totalAula = 0;
	public static int NUM_DISCIPLINA = 3;
	public static int NUM_LIN = NUM_DISCIPLINA;
	public static int NUM_COL = 3;
	public static int dataAulas[][] = new int[NUM_LIN][NUM_COL];

	public static void menuPrincipal() throws Exception {
		
		int opcao = 0;
		do {
			// mostra menu de opões

			System.out.println(" = = = = = = = = = = = = = = = = = = = = =  MENU 1 - PRINCIPAL  = = = = = = = = = = = = = = = = = = = = = = = = = =  ");
			System.out.printf("%14.12s | %-14.17s | %-20.25s | %-17.20s | %-17.10s |%s\n","1. Registrar ", "2. Consultar datas ", "3. Gerar datas","4. Remover Produto", "5. Sair da ", "0. Finalizar");
			System.out.printf("%11.14s | %-11.19s | %-20.25s | %-17.18s | %-17.12s |%s\n","  data de revisão   ", "  de aulas     ", "   de revisão        ","    do carrinho   ", "   aplicação", " Compra");
			System.out.println(" = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = ");
			
			opcao = scan.nextInt();
			// processa opção escolhida no menu
			switch (opcao) {
			case 1: //
				criaDatasDisciplina();
				break;
			case 2:
				menuPrincipal();
				break;
			case 3:
				geraArqDatas();
				break;
			default:
				System.out.println("Operação Inválida!");
			}
		} while (opcao != 0); // repete enquanto opção diferente de sair
	}

	public static void criaDatasDisciplina() {
		System.out.println("Informe o nome da Disciplina: ");
		String disciplina = scan.nextLine();
		System.out.println("Informe o total de aulas: ");
		int totalAula = scan.nextInt();
		System.out.println("Informe a data da 1º aula dd - mm - yyy: ");
		int dia = scan.nextInt();
		int mes = scan.nextInt();
		int ano = scan.nextInt();

		for (int i1 = 0; i1 < totalAula; i1++) {
			for (int i2 = 0; i2 < i1; i2++) {
				for (int i3 = 0; i3 < i1; i3++) {

				}
			}
		}

		for (int i1 = 0; i1 < totalAula; i1++) {
			for (int i2 = 0; i2 < i1; i2++) {
				for (int i3 = 0; i3 < i1; i3++) {
					System.out.println(i3 + " - ano");
					dataAulas[i3][i3] = scan.nextInt();
				}
				System.out.println(i2 + " - mês");
			}
			System.out.println(i1 + " - dia");
		}
	}

	public static int processaDisciplina(int opcao) {
		int resultado = 0;
		if(opcao == 1) {
			resultado = 8;
		}else if(opcao == 2) {
			resultado = 9;
		}else if(opcao == 3) {
			resultado = 9;
		}else if(opcao == 4) {
			resultado = 8;
		}else if(opcao == 5) {
			resultado = 7;
		}else if(opcao == 6) {
			resultado = 6;
		}else {
			System.out.println("Opção inválida!");
			geraArqDatas();
		}
		return resultado;
	}
	
	public static void geraArqDatas() {
		int opcao = 0;
		do {
			// Exibe menu de opções
			System.out.println("Informe o semestre: ");
			OPCAO_DISCIPLINA = scan.nextInt();
			
			System.out.println(" = = = = = = = = = = = = = = = = = = = = =  MENU 2 - Gerador Datas  = = = = = = = = = = = = = = = = = = = = = = = = = =  ");
			System.out.printf("%14.12s | %-14.17s | %-20.25s | %-17.20s | %-17.10s |%s\n","1. Registrar ", "2. Consultar datas ", "3. Consultar Carrinho","4. Retornar ao ", "5. Sair da ", "0. Finalizar");
			System.out.printf("%11.14s | %-11.19s | %-20.25s | %-17.18s | %-17.12s |%s\n","  data de revisão   ", "  de aulas     ", "   de Compras        ","    Menu Principal   ", "   aplicação", " Compra");
			System.out.println(" = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = ");
			
			int[] codigo = new int[TAMANHO];
		} while (opcao != 0);
		
	}
	
}
