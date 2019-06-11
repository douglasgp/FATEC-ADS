package br.com.ilp010.aula34;

import java.util.Scanner;

public class Carrinho {

    public static final int MAX_PROD_CARRINHO = 4;
    public static final int MAX_QUANT_PROD_CARRINHO = 3;

    public static int PROD_CARRINHO[] = new int[20];
    public static int QUANT_CARRINHO[] = new int[20];
    public static int No_PROD_CARRINHO = 0;

    public static Scanner in = new Scanner(System.in);

    public static void menuCarrinho() {
        int opcao = 0;
        do {
            System.out.println("=====================");
            System.out.println("1 - Adicionar Produto");
            System.out.println("2 - Consultar Carrinho");
            System.out.println("3 - Remover Produto");
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
            }
        } while (opcao != 0);
    }

    public static void adicionarNoCarrinho() {
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

    public static void consultarCarrinho() {
        System.out.println("Consultar Carrinho");
        System.out.println("NoProdutos: " + No_PROD_CARRINHO);
        System.out.println("==================");
        int no_itens = 0;
        for (int i = 0; i < No_PROD_CARRINHO; i++) {
            System.out.println(QUANT_CARRINHO[i]
                    + " de " + PROD_CARRINHO[i]);
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
