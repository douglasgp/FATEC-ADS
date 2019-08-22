package br.com.ied001.aulas;

public class Aula1_Main {
	public static void main(String[] args) {
		// Cria variáveis locais e atribui valores a elas
		int n1 = 1;
		int d1 = 4;
		
		int n2 = 1;
		int d2 = 2;
		// Instancia a calsse Fração passando 2 parâmetros
		Fracao1 f1 = new Fracao1(n1,d1);
		Fracao1 f2 = new Fracao1(n2,d2);
		// Atribui às variaveis da classe Fração com os valores de n1 e d1
		f1.setNum(n1);
		f1.setDen(d1);
		
		f2.setNum(n2);
		f2.setDen(d2);
		
		Fracao1 f3 = f1.soma(f2);
		Fracao1 f4 = f2.soma(f1);
		
		// Exibe o resultado
		// System.out.println(f1.getNum()+"\n"+f1.getDen());
		System.out.println(f3);
		System.out.println(f4);
	}
}
