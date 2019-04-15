package br.com.ilp010.aula13;

public class Semaforo {
	public static void main(String[] args) {
		String semaforo[] = { "Vermelho", "Amarelo", "Verde" };

		System.out.println("Ordem de um Semáforo: \n");
		for (String sinal : semaforo) {
			System.out.println(sinal + "\n");
		}
	}
}
