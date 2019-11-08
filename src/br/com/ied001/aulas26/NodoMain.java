package br.com.ied001.aulas26;

public class NodoMain {
	public static void main(String[] args) {
		// Criar uma árvore
		ABP arvore = new ABP();

		String nomes[] = { "Douglas", "Artur", "Thiago", "Pedro", "Gabriel", "Nayara", "Fabiano", "Ingrid", "Patricia",
				"Joao", "Vitoria", "Luiz", "Emmanoel", "Jhonatan", "Mike", "David", "Drielen T", "Plinio T" };

		System.out.println(arvore);
		for (String s : nomes) {
			arvore.inserir(s);
			System.out.println(arvore);
		}
		System.out.println(arvore.percursoInfixo());
	}
}
