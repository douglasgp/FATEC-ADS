package br.com.ipl010.aula06;

public class Contador {
	public static void main(String[] args) throws Exception {
		// Contador valor inicial
		int contador = 10;
		// Valor final 0
		while (contador > 0) {
			System.out.println(contador);
			// Atualização do contador
			contador = contador - 1;
			Thread.sleep(1000);
		}
		System.out.println("Buuuumm!!!");
	}
}
