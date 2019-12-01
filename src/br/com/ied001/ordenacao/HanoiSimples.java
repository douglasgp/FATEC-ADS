package br.com.ied001.ordenacao;

public class HanoiSimples {
	public static int cont=0;
	public static void main(String[] args) {
		int qtd = 3;
		hanoi(qtd, 'A', 'B', 'C');
		System.out.println("Movimentos: " +cont);
	}

	public static void hanoi(int qtd, char ini, char aux, char fim) {

		if (qtd > 0) {
			hanoi(qtd - 1, ini, fim, aux);
			System.out.printf("Mover de %s para o %s\n", ini, fim);
			hanoi(qtd - 1, aux, ini, fim);
			cont++;
		}
		
	}

}
