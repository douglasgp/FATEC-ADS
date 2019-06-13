package br.com.review;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestaData01 {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int numAulas = 2;
		int numRevisao = 6;
		Date[] dataTeste1 = new Date[numAulas];
		Date[][] matrizData = new Date[numAulas][numRevisao];

		String vetorDatasStr[] = { "02/01/2019", "15/05/2019" };
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

		for (int l = 0; l < numAulas; l++) {
			dataTeste1[l] = df.parse(vetorDatasStr[l]);
		}

		for (int l = 0; l < numAulas; l++) {
			System.out.println(df.format(dataTeste1[l]));
			for (int c = 1; c <= numRevisao; c++) {
				if (c == 1) {
					matrizData[l][c] = dataTeste1[l];
				} else if (c == 2) {
					matrizData[l][c] = dataTeste1[l + 1];
				} else if (c == 3) {
					matrizData[l][c] = dataTeste1[l + 6];
				} else if (c == 4) {
					matrizData[l][c] = dataTeste1[l + 23];
				} else if (c == 5) {
					matrizData[l][c] = dataTeste1[l + 30];
				} else if (c == 6) {
					matrizData[l][c] = dataTeste1[l + 30];
				}
			}
		}

		for (int l = 0; l < numAulas; l++) {
			for (int c = 0; c <= numRevisao; c++) {
				System.out.println(matrizData[l][c]);
			}
		}
	}
}
