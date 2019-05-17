package br.com.ilp010.trabalho2;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class GeraCatalogo {
	public final static int TAMANHO = 10;

	public static void main(String[] args) throws Exception {

		int[] codigo = new int[TAMANHO];
		String[] nome = new String[TAMANHO];
		double[] preco = new double[TAMANHO];
		String[] descricao = new String[TAMANHO];
		codigo[0] = 7654;
		nome[0] = "Ração Para gatos";
		preco[0] = 12.90;
		descricao[0] = "Golden, Adulto, 1kg";
		codigo[1] = 6543;
		nome[1] = "Ração para cachorro";
		preco[1] = 12.90;
		descricao[1] = "Golden, Adulto, 1kg";
		codigo[2] = 5432;
		nome[2] = "Areia Higiênica";
		preco[2] = 5.90;
		descricao[2] = "CareCat, Higiênica Mineral, 4kg";
		codigo[3] = 4321;
		nome[3] = "Coleira";
		preco[3] = 10.90;
		descricao[3] = "Pet, azul, Adulto";
		codigo[4] = 4322;
		nome[4] = "Shampoo cães e gato";
		preco[4] = 12.90;
		descricao[4] = "Sanol, neutro, 200ml";
		codigo[5] = 7643;
		nome[5] = "Ração Para Gatos";
		preco[5] = 12.90;
		descricao[5] = "Golden, Filhote, 1kg";
		codigo[6] = 6143;
		nome[6] = "Ração para cachorro";
		preco[6] = 12.90;
		descricao[6] = "Golden, Filhote, 1kg";
		codigo[7] = 5492;
		nome[7] = "Cama Pet";
		preco[7] = 25.00;
		descricao[7] = "PetBamboo, Anti Alérgico, Pequeno";
		codigo[8] = 4331;
		nome[8] = "Colonia Cães e gatos";
		preco[8] = 12.00;
		descricao[8] = "PetBamboo, Anti Pulgas, 200ml";
		codigo[9] = 4382;
		nome[9] = "Tapete Higiênico";
		preco[9] = 18.00;
		descricao[9] = "Fofo Pet, Adulto, 7 unidades";

		DataOutputStream dos = new DataOutputStream(new FileOutputStream("catalogo.db"));
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
