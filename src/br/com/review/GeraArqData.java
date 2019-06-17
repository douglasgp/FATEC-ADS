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
		String dataStr[][] = new String[numAulas][numRevisao];
		Calendar[] dataAula = new GregorianCalendar[numAulas];

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal = Calendar.getInstance();
		/*
		 * String strDate = "01/07/1990"; SimpleDateFormat sdf = new
		 * SimpleDateFormat("dd/MM/yyyy"); Calendar c = Calendar.getInstance();
		 * c.setTime(sdf.parse(strDate)); //aqui está o "pulo do gato"
		 * System.out.println(new java.sql.Date(c.getTimeInMillis()));
		 */

		for (int l = 0; l < dataAula.length; l++) {
			System.out.println("= = = = " + (l+1)+"º ciclo = = = =  ");
			for (int c = 0; c < numRevisao; c++) {
				System.out.println((c+1)+"º data: ");
				dataStr[l][c] = scan.nextLine();
				cal.setTime(sdf.parse(dataStr[l][c]));
			}
		}

		for (int l = 0; l < dataAula.length; l++) {
			for (int c = 0; c < numRevisao; c++) {
				cal.setTime(sdf.parse(dataStr[l][c]));
				System.out.println(new java.sql.Date(cal.getTimeInMillis()));
			}
		}

	}

}
