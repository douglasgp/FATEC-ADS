package br.com.review;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestaVetor {
	public static void main(String[] args) throws Exception {
		int numLin = 2;
		int numCol = 3;
		// new Calendar[1];
		// GregorianCalendar vetorData[] = new GregorianCalendar(2019,02,04);
		// creating calendar object
		Calendar calendar[][] = {{ new GregorianCalendar(2019, 02, 11)}, {new GregorianCalendar(2019, 02, 18)}};
				//, new GregorianCalendar(2019, 02, 25) };
		Calendar clProv[] = { new GregorianCalendar() };

		for (int i = 0; i < numLin; i++) {
			System.out.println((i + 1) + "º class: " + calendar[i].length);
			for (int m = 0; m < numCol; m++) {
				calendar[i][m].add(Calendar.DATE,0);
				System.out.println((m + 1) + "º review: " + calendar[i][m].getTime());
				calendar[i][m].add(Calendar.DATE, 1);
				System.out.println((m + 2) + "º review: " + calendar[i][m].getTime());
				calendar[i][m].add(Calendar.DATE, 6);
				System.out.println((m + 3) + "º review: " + calendar[i][m].getTime());
			}

			System.out.println(" = = = = = = = = = = = = = = = = = = = ");
		}
		for (int m = 0; m < numLin; m++) {
			// System.out.println(calendar[m].getTime());
		}
	}

}
