package br.com.ilp010.trabalho2;

import java.io.IOException;
import java.util.Scanner;

public class TesteFormatMenu {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		/*
		System.out.println(" = = = = = = =  = = = = = = = MENU CARRINHO DE COMPRAS  = = = = = = =  = = = = = = = ");
		System.out.printf("%14.13s | %-20.25s | %-17.10s | %-17.10s |%s\n", "1. Adicionar ", "2. Consultar Carrinho","3. Remover Produto", "4. Menu", "0. Sair");
		System.out.printf("%11.16s | %-20.25s | %-17.10s | %-17.12s |%s\n", "    Produto   ", "   de Compras        ","   Item", "   Principal", "");
		System.out.println(" = = = = = = =  = = = = = = = = = = = = = = = = = = = = = = = = = = =  = = = = = = = ");
		System.out.println();
		System.out.println();
		System.out.println(" = = = = = = =  = = = = = = = MENU CARRINHO DE COMPRAS  = = = = = = =  = = = = = = = ");
		System.out.printf("%14.32s | %-20.25s | %s\n", "1. Adicionar Produto            ", "3. Remover Produto", "0. Sair");
		System.out.printf("%14.32s | %-20.25s | %s\n", "2. Consultar Carrinho de Compras", "4. Menu Anterior"," ");
		System.out.println(" = = = = = = =  = = = = = = = = = = = = = = = = = = = = = = = = = = =  = = = = = = = ");
		System.out.println();
		System.out.println();
		*/
		System.out.println(" = = = = = = =  = = = = = = = MENU CARRINHO DE COMPRAS  = = = = = = =  = = = = = = = ");
		System.out.println("1. Adicionar | 2. Exeuta     | 3. Remover Produto | 4. Menu        | 0. Sair");
		System.out.println("   Produto   |    Aplicação  |    Item            |    Principal   |");
		System.out.println(" = = = = = = =  = = = = = = = = = = = = = = = = = = = = = = = = = = =  = = = = = = = ");
		
		int op = 0;
		do {
			op = menu();
			
			switch (op) {
			case 1: //
				// mostraCatalogo();
				break;
			case 2: //
				executaApp();
				// consultaCarrinho();
				break;
			default:
				System.out.println("Operação Inválida!");
			}
		}while (op != 0);
	}
	
	public static int menu() {
		
		return scan.nextInt();
	}
	
	public static void executaApp() throws Exception {
		System.out.println("Executando aplicação . . . ");
		Runtime.getRuntime().exec(new String[] { "//opt/google/chrome/google-chrome",
				"file:///home/douglasgp/Public/teste.html" });
		System.exit(0);
	}
}
