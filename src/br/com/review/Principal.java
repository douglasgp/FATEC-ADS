package br.com.review;
/*
 * https://www.devmedia.com.br/forum/somar-10-dias-a-uma-data/565299
 */
import java.util.Scanner;

public class Principal {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		
		int opcao = 0;
		do {
			// mostra menu de opões

			System.out.println(" = = = = = = = = = = = = = = = = = = = = =  MENU PRINCIPAL  = = = = = = = = = = = = = = = = = = = = = = = = = =  ");
			System.out.printf("%14.12s | %-14.17s | %-20.25s | %-17.20s | %-17.10s |%s\n","1. Registrar ", "2. Consultar datas ", "3. Consultar Carrinho","4. Remover Produto", "5. Sair da ", "0. Finalizar");
			System.out.printf("%11.14s | %-11.19s | %-20.25s | %-17.18s | %-17.12s |%s\n","  data de revisão   ", "  de aulas     ", "   de Compras        ","    do carrinho   ", "   aplicação", " Compra");
			System.out.println(" = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = ");
			
			opcao = scan.nextInt();
			// processa opção escolhida no menu
			switch (opcao) {
			case 1: //
				GeradorDatas.criaDatasDisciplina();
				break;
			case 2:
				GeradorDatas.menuPrincipal();
				break;
			default:
				System.out.println("Operação Inválida!");
			}
		} while (opcao != 0); // repete enquanto opção diferente de sair
	}
}
