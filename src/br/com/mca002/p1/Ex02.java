package br.com.mca002.p1;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 4;
		int xi[] = {10, 15, 22, 36};
		int yi[] = new int[n];

		// Entra com valores para x
		for (int i = 0; i < n; i++) {
			System.out.println("ax" + (i + 1) + " ");
			//xi[i] = scan.nextInt();
		}

		// Calcula valor de y baseado no valor de x
		for (int i = 0; i < yi.length; i++) {
			yi[i] += xi[i];
			System.out.println(yi);
		}
	}
}
