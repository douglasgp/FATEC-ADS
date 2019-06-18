package br.com.review;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class GeraArqData {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int numAulas = 2;
		int numRevisao = 4;
		int numDisciplinas = 9;

		String nomeDisc[] = { "MCA002", "MET100", "LIN200"}; // "ISO100","ILP502","ILP010","IHW100","IES100","CCG006"};
		String dataStrAulas[] = { "11/02/2019", "18/02/2019","25/02/2019","04/03/2019", "11/03/2019", "18/03/2019","25/03/2019","01/04/2019",
				"08/04/2019","15/04/2019","22/04/2019","29/04/2019","06/05/2019","13/05/2019","20/05/2019","27/05/2019","03/06/2019","10/06/2019","17/06/2019","24/06/2019"};
				
		// String dataStrAulas[] = new String[numDisciplinas];
		String dataStrRev[][] = new String[numAulas][numRevisao];

		Calendar[] dataAula = new GregorianCalendar[numAulas];

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal = Calendar.getInstance();
		/*
		 * String strDate = "01/07/1990"; SimpleDateFormat sdf = new
		 * SimpleDateFormat("dd/MM/yyyy"); Calendar c = Calendar.getInstance();
		 * c.setTime(sdf.parse(strDate)); //aqui está o "pulo do gato"
		 * System.out.println(new java.sql.Date(c.getTimeInMillis()));
		 */

		for (int l = 0; l < nomeDisc.length; l++) {
			System.out.println("Disciplina:  " + nomeDisc[l]+ " = = = =  ");
			System.out.println((l+1)+"º Aula: "+dataStrAulas[l]);
			for (int c = 0; c < dataStrAulas.length; c++) {
				// System.out.println((c + 1) + "º Revisão: ");
				// dataStrRev[l][c] = scan.nextLine();
				cal.setTime(sdf.parse(dataStrAulas[c]));
				cal.add(Calendar.DAY_OF_MONTH,1);
				System.out.println(new java.sql.Date(cal.getTimeInMillis()));
			}
		}

		/*for (int l = 0; l < nomeDisc.length; l++) {
			for (int c = 0; c < dataStrAulas.length; c++) {
				cal.setTime(sdf.parse(dataStrAulas[c]));
				System.out.println(new java.sql.Date(cal.getTimeInMillis()));
			}
		}*/

	}

}
