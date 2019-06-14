package br.com.ilp010.trabalho2;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class TestaLeCatalogo {
	public static void main(String[] args) throws Exception {
		// Abrir cat�logo
		DataInputStream dis = new DataInputStream(new FileInputStream("produto.db"));
		// Leitura do tamanho
		int TAMANHO =  dis.readInt();
		System.out.println("Tamanho " + TAMANHO);
		// Definir arrays
		int[] codigo = new int[TAMANHO];
		String[] nome = new String[TAMANHO];
		double[] preco = new double[TAMANHO];
		String[] descricao = new String[TAMANHO];
		// Leitura dos itens
		System.out.printf("%4.3s | %-20.8s | %7.9s | %s\n", "C�D", "NOME", "PRE�O", "DESCRI��O");
		for(int i = 0; i < TAMANHO; i++) {
			codigo[i] = dis.readInt();
			nome[i] = dis.readUTF();
			preco[i] = dis.readDouble();
			descricao[i] = dis.readUTF();
			System.out.printf("%04d | %-20s | %7.2f | %s\n", codigo[i], nome[i], preco[i], descricao[i]);
		}
		// Fecha arquivo
		dis.close();
		System.out.println("Arquivo fechado!");
	}
}
