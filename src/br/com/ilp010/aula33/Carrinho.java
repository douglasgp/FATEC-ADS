package br.com.ilp010.aula33;

import java.util.Scanner;

public class Carrinho {
	public static final int MAX_PROD_CARRINHO = 4;
	public static final int MAX_QTD_PROD_CARRINHO = 3;

	public static int PROD_CARRINHO[] = new int[20];
	public static int QUANT_CARRINHO[] = new int[20];
	public static int No_PROD_CARRINHO = 0;

	public static Scanner scan = new Scanner(System.in);

	public static void menuCarrinho() {
		int opcao = 0;
		do {
			System.out.println(" = = = = = = = = = = = ");
			System.out.println("1 - Adiciona Produto");
			System.out.println("2 - Consultar Carrinho");
			System.out.println("3 - Remover Produto");
			System.out.println("0 - Cair fora");
			System.out.println("? ");
			opcao = scan.nextInt();
			if (opcao == 1) {
				// Adiciona
				inserirNoCarrinho();
			} else if (opcao == 2) {
				// Consultar
				consultaCarrinho();
			} else if (opcao == 3) {
				// Remover
				removeDoCarrinho();
			}
		} while (opcao != 0);
	}

	// INSERE item no carrinho
	public static void inserirNoCarrinho() {
		System.out.println("Adicionar no Carrinho");
		// Ler produto
		System.out.print("Código? ");
		int cod = scan.nextInt();
		// Verifica código no carrinho
		int posicaoProduto = localizarProduto(cod);
		if (posicaoProduto == -1) {
			// Produto não encontrado
			// Verificação de espaço no carrinho para adicionar mais produtos
			if (No_PROD_CARRINHO == MAX_PROD_CARRINHO) {
				System.out.println("Carrinho cheio!!!");
				return;
			}
			// Há espaço para mais produtos
			PROD_CARRINHO[No_PROD_CARRINHO] = cod;
			QUANT_CARRINHO[No_PROD_CARRINHO]++;
			No_PROD_CARRINHO++;
		} else {
			// Produto encontrado
			// Verifico se pode mais uma unidade
			if (QUANT_CARRINHO[posicaoProduto] == MAX_QTD_PROD_CARRINHO) {
				System.out.println("Máximo no carrinho!!!");
				return;
			}
			QUANT_CARRINHO[posicaoProduto]++;
		}
	}

	// CONSULTA carrinho
	public static void consultaCarrinho() {
		System.out.println("Consulta Carrinho");
		System.out.println("Nº Produtos: " + No_PROD_CARRINHO);
		System.out.println(" = = = = = = = = = = = ");
		int no_itens = 0;
		for (int i = 0; i < No_PROD_CARRINHO; i++) {
			System.out.println(QUANT_CARRINHO[i] + " de " + PROD_CARRINHO[i]);
			no_itens += QUANT_CARRINHO[i];
		}
		System.out.println("nº Itens: " + no_itens);
		System.out.println(" = = = = = = = = = = = ");
	}

	// REMOVE item do carrinho
	public static void removeDoCarrinho() {
		System.out.println("Remove do Carrinho");
		// Lê produto
		System.out.println("Código?");
		int cod = scan.nextInt();
		// Consulta existência do produto no carrinho pelo código
		int posicaoProduto = localizarProduto(cod);
		if (posicaoProduto != -1) {
			// Produto encontrado, reduz a quantidade
			QUANT_CARRINHO[posicaoProduto]--;
			if (QUANT_CARRINHO[posicaoProduto] == 0) {
				// Remove produto zerado
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

	// LOCALIZAR ID produto no carrinho
	public static int localizarProduto(int cod) {
		for (int i = 0; i < No_PROD_CARRINHO; i++) {
			if (cod == PROD_CARRINHO[i]) {
				return i; // Retorna posição do produto
			}
		}
		return -1; // Não encontrado
	}

}
