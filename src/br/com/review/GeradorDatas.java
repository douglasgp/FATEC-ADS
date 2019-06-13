package br.com.review;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class GeradorDatas {
	public static Scanner scan = new Scanner(System.in);
	public static Date NUM_LIN = 3;
	public static int NUM_COL = 3;
	public static int y = 2019;
	public static int totalAula = 0;
	public static int NUM_DISCIPLINA = 9;
	public static Date dataAulas[][] = new int[NUM_LIN][NUM_COL];
	public static String disciplina[][] = new String[NUM_DISCIPLINA][];

	public static void menuPrincipal() throws Exception {
DateFormat f = DateFormat.getDateInstance();
		
		System.out.println("Infome data: ");
		Date data2 = f.parse("12/01/1995");
		for (int l = 0; l < NUM_LIN; l++) {
			for (int c = 0; c < l; c++) {
				dataAulas[l][c] = data2;
			}
		}
		for (int l = 0; l < NUM_LIN; l++) {
			for (int c = 0; c < l; c++) {
				System.out.println(dataAulas[l][c]);
			}
		}

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
}
