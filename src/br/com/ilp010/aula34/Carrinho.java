package br.com.ilp010.aula34;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Carrinho {

	public static final int MAX_PROD_CARRINHO = 4;
	public static final int MAX_QUANT_PROD_CARRINHO = 3;

	public static int PROD_CARRINHO[] = new int[20];
	public static int QUANT_CARRINHO[] = new int[20];
	public static double PRECO_CARRINHO[] = new double[20];
	public static int No_PROD_CARRINHO = 0;

	public static Scanner in = new Scanner(System.in);

	public static void menuCarrinho() throws Exception {
		int opcao = 0;
		do {
			System.out.println("=====================");
			System.out.println("1 - Adicionar Produto");
			System.out.println("2 - Consultar Carrinho");
			System.out.println("3 - Remover Produto");
			System.out.println("4 - Consulta Catalogo");
			System.out.println("0 - Cair fora");
			System.out.print("? ");
			opcao = in.nextInt();
			if (opcao == 1) {
				// Adicionar
				adicionarNoCarrinho();
			} else if (opcao == 2) {
				// Consultar
				consultarCarrinho();
			} else if (opcao == 3) {
				// Remover
				removerDoCarrinho();
			}else if(opcao == 4) {
				// Consulta catalogo
				mostraCatalogo();
			}
		} while (opcao != 0);
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

	public static void adicionarNoCarrinho() throws Exception {
		System.out.println("Adicionar No Carrinho");
		// ler produto
		System.out.print("Código? ");
		int codigo = in.nextInt();
		// verificar se tem o (codigo do) produto no carrinho
		int posicaoProduto = localizaProduto(codigo);

		if (posicaoProduto == -1) {
			// produto não encontrado
			// verifico se cabe mais produto no carrinho
			if (No_PROD_CARRINHO == MAX_PROD_CARRINHO) {
				System.out.println("Carrinho cheio!!!");
				return;
			}
			// cabe mais um produto
			PROD_CARRINHO[No_PROD_CARRINHO] = codigo;
			QUANT_CARRINHO[No_PROD_CARRINHO]++;
			PRECO_CARRINHO[No_PROD_CARRINHO] = obterPreco(codigo);
			No_PROD_CARRINHO++;
		} else {
			// produto encontrado
			// verifico se pode mais uma unidade
			if (QUANT_CARRINHO[posicaoProduto] == MAX_QUANT_PROD_CARRINHO) {
				System.out.println("Máximo no carrinho!!!");
				return;
			}
			// pode mais uma unidade
			QUANT_CARRINHO[posicaoProduto]++;
		}
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

	public static void consultarCarrinho() {
		System.out.println("Consultar Carrinho");
		System.out.println("NoProdutos: " + No_PROD_CARRINHO);
		System.out.println("==================");
		int no_itens = 0;
		for (int i = 0; i < No_PROD_CARRINHO; i++) {
			System.out.println(QUANT_CARRINHO[i] + " de " + PROD_CARRINHO[i]);
			no_itens += QUANT_CARRINHO[i];
		}
		System.out.println("NoItens: " + no_itens);
		System.out.println("==================");
	}

	public static void removerDoCarrinho() {
		System.out.println("Remover do Carrinho");
		// ler produto
		System.out.print("Código? ");
		int codigo = in.nextInt();
		// verificar se tem o (codigo do) produto no carrinho
		int posicaoProduto = localizaProduto(codigo);
		if (posicaoProduto != -1) {
			// achou produto, diminui quantidade
			QUANT_CARRINHO[posicaoProduto]--;
			if (QUANT_CARRINHO[posicaoProduto] == 0) {
				// remover produto zerado
				for (int j = posicaoProduto; j < No_PROD_CARRINHO - 1; j++) {
					QUANT_CARRINHO[j] = QUANT_CARRINHO[j + 1];
					PROD_CARRINHO[j] = PROD_CARRINHO[j + 1];
					No_PROD_CARRINHO--;
				}
			}
		} else {
			System.out.println("Produto não encontrado");
		}
	}

	public static int localizaProduto(int codigo) {
		for (int i = 0; i < No_PROD_CARRINHO; i++) {
			if (codigo == PROD_CARRINHO[i]) {
				return i; // retorna posição do produto
			}
		}
		return -1; // não encontrado
	}

}
