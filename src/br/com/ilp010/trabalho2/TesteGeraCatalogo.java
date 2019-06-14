package br.com.ilp010.trabalho2;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class TesteGeraCatalogo {
	public final static int TAMANHO = 10;

	public static void main(String[] args) throws Exception {

		int[] codigo = { 7654, 6543, 5432, 4321, 4322, 7643, 6143, 5492, 4331, 4382, 8654, 9543, 4432, 3321, 2322, 2643, 1143, 1492, 1331, 4392  };
		String[] nome = { "Raçãoo Para gatos", "Raçãoo para cachorro", "Areia Higiênica", "Coleira",
				"Shampoo cães e gato", "Ração Para Gatos", "Raçãoo para cachorro", "Cama Pet", "Colonia Cães e gatos",
				"Tapete Higiênico", "Ração Para gatos", "Raçãoo para cachorro", "Areia Higiênica", "Coleira",
				"Shampoo cães e gato", "Ração Para Gatos", "Raçãoo para cachorro", "Cama Pet", "Colonia Cães e gatos",
				"Tapete Higiênico" };
		double[] preco = { 12.90, 12.90, 5.90, 10.90, 12.90, 12.90, 12.90, 25.00, 12.00, 18.00, 32.50, 22.95, 51.93, 30.67, 19.34, 12.19, 23.95, 25.83, 12.64, 65.91 };
		String[] descricao = { "Golden, Adulto, 1kg", "Golden, Adulto, 1kg", "CareCat, Higiênica Mineral, 4kg",
				"Pet, azul, Adulto", "Sanol, neutro, 200ml", "Golden, Filhote, 1kg", "Golden, Filhote, 1kg",
				"PetBamboo, Anti Alérgico, Pequeno", "PetBamboo, Anti Pulgas, 200ml", "Fofo Pet, Adulto, 7 unidades", "Golden, Filhote, 1.5kg", "Golden, Filhote, 1.5kg", "CareCat, Higiênica Mineral, 4kg",
				"Pet, Branco, Filhote", "Sanol, neutro, 500ml", "Golden, Adulto, 1.5kg", "Golden, Adulto, 15kg",
				"PetBamboo, Anti Alérgico, Grande", "PetBamboo, Anti Pulgas, 500ml", "Fofo Pet, Adulto, 20 unidades" };

		DataOutputStream dos = new DataOutputStream(new FileOutputStream("/home/douglasgp/Público/produto.db"));
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
