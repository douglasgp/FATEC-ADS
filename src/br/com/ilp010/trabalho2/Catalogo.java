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
            // mostra menu de opções
            opcao = menu();
            // processa opção escolhida no menu
            switch (opcao) {
                case 'A': // aciona função de entrada de veículo
                    mostraCatalogo();
                    break;
                case 'C': // aciona função de exibição do mapa de veículos
                    consultaCarrinho();
                    break;
                case 'M': // aciona função de exibição do mapa de veículos
                    finalizaCompra();
                    break;
                case '0': // saída do programa
                    break;
                default:
                    System.out.println("Operação Inválida!");
            }
        } while (opcao != '0'); // repete enquanto opção diferente de sair
    
	}
	// Função para finalizar compra
	public static void finalizaCompra() {
		System.out.println("Saindo!");
		System.exit(-1);
	}
	
	// Função para apresentar carrinho de compras
	public static void consultaCarrinho() {
		
	}
	
	// Função que mostra itens no catálogo
	public static void mostraCatalogo() throws IOException {
		System.out.println("==============");
        System.out.println("Catálogo de Produtos");
        
        
	}
	
    // função que exibe o menu principal
    public static int menu() {
        System.out.println("==============");
        System.out.println("Catálogo de Produtos");
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
