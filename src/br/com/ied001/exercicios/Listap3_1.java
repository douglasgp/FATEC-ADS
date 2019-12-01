package br.com.ied001.exercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JOptionPane;

/*
 * Escreva um programa em Java que:
- leia 20 valores reais dados pelo usuário, armazenando-os em um arquivo;
- determine a média dos valores, com uso de uma função que receba o array como parâmetro e retorne
o valor da média (sem realizar qualquer operação de entrada ou saída no console);
- imprima a média obtida da função no programa principal;
- faça a entrada de um valor real extra, também dado pelo usuário;
- exiba a contagem das ocorrências deste valor no array, por meio de uma função (tal como acima) e
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
				int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + cont + "º valor:"));
				bw.write(cont + "º : " + valor);
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
			System.out.println("- - - - - Conteúdo - - - - - ");
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
