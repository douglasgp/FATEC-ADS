package br.com.review;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TestaData01 {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int numAulas = 2;
		int numRevisao = 6;
		Calendar[] dataTeste1 = new GregorianCalendar[numAulas];
		Date[][] matrizData = new Date[numAulas][numRevisao];

		GregorianCalendar dataTeste2[] = {new GregorianCalendar(2019 ,01 ,02)};
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

		for (int l = 0; l < numAulas; l++) {
			
		}

		for (int l = 0; l < numAulas; l++) {
			System.out.println(df.format(dataTeste1[l]));
			for (int c = 1; c <= numRevisao; c++) {
				
			}
		}

		for (int l = 0; l < numAulas; l++) {
			for (int c = 0; c <= numRevisao; c++) {
				System.out.println(matrizData[l][c]);
			}
		}
	}
}
