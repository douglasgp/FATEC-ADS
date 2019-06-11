/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ilp010.aula34;

import br.com.ilp010.aula34.Carrinho;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author NoteP000
 */
public class Compra {

    public static void main(String[] args) {
        Carrinho.menuCarrinho();
        int num = leEAtualizaNumeroPedido();
        System.out.println("Num Atual: " + num);
        gerarHTML(num);
    }

    public static void gerarHTML(int num) {
        Scanner in = new Scanner(System.in);
        try {
            //
            String nomeArquivo = String.format("P%06d", num);
            // Escreve arquivo HTML
            PrintWriter pw = new PrintWriter(new FileWriter(nomeArquivo + ".html"));
            pw.println("<HTML><HEAD>");
            pw.println("<TITLE>" + nomeArquivo + "</TITLE>");
            pw.println("</HEAD><BODY>");
            pw.println("<H1>Pedido: " + nomeArquivo + "</H1>");
            System.out.print("Nome do Cliente? ");
            String nome = in.nextLine();
            pw.println("<P>Cliente: " + nome + "</P>");
            System.out.print("Numero do Cartao? ");
            String cartao = in.nextLine();
            pw.println("<P>Cartao: " + cartao + "</P>");
            System.out.println("Produtos no Carrinho: " + Carrinho.No_PROD_CARRINHO);
            pw.println("<TABLE border='1'>");
            pw.println("<TR><TH>Cod</TH><TH>Preço</TH><TH>Quant</TH><TH>SubTotal</TH></TR>");
            int totalItens = 0;
            double total = 0;
            for (int i = 0; i < Carrinho.No_PROD_CARRINHO; i++) {
                pw.print("<TR>");
                pw.print("<TD>" + Carrinho.PROD_CARRINHO[i] + "</TD>");
                pw.print("<TD>Preço</TD>");
                pw.print("<TD>" + Carrinho.QUANT_CARRINHO[i] + "</TD>");
                totalItens += Carrinho.QUANT_CARRINHO[i];
                double subTotal = 1.5 * Carrinho.QUANT_CARRINHO[i];
                total += subTotal;
                pw.print("<TD>" + String.format("R$%.2f",subTotal) + "</TD>");
                pw.println("</TR>");
                System.out.printf("%2d %06d R$%.2f\n", i, Carrinho.PROD_CARRINHO[i], subTotal);
            }
            pw.println("</TABLE>");
            pw.println("<P>Total de Produtos: " + Carrinho.No_PROD_CARRINHO + "</P>");
            pw.println("<P>Total de Itens: " + totalItens + "</P>");
            pw.println("<P>Total Valor: " + String.format("R$%.2f",total) + "</P>");
            pw.println("</BODY></HTML>");
            pw.close();
            Runtime.getRuntime().exec(
                    new String[]{
                        "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe",
                        "file:///C:\\Users\\NoteP000\\Documents\\NetBeansProjects\\Teste\\" + nomeArquivo + ".html"});
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
    }

    public static int leEAtualizaNumeroPedido() {
        try {
            // Lê arquivo de controle
            BufferedReader br = new BufferedReader(new FileReader("pedido.txt"));
            String str = br.readLine();
            br.close();
            //
            int num = Integer.parseInt(str); // número do último pedido
            num++; // número do pedido ATUAL
            // Escreve arquivo de controle
            PrintWriter pw = new PrintWriter(new FileWriter("pedido.txt"));
            pw.println(num);
            pw.close();
            //
            return num; // número do pedido ATUAL
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
            System.exit(1);
        }
        return 0;
    }

}
