package br.com.ied001.aula25;

public class Recursive01 {
	public static int value = 10;

	public static void main(String[] args) {
		function();
		System.out.println(value);

	}

	public static int function() {

		if (value != 10) {

			for (int i = 0; i <= 10; i++) {
				value--;
			}
			function();
		}
		return value;

	}

}
