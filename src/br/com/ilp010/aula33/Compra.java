package br.com.ilp010.aula33;

import br.com.ilp010.aula33.Carrinho;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Compra {
	public static void main(String[] args) {
		Carrinho.menuCarrinho();
		int num = leAtualizaNumPedido();
		System.out.println("Num atual: " + num);
		geraHtml(num);
	}

	public static void geraHtml(int num) {
		Scanner scan = new Scanner(System.in);
		try {
			String nomeArquivo = String.format("P%06d", num);
			// Escreve arquivo HTML
			PrintWriter pw = new PrintWriter(new FileWriter(nomeArquivo + ".html"));
			pw.println("<html><head>");
			pw.println("<title>" + nomeArquivo + "</title>");
			pw.println("</head><body>");
			pw.println("<h1>Pedido: " + nomeArquivo + "</h1>");
			System.out.println("Nome do Cliente? ");
			String nome = scan.nextLine();
			pw.println("<p>Cliente: " + nome + "</p>");
			System.out.println("<p>Número do cartão? </p>");
			String cartao = scan.nextLine();
			pw.println("<p>Cartão: " + cartao + "</p>");
			System.out.println("Produtos no Carrinho: " + Carrinho.No_PROD_CARRINHO);
			pw.println("<tr><th>Cód</th><th>Preço</th><th>Qtd</th><th>SubTotal</th></tr>");
			int totalItens = 0;
			double total = 0;
			for (int i = 0; i < Carrinho.No_PROD_CARRINHO; i++) {
				pw.println("<tr>");
				pw.println("<td>" + Carrinho.PROD_CARRINHO[i]);
				pw.println("<td>Preço</td>");
				pw.println("<td>" + Carrinho.PROD_CARRINHO[i]);
				totalItens += Carrinho.QUANT_CARRINHO[i];
				double subTotal = 1.5 * Carrinho.QUANT_CARRINHO[i];
				total += subTotal;
				pw.print("<td>" + String.format("R$%.2f", total) + "</p>");
				pw.println("</tr>");
				System.out.printf("%2d %06d R$%.2f\n", i, Carrinho.PROD_CARRINHO[i], subTotal);
			}
			pw.println("</table>");
			pw.println("<p>Total de Produtos: " + Carrinho.No_PROD_CARRINHO + "<p>");
			pw.println("<p>Total de Itens: " + totalItens + "</p>");
			pw.println("</body></html>");
			pw.close();
			// Executar aplicação no Windows
			Runtime.getRuntime().exec(new String[] { "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe",
					"file:///C:\\Users\\NoteP000\\Documents\\NetBeansProjects\\Teste\\" + nomeArquivo + ".html" });
			// Executar aplicação no Linux
			

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static int leAtualizaNumPedido() {
		try {
			// Lê arquivo de controle
			BufferedReader br = new BufferedReader(new FileReader("pedido.txt"));
			String stg = br.readLine();
			br.close();
			// Número do último pedido
			int num = Integer.parseInt(stg);
			// Número do pedido atual
			num++;
			// Escreve arquivo de controle
			PrintWriter pw = new PrintWriter(new FileWriter("pedido.txt"));
			pw.println(num);
			pw.close();
			// número do peido atual
			return num;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(1);
		}
		return 0;
	}

}
