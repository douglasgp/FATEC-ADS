package br.com.ilp010.trabalho2;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Catalogo02 {

	public static int NUM_PROD_CAR = 0;

	public static int[] PROD_CAR = new int[20];
	public static double PRECO_CAR[] = new double[20];
	public static final int MAX_PROD_CAR = 4;

	public static final int MAX_QTD_PROD_CAR = 0;

	public static int[] QTD_CAR = new int[20];
	public static Scanner scan = new Scanner(System.in);

	// Função 0. FINALIZA aplicação
	public static void sairAplicacao() {
		System.out.println("Aplicação encerrada!");
		System.exit(0);
	}

	// Função 1. CONSULTA catálogo
	public static void mostraCatalogo() throws IOException {
		System.out.println("= = = = = = =Catálogo de Produtos = = = = = = =");
		System.out.println("");
		DataInputStream dis = new DataInputStream(new FileInputStream("src/br/com/ilp010/trabalho2/catalogo01.db"));
		// Leitura do tamanho
		int TAMANHO = dis.readInt();
		// System.out.println("Tamanho " + TAMANHO);
		// Definir arrays
		int[] codigo = new int[TAMANHO];
		String[] nome = new String[TAMANHO];
		double[] preco = new double[TAMANHO];
		String[] descricao = new String[TAMANHO];
		// Leitura dos Itens do catálogo
		System.out.printf("%4.3s | %-20.8s | %7.9s | %s\n", "CÓD", "NOME", "PREÇO", "DESCRIÇÃO\n");
		for (int i = 0; i < TAMANHO; i++) {
			codigo[i] = dis.readInt();
			nome[i] = dis.readUTF();
			preco[i] = dis.readDouble();
			descricao[i] = dis.readUTF();
			System.out.printf("%04d | %-20s | %7.2f | %s\n", codigo[i], nome[i], preco[i], descricao[i]);
		}
		System.out.println();
	}

	// Função 2. ADICIONA item ao carrinho
	public static void addItemCarrinho() throws Exception {
		System.out.println("Adicionar No Carrinho");
		// ler produto
		System.out.print("Código? ");
		int cod = scan.nextInt();
		// verificar se tem o (codigo do) produto no carrinho
		int posicaoProd = localizaProd(cod);

		if (posicaoProd == -1) {
			// produto não encontrado
			// verifico se cabe mais produto no carrinho
			if (NUM_PROD_CAR == MAX_PROD_CAR) {
				System.out.println("Carrinho cheio!!!");
				return;
			}
			// cabe mais um produto
			PROD_CAR[NUM_PROD_CAR] = cod;
			QTD_CAR[NUM_PROD_CAR]++;
			PRECO_CAR[NUM_PROD_CAR] = obterPreco(cod);
			NUM_PROD_CAR++;
		} else {
			// produto encontrado
			// verifico se pode mais uma unidade
			if (QTD_CAR[posicaoProd] == MAX_QTD_PROD_CAR) {
				System.out.println("Máximo no carrinho!!!");
				return;
			}
			// pode mais uma unidade
			QTD_CAR[posicaoProd]++;
		}
	}

	// Função 3. CONSULTA carrinho
	public static void consultaCarrinho() {
		System.out.println("= = = = = = =Catálogo de Produtos = = = = = = =");
		System.out.println("");
		System.out.println("Nº Produtos: " + NUM_PROD_CAR);
		System.out.println("= = = = = = = = = = = = = = = = = = = = = = = =");
		int num_itens = 0;
		for (int i = 0; i < NUM_PROD_CAR; i++) {
			System.out.println(QTD_CAR[i] + " de " + PROD_CAR[i]);
			num_itens += QTD_CAR[i];
		}

		System.out.println("Nº Itens: " + num_itens);
		System.out.println("= = = = = = = = = = = = = = = = = = = = = = = =");
	}

	// Função 4. REMOVE iten carrinho
	public static void removeItemCarrinho() {

	}

	// Função SAIR da aplicação
	public static void sair() {
		System.out.println("Aplicação Encerrada!!!");
		System.exit(0);
	}

	// função que exibe o menu principal
	public static void menuPrincipal() throws Exception {
		int opcao = 0;
		do {
			// mostra menu de opões
			System.out.println(
					" = = = = = = = = = = = = = = = = = = = = =  MENU PRINCIPAL  = = = = = = = = = = = = = = = = = = = = = = = = = =  ");
			System.out.printf("%14.12s | %-14.13s | %-20.25s | %-17.20s | %-17.10s |%s\n", "1. Consultar ",
					"2. Adicionar ", "3. Consultar Carrinho", "4. Remover Produto", "5. Sair da ", "0. Finalizar");
			System.out.printf("%11.14s | %-11.15s | %-20.25s | %-17.18s | %-17.12s |%s\n", "     Catálogo   ",
					"    Produto   ", "   de Compras        ", "    do carrinho   ", "  Aplicação   ", " Compra");
			System.out.println(
					" = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = ");

			opcao = scan.nextInt();
			// processa opção escolhida no menu
			switch (opcao) {
			case 1: //
				mostraCatalogo();
				break;
			case 2:
				addItemCarrinho(); // ADICIONA item no carrinho
				break;
			case 3: //
				consultaCarrinho();
				break;
			case 4: //
				removeItemCarrinho();
				break;
			case 5: //
				sair();
				break;
			default:
				System.out.println("Operação Inválida!");
			}
		} while (opcao != 0); // repete enquanto opção diferente de sair
	}

	// Função LOCALIZAR produto
	public static int localizaProd(int cod) {
		for (int i = 0; i < NUM_PROD_CAR; i++) {
			if (cod == PROD_CAR[i]) {
				return i; // retorna a posição do produto
			}
		}
		return -1;// não encontrado
	}

	public static double obterPreco(int cod) throws Exception {

		System.out.println("= = = = = = =Catálogo de Produtos = = = = = = =");
		System.out.println("");
		DataInputStream dis = new DataInputStream(new FileInputStream("src/br/com/ilp010/trabalho2/catalogo01.db"));
		int TAMANHO = dis.readInt();
		int[] codigo = new int[TAMANHO];
		String[] nome = new String[TAMANHO];
		double[] preco = new double[TAMANHO];
		String[] descricao = new String[TAMANHO];
		double rPreco = 0;
		for (int i = 0; i < TAMANHO; i++) {
			codigo[i] = dis.readInt();
			nome[i] = dis.readUTF();
			preco[i] = dis.readDouble();
			descricao[i] = dis.readUTF();
			if(cod == codigo[i])
				rPreco = preco[i];
		}
		return rPreco;

	}
}
