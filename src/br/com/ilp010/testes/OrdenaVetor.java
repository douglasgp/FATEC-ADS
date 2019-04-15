package br.com.ilp010.testes;

public class OrdenaVetor {
	public static void main(String[] args) {

		int vet[] = { 23, 42, 84, 51, 91, 38 };
		int aux = 0;

		for (int i = 0; i < vet.length; i++) {
			for (int j = 0; i < vet.length - 1; i++) {
				if (vet[j] < vet[j + 1]) {
					aux = vet[j];
					vet[j] = vet[j + 1];
					vet[j + 1] = aux;
				}
			}
		}
		for (int i = 0; i < vet.length; i++) {
			System.out.println(vet[i]);
		}
	}
}
