package br.com.ied001.aulas26;

import java.util.ArrayList;

public class ABP {
	/** Sentinela para raiz da árvore binária de pesquisa. */
    private NodoB raiz = null;
    
    public ABP() { }
    
    public void inserir(Comparable valor) {
        if (raiz == null) {
            raiz = new NodoB(valor);
        } else {
            inserir(raiz, valor);
        }
    }
    
    /** Inserir o valor dados a partir do nodo informado. */
    private void inserir(NodoB nodo, Comparable valor) {
        if (nodo.dado.compareTo(valor)<0) {
            // inserção à direita do nodo
            if (nodo.dir == null) {
                nodo.dir = new NodoB(valor);
            } else {
                inserir(nodo.dir, valor);
            }
        } else {
            // inserção à esquerda do nodo
            if (nodo.esq == null) {
                nodo.esq = new NodoB(valor);
            } else {
                inserir(nodo.esq, valor);
            }
        }
    }
    
    public ArrayList<Comparable> percursoInfixo() {
        ArrayList<Comparable> lista = new ArrayList<>();
        if (raiz != null) {
            percursoInfixo(raiz, lista);
        }
        return lista;
    }
    
    private void percursoInfixo(NodoB nodo, ArrayList<Comparable> lista) {
        if (nodo.esq != null) percursoInfixo(nodo.esq, lista);
        lista.add(nodo.dado);
        if (nodo.dir != null) percursoInfixo(nodo.dir, lista);
    }
    public String toString() {
        return raiz == null ? "[]" : raiz.toString();
    }

}
