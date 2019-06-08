package br.com.ilp010.aula22;

public class Funcao02 {
	public static void main(String[] args) {
		double x[] = { 0, 3, 4.4, 8.2, -6.2 };
		// Chamada da função
		double total = somaArray(x);
		// Exibe resultado da operação da função
		System.out.println("Total = " + total);

		System.out.println(fatec("Ovo", "ovo"));
		System.out.println(fatec("paralelepídedo", "paralelepídedo"));
		System.out.println(fatec("", ""));
		String a = "Douglas";
		String b = null;
		System.out.println(fatec(a, b));
	}

	// Função para somar valores de um array
	// Entrada da função (parâmetros) : o array
	public static double somaArray(double[] array) {
		double soma = 0;
		for (int i = 0; i < array.length; i++) {
			soma += array[i];
		}
		return soma;
	}

	// Função para comparar duas Strings
	public static boolean fatec(String s1, String s2) {
		if (s1 == null || s2 == null)
			return false;
		if (s1.length() != s2.length())
			return false;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i))
				return false;
		}
		return true;
	}
}
