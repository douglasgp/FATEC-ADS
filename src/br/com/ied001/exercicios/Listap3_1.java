package br.com.ied001.exercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JOptionPane;

/*
 * Escreva um programa em Java que:
- leia 20 valores reais dados pelo usu�rio, armazenando-os em um arquivo;
- determine a m�dia dos valores, com uso de uma fun��o que receba o array como par�metro e retorne
o valor da m�dia (sem realizar qualquer opera��o de entrada ou sa�da no console);
- imprima a m�dia obtida da fun��o no programa principal;
- fa�a a entrada de um valor real extra, tamb�m dado pelo usu�rio;
- exiba a contagem das ocorr�ncias deste valor no array, por meio de uma fun��o (tal como acima) e
imprima o resultado no programa principal.

 */
public class Listap3_1 {
	public static void main(String[] args) {
		String arq = "RW/Ex01.txt";
		int cont = 0;
		BufferedReader br = null;
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(arq))) {
			do {
				cont++;
				int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + cont + "� valor:"));
				bw.write(cont + "� : " + valor);
				bw.write("\n");
			} while (cont < 5);
			bw.write("EOF");

		} catch (Exception e) {
			System.out.println(e);
			System.exit(-1);
		}
		try {
			String line;
			br = new BufferedReader(new FileReader(arq));
			// Inicia Leitura
			System.out.println("- - - - - Conte�do - - - - - ");
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
