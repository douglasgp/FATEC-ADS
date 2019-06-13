package br.com.review;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestaVetor {
	public static void main(String[] args) throws Exception {
		int numAulas = 3;
		int numRevisao = 6;
		GregorianCalendar[] vetorData = new GregorianCalendar[numAulas];
		GregorianCalendar[][] matrizData = { { new GregorianCalendar(2019, 01, 15) },
				{ new GregorianCalendar(2019, 02, 15) } };
		
		String vetorDataStr[] = {"02/01/2019", "09/01/2019","16/01/2019"};

		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

		for (int l = 0; l < numAulas; l++) {
			System.out.println(" = = = " + (l+1) + "º aula: " + (vetorDataStr[l])+" = = = ");
			for (int c = 0; c < numAulas; c++) {
				Calendar cal = Calendar.getInstance();
				cal.setTime(df.parse(vetorDataStr[c]));
				if (c == 0) {
					vetorData[c].add(Calendar.DAY_OF_MONTH, 0);
					System.out.println("Posição " + c + ": " + vetorDataStr[c]);
				} else if (c == 1) {
					System.out.println("Posição " + c+ ": " + vetorDataStr[c]);
				}else if(c == 2) {
					System.out.println("Posição " + c+ ": " + vetorDataStr[c]);
				}
			}
		}
	}
	
}
