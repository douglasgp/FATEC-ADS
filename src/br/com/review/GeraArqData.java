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
		String dataStr[] = new String[numAulas];
		Calendar[] dataAula = new GregorianCalendar[numAulas];

		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal = Calendar.getInstance();
		/*
		 * String strDate = "01/07/1990"; 
		 * SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		 * Calendar c = Calendar.getInstance();
		 * c.setTime(sdf.parse(strDate)); 
		 * //aqui está o "pulo do gato"
		 * System.out.println(new java.sql.Date(c.getTimeInMillis()));
		 */

		for (int i = 0; i < numAulas; i++) {
			System.out.println("Data: ");
			dataStr[i] = scan.nextLine();
			cal.setTime(sdf.parse(dataStr[i]));
		}
		
		for (int i = 0; i < dataAula.length; i++) {
			cal.setTime(sdf.parse(dataStr[i]));
			System.out.println(new java.sql.Date(cal.getTimeInMillis()));
		}
	}

}
