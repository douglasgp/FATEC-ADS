package br.com.ilp010.trabalho2;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class TesteGeraCatalogo {
	public final static int TAMANHO = 10;

	public static void main(String[] args) throws Exception {

		int[] codigo = { 7654, 6543, 5432, 4321, 4322, 7643, 6143, 5492, 4331, 4382 };
		String[] nome = { "Ra��o Para gatos", "Ra��o para cachorro", "Areia Higi�nica", "Coleira",
				"Shampoo c�es e gato", "Ra��o Para Gatos", "Ra��o para cachorro", "Cama Pet", "Colonia C�es e gatos",
				"Tapete Higi�nico" };
		double[] preco = { 12.90, 12.90, 5.90, 10.90, 12.90, 12.90, 12.90, 25.00, 12.00, 18.00 };
		String[] descricao = { "Golden, Adulto, 1kg", "Golden, Adulto, 1kg", "CareCat, Higi�nica Mineral, 4kg",
				"Pet, azul, Adulto", "Sanol, neutro, 200ml", "Golden, Filhote, 1kg", "Golden, Filhote, 1kg",
				"PetBamboo, Anti Al�rgico, Pequeno", "PetBamboo, Anti Pulgas, 200ml", "Fofo Pet, Adulto, 7 unidades" };

		DataOutputStream dos = new DataOutputStream(new FileOutputStream("src/br/com/ilp010/trabalho2/catalogo01.db"));
		System.out.println("Arquivo aberto");

		dos.writeInt(TAMANHO);

		System.out.println("Escrevendo dados...");
		for (int i = 0; i < TAMANHO; i++) {
			dos.writeInt(codigo[i]);
			dos.writeUTF(nome[i]);
			dos.writeDouble(preco[i]);
			dos.writeUTF(descricao[i]);
		}

		dos.close();
		System.out.println("Arquivo fechado");
	}
}
