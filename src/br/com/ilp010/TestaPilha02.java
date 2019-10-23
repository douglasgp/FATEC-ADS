package br.com.ilp010;

public class TestaPilha02 {
	public static void main(String[] args) {
		PilhaInt l = new PilhaInt(5);
		System.out.println(l.toString() + ":" + l.capacidade());
		int elem = 0;
		
		while(!l.cheia()) {
			l.adicionar(elem++);
			System.out.println(l);
		}
		
		while(!l.vazio()) {
			elem = l.remove();
			System.out.println(l + "->" + elem);
		}
	}

}
