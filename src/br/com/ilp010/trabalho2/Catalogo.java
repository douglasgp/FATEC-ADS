package br.com.ilp010.trabalho2;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Catalogo {
	private static final int PRODUTO = 100;
	private static Scanner scan = new Scanner(System.in);
	public static void main(String a[]) throws IOException {
		int opcao = 0;
        do {
            // mostra menu de op��es
            opcao = menu();
            // processa op��o escolhida no menu
            switch (opcao) {
                case 'A': // aciona fun��o de entrada de ve�culo
                    mostraCatalogo();
                    break;
                case 'C': // aciona fun��o de exibi��o do mapa de ve�culos
                    consultaCarrinho();
                    break;
                case 'M': // aciona fun��o de exibi��o do mapa de ve�culos
                    finalizaCompra();
                    break;
                case '0': // sa�da do programa
                    break;
                default:
                    System.out.println("Opera��o Inv�lida!");
            }
        } while (opcao != '0'); // repete enquanto op��o diferente de sair
    
	}
	// Fun��o para finalizar compra
	public static void finalizaCompra() {
		System.out.println("Saindo!");
		System.exit(-1);
	}
	
	// Fun��o para apresentar carrinho de compras
	public static void consultaCarrinho() {
		
	}
	
	// Fun��o que mostra itens no cat�logo
	public static void mostraCatalogo() throws IOException {
		System.out.println("==============");
        System.out.println("Cat�logo de Produtos");
        
        
	}
	
    // fun��o que exibe o menu principal
    public static int menu() {
        System.out.println("==============");
        System.out.println("Cat�logo de Produtos");
        System.out.println();
        System.out.println("A. Consulta de Itens");
        System.out.println("B. Selecionar Itens Carrinho de Compras");
        System.out.println("C. Consultar Carrinho de Compras");
        System.out.println("D. Excluir itens");
        System.out.println("E. Gerar conta");
        System.out.println("F. Finalizar compra");
        System.out.println("G. Sair");
        System.out.print("> ");
        return scan.next().toUpperCase().charAt(0);
    }
}
