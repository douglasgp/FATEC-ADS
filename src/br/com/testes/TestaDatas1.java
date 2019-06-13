package br.com.testes;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class TestaDatas1 {
	public static Scanner scan = new Scanner(System.in);
	public static Calendar c = Calendar.getInstance();
	public static void main(String[] args) {
		/*System.out.println("Validade Cartão - MÊS: ");
		int valMes = scan.nextInt();
		System.out.println("Validade Cartão - ANO: ");
		int valAno = scan.nextInt();
		testaAno(valAno);*/
		System.out.println("Informe uma data com '/': ");
		Date data = new Date();
		
	}
	
	public static String testaAno(int year) {
		String status = null;
		if(year < c.get(Calendar.YEAR)) {
			System.out.println(year + " é menor que " + c.get(Calendar.YEAR)+" - Cartão VENCIDO");
			status = "inv";
		}else if(year == c.get(Calendar.YEAR)) {
			System.out.println(year  + " é igual a " + c.get(Calendar.YEAR));
		}else if(year  > c.get(Calendar.YEAR)) {
			System.out.println(year + " é maior que " + c.get(Calendar.YEAR));
		}
		return status;
	}

	public static void pegaData() {
		
	}
}
