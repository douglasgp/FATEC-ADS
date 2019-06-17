
package br.com.ilp010.aula25;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Projeto {
	public final static int TAMANHO = 4;

	public static void main(String[] args) throws Exception {
		// Definir o arrays
		int[] codigo = new int[TAMANHO];
		String[] nome = new String[TAMANHO];
		double[] preco = new double[TAMANHO];
		String[] descricao = new String[TAMANHO];

		codigo[0] = 7564;
		nome[0] = "Papel A4";
		preco[0] = 12.90;
		descricao[0] = "Report, branco, 75gt/m�";

		codigo[1] = 7564;
		nome[1] = "Papel A4";
		preco[1] = 12.90;
		descricao[0] = "Report, verde, 75gt/m�";

		codigo[2] = 7564;
		nome[2] = "Papel A4";
		preco[2] = 12.90;
		descricao[2] = "Report, vermelho, 75gt/m�";

		codigo[3] = 7564;
		nome[3] = "Papel A4";
		preco[3] = 12.90;
		descricao[3] = "Report, azul, 75gt/m�";

		// Abrir arquivo cat�logo
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("produto.db"));
		System.out.println("Aquivo aberto!");
		// Escrever o tamnho
		dos.writeInt(TAMANHO);
		// Escrever itens
		System.out.println("Escrevendo itens!");
		for (int i = 0; i < TAMANHO; i++) {
			dos.writeInt(codigo[i]);
			dos.writeUTF(nome[i]);
			dos.writeDouble(preco[i]);
			dos.writeUTF(descricao[i]);
		}
		// Fechar arquivo
		dos.close();
		System.out.println("Fechado arquivo!");
	}

}
