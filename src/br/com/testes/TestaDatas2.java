package br.com.testes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestaDatas2 {
	public static void main(String[] args) throws Exception {
		Calendar c = Calendar.getInstance();
		Date data = c.getTime();
		DateFormat f = DateFormat.getDateInstance();
		
		System.out.println("Infome data: ");
		Date data2 = f.parse("12/01/1995");
				//();
		System.out.println(data2);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Data formatada: " + sdf.format(data));
		
		// Converte objetos
		System.out.println("Data convertida: " + sdf.parse("02/08/1970"));
	}
}
