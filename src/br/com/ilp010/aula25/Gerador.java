package br.com.ilp010.aula25;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Gerador {
	public static void main(String[] args) throws Exception {
		int TAMANHO = 0;

		// Abrir arquivo CSV
		BufferedReader br = new BufferedReader(new FileReader("/home/douglasgp/Public/TestFiles/catalogo.db"));
		int linhas = 0;
		String linha = null;
		while ((linha = br.readLine()) != null) {
			linhas++;
		}
		br.close();
		System.out.println("Linhas: " + linhas);
		// Definir arrays
		TAMANHO = linhas - 1;
		int[] codigo = new int[TAMANHO];
		String[] nome = new String[TAMANHO];
		double[] preco = new double[TAMANHO];
		String[] descricao = new String[TAMANHO];
		// Reabrir arquivo
		br = new BufferedReader(new FileReader("/home/douglasgp/Public/TestFiles/catalogo.db"));
		// Descarte da 1� linha
		br.readLine();
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

		// Abrir cat�logo
		DataOutputStream dis = new DataOutputStream(new FileOutputStream("/home/douglasgp/Public/TestFiles/catalogo.db"));
		System.out.println("Arquivo aberto.");
		// Escrever tamanho
		dis.writeInt(TAMANHO);
		// Leitura ddos itens
		for (i = 0; i < TAMANHO; i++) {
			dis.writeInt(codigo[i]);
			dis.writeUTF(nome[i]);
			dis.writeDouble(preco[i]);
			dis.writeUTF(descricao[i]);
		}
		// Fecha arquivo
		dis.close();
		System.out.println("Arquivo fechado!");
	}

}
