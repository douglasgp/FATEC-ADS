package br.com.review;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class GeradorDatas {
	public static Scanner scan = new Scanner(System.in);
	public static int totalAula = 0;
	public static int NUM_DISCIPLINA = 3;
	public static int NUM_LIN = NUM_DISCIPLINA;
	public static int NUM_COL = 3;
	public static int dataAulas[][] = new int[NUM_LIN][NUM_COL];

	public static void menuPrincipal() throws Exception {
		String disciplina[] = {"MCA002","MET100","LIN200"};
				//,"ISO100","ILP502","ILP010","IHW100","IES100","CCG006"};
		//Date[][] DATAS1= new Date[NUM_LIN][NUM_COL];
		Date[][] DATAS1 = {{2/8/2019,2/8/2019,2/8/2019},{2/8/2019,2/8/2019,2/8/2019}};
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

		for (int l = 0; l < NUM_LIN; l++) {
			System.out.println(" = = = "+ disciplina[l]+" = = = ");
			for (int c = 0; c < NUM_COL; c++) {
				System.out.println("Informe "+(c+1)+"º data: ");
				String dataStr = scan.nextLine();
				DATAS1[l][c] = df.parse(dataStr);
			}
		}
		for (int l = 0; l < NUM_LIN; l++) {
			for (int c = 0; c < l; c++) {
				System.out.println(df.format(DATAS1[l][c]));
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
