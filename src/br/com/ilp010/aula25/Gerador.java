package br.com.ilp010.aula25;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Gerador {
	public static void main(String[] args) throws Exception {
		// Abrir catálogo
		DataInputStream dis = new DataInputStream(new FileInputStream("produto.db"));
		// Leitura do tamanho
		int TAMANHO = dis.readInt();
		System.out.println("Tamanho " + TAMANHO);
		// Abrir arquivo CSV
		BufferedReader br = new BufferedReader(new FileReader("produtos.csv"));
		int linhas = 0;
		String linha = null;
		while ((linha = br.readLine()) != null) {
			linhas++;
		}
		br.close();
		System.out.println("Linhas: " + linhas);
		// Reabrir arquivo
		br = new BufferedReader(new FileReader("produtos.csv"));
		// Descarte da 1º linha
		TAMANHO = linhas - 1;
		//
		linha = null;
		int i = 0;
		while ((linha = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(linha, ";");
			codigo[i] = Integer.parseInt(st.nextToken());
			nome[i] = st.nextToken();
			preco[i] = Double.parseDouble(st.nextToken());
			descricao[i] = st.nextToken();
			i++;
		}
		br.close();
		// Definir arrays
		int[] codigo = new int[TAMANHO];
		String[] nome = new String[TAMANHO];
		double[] preco = new double[TAMANHO];
		String[] descricao = new String[TAMANHO];
		// Leitura ddos itens
		for (int i = 0; i < TAMANHO; i++) {
			codigo[i] = dis.readInt();
			nome[i] = dis.readUTF();
			preco[i] = dis.readDouble();
			descricao[i] = dis.readUTF();
			System.out.printf("%06d | %-15s | %7.2f | %s\n", codigo[i], nome[i], preco[i], descricao[i]);
		}
		// Fecha arquivo
		dis.close();
		System.out.println("Arquivo fechado!");
	}

}
