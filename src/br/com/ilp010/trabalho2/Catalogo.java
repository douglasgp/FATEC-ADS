package br.com.ilp010.trabalho2;
// http://215.55.32.164/moodle/course/view.php?
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
        //System.out.println("Tamanho " + TAMANHO);
        // Definir arrays
        int[] codigo = new int[TAMANHO];
        String[] nome = new String[TAMANHO];
        double[] preco = new double[TAMANHO];
        String[] descricao = new String[TAMANHO];
        // Apresenta Menu de op��es do Carrinho de Compras
        System.out.println(" = = = = = = =  = = = = = = = MENU CARRINHO DE COMPRAS  = = = = = = =  = = = = = = = ");
        System.out.printf("%14.13s | %-20.15s | %17.10s | %s\n", "1. Selecionar itens do carrinho", "2. Ver Carrinho","3. Excluir", "4. Voltar");
        System.out.printf("%14.13s | %-20.6s | %17.10s | %s\n", "Item",          "de Compras",     "�tem",       "Menu Principal");
        System.out.println("INFORME UMA OPÇÃO: ");
        int op = scan.nextInt();

        if(op == 1){

        }else if(op == 2){

        }else if(op == 3){

        }else if(op == 4){

        }

        // Leitura dos �tens do cat�logo
		System.out.printf("%4.3s | %-20.8s | %7.9s | %s\n", "C�D", "NOME", "PRE�O", "DESCRI��O");
		for(int i = 0; i < TAMANHO; i++) {
			codigo[i] = dis.readInt();
			nome[i] = dis.readUTF();
			preco[i] = dis.readDouble();
			descricao[i] = dis.readUTF();
			System.out.printf("%04d | %-20s | %7.2f | %s\n", codigo[i], nome[i], preco[i], descricao[i]);
		}
		int opcaoCarrinho = 0;
		do {
			// Apresenta menu de op��es
			switch(opcaoCarrinho) {
			case 1:
				addItemCarrinho();
				break;
			case 2:
				verCarrinho();
				break;
			case 3:
				removeItemCarrinho();
				break;
			}
		} while (opcaoCarrinho != '0');


	}
	// Fun��o para adicionar item ao carrinho
	public static void addItemCarrinho() {


	}
	// Fun��o para ver conte�do do carrinho de compras
	public static void verCarrinho() {

	}
	// Fun��o para remover itens do carrinho de compras
	public static void removeItemCarrinho() {

	}
    // fun��o que exibe o menu principal
    public static int menu() {
        System.out.println("==============");
        System.out.println("Catálogo de Produtos");
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
