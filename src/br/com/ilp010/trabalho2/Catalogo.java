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
                case 'O': // sa�da do programa
                	sairAplicacao();
                    break;
                default:
                    System.out.println("Opera��o Inv�lida!");
            }
        } while (opcao != 'O'); // repete enquanto op��o diferente de sair
    
	}
	// Fun��o para sair da aplica��o
	public static void sairAplicacao() {
		System.out.println("Saindo da Aplica��o!");
		System.exit(0);
	}
	
	// Fun��o para apresentar carrinho de compras
	public static void consultaCarrinho() {
		
	}
	
	// Fun��o para finalizar e gerar arquivo de compra
	public static void finalizaCompra() {
		
	}
	// Fun��o que mostra itens no cat�logo
	public static void mostraCatalogo() throws IOException {
		System.out.println("==============");
        System.out.println("Cat�logo de Produtos");
        System.out.println("");
        DataInputStream dis = new DataInputStream(new FileInputStream("src/br/com/ilp010/trabalho2/catalogo01.db"));
        // Leitura do tamanho
        int TAMANHO = dis.readInt();
        System.out.println("Tamanho " + TAMANHO);
        // Definir arrays
        int[] codigo = new int[TAMANHO];
        String[] nome = new String[TAMANHO];
        double[] preco = new double[TAMANHO];
        String[] descricao = new String[TAMANHO];
        // Leitura dos �tens do cat�logo
		System.out.printf("%4.3s | %-20.8s | %7.9s | %s\n", "C�D", "NOME", "PRE�O", "DESCRI��O");
		for(int i = 0; i < TAMANHO; i++) {
			codigo[i] = dis.readInt();
			nome[i] = dis.readUTF();
			preco[i] = dis.readDouble();
			descricao[i] = dis.readUTF();
			System.out.printf("%04d | %-20s | %7.2f | %s\n", codigo[i], nome[i], preco[i], descricao[i]);
		}
        
	}
	
    // fun��o que exibe o menu principal
    public static int menu() {
        System.out.println("==============");
        System.out.println("Cat�logo de Produtos");
        System.out.println();
        System.out.println("A. Consulta de Itens");
        System.out.println(" . Selecionar Itens Carrinho de Compras");
        System.out.println("C. Consultar Carrinho de Compras");
        System.out.println(" . Excluir itens");
        System.out.println(" . Gerar conta");
        System.out.println("M. Finalizar compra");
        System.out.println("0. Sair");
        System.out.print("> ");
        return scan.next().toUpperCase().charAt(0);
    }
}
