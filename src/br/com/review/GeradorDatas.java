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
		
		String dataStr[][] = {{ "2/11/2019", "2/18/2019", "2/25/2019"},{"3/4/2019", "3/11/2019", "3/18/2019"},{"3/25/2019","4/1/2019", "4/8/2019"}};
		
			//{ "2/11/2019", "2/18/2019", "2/25/2019","3/4/2019", "3/11/2019", "3/18/2019", "3/25/2019",
				//"4/1/2019", "4/8/2019","4/15/2019", "4/22/2019", "4/29/2019", "5/6/2019", "5/13/2019", "5/20/2019","5/27/2019", "6/3/2019", "6/10/2019", "6/17/2019", "6/24/2019" };
		String disciplina[] = { "MCA002", "MET100", "LIN200" };
		// ,"ISO100","ILP502","ILP010","IHW100","IES100","CCG006"};
		// Date[][] DATAS1= new Date[NUM_LIN][NUM_COL];
		Date[] datas = { new Date(), new Date() };
		// {{2/8/2019,2/8/2019,2/8/2019},{2/8/2019,2/8/2019,2.8.2019}};
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

		/*for (int l = 0; l < NUM_LIN; l++) {
			System.out.println(" = = = " + disciplina[l] + " = = = ");
			for (int c = 0; c < NUM_COL; c++) {
				System.out.println("Informe data da " + (c + 1) + "º aula: ");
				dataStr [c]= scan.nextLine();

			}
		}*/
		for (int l = 0; l < NUM_LIN; l++) {
			System.out.println(" = = = " + disciplina[l] + " = = = ");
			for (int c = 0; c < NUM_COL; c++) {
				System.out.println((c+1)+"º aula: "+dataStr[l][c]);
				// System.out.println(novaData.format(datas[l][c]));
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
