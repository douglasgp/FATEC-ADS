package br.com.ied001.aula08;

public class MainFila {
	public static void main(String[] args) {

		FilaInt fila = new FilaInt(10);
		System.out.println(fila.toString() + ": " + fila.capacidade());

		fila.adicionar(20);
		fila.adicionar(15);
		fila.adicionar(-8);

		System.out.println(fila);

		System.out.println("removido: " + fila.remover());
		System.out.println("removido: " + fila.remover());

		System.out.println(fila + ": " + fila.comprimento());
	}
}
