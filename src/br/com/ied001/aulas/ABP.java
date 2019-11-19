package br.com.ied001.aulas;

import java.util.ArrayList;

public class ABP {
	/* Sentinela para raiz da �rvore bin�ria de pesquisa */
	private NodoB raiz = null;

	/* Construtor padr�o */
	public ABP() {
	};

	/* Inserir o valor na �rvore */
	public void inserir(Comparable valor) {
		if (raiz == null) {
			raiz = new NodoB(valor);
		} else {
			inserir(raiz, valor);
		}
	}

	/* Inserir o valor dados a partir do nodo informado */
	private void inserir(NodoB nodo, Comparable valor) {
		if (nodo.dado.compareTo(valor) < 0) {
			// inser��o � direita do nodo
			if (nodo.dir == null) {
				nodo.dir = new NodoB(valor);
			} else {
				inserir(nodo.dir, valor);
			}
		} else {
			// inser��o � esquerda do nodo
			if (nodo.esq == null) {
				nodo.esq = new NodoB(valor);
			} else {
				inserir(nodo.esq, valor);
			}
		}
	}

	/* Localizar o valor na �rvore */
	boolean localizar(Comparable valor) {
		if (raiz == null) {
			return false;
		} else {
			return localizar(raiz, valor);
		}
	}

	/* Localizar o valor dados a partir do nodo informado */
	private boolean localizar(NodoB nodo, Comparable valor) {
		if (nodo.dado.compareTo(valor) == 0) { // encontrou!
			return true;
		}
		if (nodo.dado.compareTo(valor) < 0) {
			// localizar � direita do nodo
			if (nodo.dir == null) {
				return false;
			} else {
				return localizar(nodo.dir, valor);
			}
		} else {
			// localizar � esquerda do nodo
			if (nodo.esq == null) {
				return false;
			} else {
				return localizar(nodo.esq, valor);
			}
		}
	}

	/* Retorna lista com elementos na ordem do percurso infixo da �rvore. */
	public ArrayList<Comparable> percursoInfixo() {
		ArrayList<Comparable> lista = new ArrayList<>();
		if (raiz != null) {
			percursoInfixo(raiz, lista);
		}
		return lista;
	}

	/*
	 * Efetua percurso infixo a partir do nodo dado, incluindo os elementos
	 * encontrados na lista dada
	 */
	private void percursoInfixo(NodoB nodo, ArrayList<Comparable> lista) {
		if (nodo.esq != null)
			percursoInfixo(nodo.esq, lista);
		lista.add(nodo.dado);
		if (nodo.dir != null)
			percursoInfixo(nodo.dir, lista);
	}

	/* Retorna representa��o textual da �rvore */
	public String toString() {
		return raiz == null ? "[]" : raiz.toString();
	}

}
