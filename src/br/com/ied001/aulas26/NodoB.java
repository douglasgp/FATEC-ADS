package br.com.ied001.aulas26;

public class NodoB {

	public NodoB esq;
	public NodoB dir;
	public Comparable dado;

	public NodoB(Comparable d) {
		dado = d;
		esq = null;
		dir = null;
	}

	public String toString() {
		String sEsq = esq == null ? " " : esq.toString();
		String sDir = dir == null ? " " : dir.toString();
		return String.format("[%s|%s|%s]", sEsq, dado, sDir);
	}

}
