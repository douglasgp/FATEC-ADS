package br.com.ilp010.trabalho2;

import br.com.ilp010.trabalho2.Catalogo02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class CompraCatalogo {
	public static void main(String[] args) throws Exception {
		Catalogo02.menuPrincipal();
		int num = leAtualizaNumPedido();
		System.out.println("Num atual: " + num);
		geraHtml(num);
	}

	public static void geraHtml(int num) {
		Scanner scan = new Scanner(System.in);
		try {
			String nomeArquivo = String.format("P%06d", num);
			// Escreve arquivo HTML
			PrintWriter pw = new PrintWriter(new FileWriter("/home/douglasgp/git/FATEC-ADS/src/br/com/ilp010/trabalho2/Pedidos/"+nomeArquivo + ".html"));
			pw.println("<html><head>");
			pw.println("<title>" + nomeArquivo + "</title>");
			pw.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"estilo2.css\" />");
			pw.println("</head><body>");
			pw.println("<h1>Pedido: " + nomeArquivo + "</h1>");
			System.out.println("Nome do Cliente? ");
			String nome = scan.nextLine();
			pw.println("<p>Cliente: " + nome + "</p>");
			System.out.println("Número do cartão? ");
			String cartao = scan.nextLine();
			pw.println("<p>Cartão: " + cartao + "</p>");
			System.out.println("Produtos no Carrinho: " + Catalogo02.NUM_PROD_CAR);
			/*
			pw.println("<table><tr><th>Cód</th><th>Preço</th><th>Qtd</th><th>SubTotal</th></tr>");
			*/
			int totalItens = 0;
			double total = 0;
			for (int i = 0; i < Catalogo02.NUM_PROD_CAR; i++) {
				pw.println("<tr>");
				pw.println("<td>" + Catalogo02.PROD_CAR[i] + "</td>");
				pw.println("<td>Preço</td>");
				pw.println("<td>" + Catalogo02.QTD_CAR[i] + "</td>");
				totalItens += Catalogo02.QTD_CAR[i];
				double subTotal = Catalogo02.PRECO_CAR[i] * Catalogo02.QTD_CAR[i];
				total += subTotal;
				pw.print("<td>" + String.format("R$%.2f", subTotal) + "</td>");
				pw.println("</tr>");
				System.out.printf("%2d %06d R$%.2f\n", i, Catalogo02.PROD_CAR[i], subTotal);
			}
			pw.println("</table>");
			pw.println("<p>Total de Produtos: " + Catalogo02.NUM_PROD_CAR + "</p>");
			pw.println("<p>Total de Itens: " + totalItens + "</p>");
            pw.println("<P>Total Valor: " + String.format("R$%.2f",total) + "</p>");
			pw.println("</body></html>");
			pw.close();
			// Executar aplicação no Windows
			/*
			 * Runtime.getRuntime().exec(new String[] { "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe",
					"file:///C:\\Users\\NoteP000\\Documents\\NetBeansProjects\\Teste\\" + nomeArquivo + ".html" });
			 */
			// Executar aplicação no Linux
			Runtime.getRuntime().exec(new String[] { "/opt/google/chrome/google-chrome",
					"file:/home/douglasgp/git/FATEC-ADS/src/br/com/ilp010/trabalho2/Pedidos/"+nomeArquivo+".html" });
			System.exit(0);
			

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static int leAtualizaNumPedido() {
		try {
			// Lê arquivo de controle
			BufferedReader br = new BufferedReader(new FileReader("/home/douglasgp/git/FATEC-ADS/src/br/com/ilp010/trabalho2/pedido.txt"));
			String stg = br.readLine();
			br.close();
			// Número do último pedido
			int num = Integer.parseInt(stg);
			// Número do pedido atual
			num++;
			// Escreve arquivo de controle
			PrintWriter pw = new PrintWriter(new FileWriter("/home/douglasgp/git/FATEC-ADS/src/br/com/ilp010/trabalho2/pedido.txt"));
			pw.println(num);
			pw.close();
			// número do pedido atual
			return num;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(1);
		}
		return 0;
	}

}
