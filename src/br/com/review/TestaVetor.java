package br.com.review;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestaVetor {
	public static void main(String[] args) throws Exception {
		int dia = 30;
		int mes = 12;
		int ano = 2020;
		int vetorDia[] = new int[dia];
		int vetorMes[] = new int[mes];
		int vetorAno[] = new int[ano];
		GregorianCalendar vetorData[] = new GregorianCalendar(2019,02,04);

		for (int m = 0; m < vetorMes.length; m++) {
			vetorMes[m] = m;
		}
		for(int m = 0; m < vetorMes.length; m++) {
			System.out.println("Mês: " + (vetorMes[m]+1));
		}
	}

}
