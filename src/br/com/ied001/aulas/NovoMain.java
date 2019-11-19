package br.com.ied001.aulas;

public class NovoMain {
	public static void main(String[] args) {
		// Criar uma �rvore
		ABP arvore = new ABP();
		// Define array(lista) de nomes
		String nomes[] = {"Douglas", "Artur", "Thiago", "Pedro", "Gabriel",
	            "Nayara", "Fabiano", "Ingrid", "Patricia", "Joao", "Vitoria", 
	            "Luiz", "Emmanoel", "Jhonatan", "Mike", "David", };
		// Imprime �rvore (vazia)
		System.out.println(arvore);
		// Insere nomes do array(lista na �rvore.
		for(String s : nomes) {
			arvore.inserir(s); // insere nome na �rvore
			System.out.println(arvore); // exibe �rvore
		}
		/* Exibe lista retornada como percurso infixo da �rvore
		 * (elementos em ordem crescente). */
		System.out.println(arvore.percursoInfixo());
		System.out.println("Peter <-- AVB? " + arvore.localizar("Peter"));
		System.out.println(("Mike <-- AVB? " + arvore.localizar("Mike")));
	}

}
