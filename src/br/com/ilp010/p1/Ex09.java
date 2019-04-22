/*
 * screva um programa Java que realize as seguintes tarefas:
obtenha três números REAIS (do tipo double), fornecidos pelo usuário durante a execução do programas;
determine, por meio de uma função construída para esta finalidade, se estes três números FORMAM ou NÃO uma progressão ARITMÉTICA.
Este programa DEVE ser de console (portanto os números serão lidos com um objeto da classe Scanner).
Caso a solução apresentada não contenha a função solicitada, ocorrerá o desconto de 1/3 do valor da questão.
DICA: Se são dados três números A, B e C, temos uma progressão ARITMÉTICA quando (B-A)==(C-B).
 */
package br.com.ilp010.p1;

import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Solicita dados do usuário
        System.out.println("Informe o 1º número: ");
        double a = scan.nextDouble();
        System.out.println("Informe o 2º número: ");
        double b = scan.nextDouble();
        System.out.println("Informe o 3º número: ");
        double c = scan.nextDouble();

        double resp = PA(a, b, c);
        System.out.println(resp);
    }

    public static double PA(double n1, double n2, double n3) {
        double resposta = 0;
        double pa = 0;
        if ((n1 - n2) == (n3 - n2)){
           pa = resposta;
        }

        return resposta;
    }

}
