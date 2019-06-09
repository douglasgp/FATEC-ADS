package br.com.ilp010.aula32;

import java.util.Scanner;

public class CatalogoDemo {
	public static Scanner scan = new Scanner(System.in);
	public static int cod[] = { 1234, 1234, 4567, 7890, 0123, 3456, 6789, 9012, 2345, 5678, 8901 };
	public static String nome[] = { "1234", "4567", "7890", "0123", "3456", "6789", "9012", "2345", "5678", "8901" };
	public static int TAM_PAG = 4;
	public static int NUM_PROD = 0;
	public static int NUM_PAG = 0;
	public static int PAG_ATUAL = 0;

	public static void main(String[] args) {
		// Carregar o catálogo nos arrays
		NUM_PROD = cod.length;
		NUM_PAG = NUM_PROD / TAM_PAG + (NUM_PROD % TAM_PAG != 0 ? 1 : 0);

		// Exibe menu
		int opcao = 0;
		do {
			System.out.println("1: Catálogo");
			System.out.println("2: Carrinho");
			System.out.println("0: Sair");
			opcao = scan.nextInt();
			switch (opcao) {
			case 1:
				exibeCatalogo();
				break;
			case 2:
				exibeCarrinho();
				break;
			case 0:
				break;
			}
		} while (opcao != 0);
	}

	private static void exibeCatalogo() {
		while (true) {
			System.out.println("Página: " + (PAG_ATUAL + 1));
			for (int i = TAM_PAG * PAG_ATUAL + 0; i < TAM_PAG * PAG_ATUAL + TAM_PAG && i < NUM_PROD; i++) {
				System.out.printf("%04d  %10s\n", cod[i], nome[i]);
			}
			// Menu do catalogo
			System.out.println("(A)nt (1) (2) (3) (4) (C)arrinho (V)oltar (P)róximo");
			char opcao = scan.next().charAt(0);
			switch (opcao) {
			case 'A':
				if (PAG_ATUAL > 0) {
					PAG_ATUAL--;
				}
				break;
			case '1':
			case '2':
			case '3':
			case '4':
				int selecao = (int) opcao - 49 + TAM_PAG * PAG_ATUAL;
				System.out.printf("Seleção: %04d | %10s\n", cod[selecao], nome[selecao]);
				break;
			case 'P':
				if (PAG_ATUAL - 1 < NUM_PAG) {
					PAG_ATUAL++;
				}
				break;
			case 'V':
				return;
			case 'C':
				exibeCarrinho();
				break;
			}
		}
	}

	private static void exibeCarrinho() {
		System.out.println("Fique feliz com seu carrinho!");
	}

}
