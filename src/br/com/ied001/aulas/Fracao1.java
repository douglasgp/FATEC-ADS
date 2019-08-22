package br.com.ied001.aulas;
/*
 * 
 */
public class Fracao1 {

	private int num;
	private int den;
	// Opção de criação de fração passando como padrão os valores 1 e 1
	public Fracao1() {
		setNum(1);
		setDen(1);
	}
	// Opção de criação de fração onde permite informar qualquer valores (2º as regras pre-estabelecidas)
	public Fracao1(int n, int d) {
		setNum(n);
		setDen(d);
	}
	// Método de acesso
	public int getNum() {
		return num;
	}
	// Método de mutação
	public void setNum(int num) {
		this.num = num;
	}

	public int getDen() {
		return den;
	}

	public void setDen(int den) {
		if(den < 1) {
			throw new RuntimeException();
		}
		this.den = den;
	}
	
	public Fracao1 soma(Fracao1 o) {
		int resNum = num * o.den + o.num*den;
		int resDen = den * o.den;
		return new Fracao1(resNum, resDen);
	}
	
	public Fracao1 subtracao(Fracao1 o) {
		int resNum = num * o.den - o.num*den;
		int resDen = den * o.den;
		return new Fracao1(resNum, resDen);
	}

}
