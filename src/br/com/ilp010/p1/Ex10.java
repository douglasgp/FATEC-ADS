/*
 * Escreva um programa Java que seja capaz de ler 12 valores inteiros, 
armazenando-os em um arrray de tipo e tamanho apropriados.
O programa também deve calcular e exibir:
a soma dos valores pares contidos no array.
a soma dos valores ímpares contidos no array.
 */
package br.com.ilp010.p1;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = 5;
        int valor[] = new int[x];
        int num[] = new int[x];
        int somaPar = 0;
        int somaImpar = 0;

        for (int i = 0; i < x; i++) {
            System.out.println("Informe " + (i + 1) + "� valor inteiro: ");
            num[i] = scan.nextInt();
            if (num[i] % 2 == 0) {
                int acumulaPar = num[i];
                somaPar = num[i] + num[i];
            }else{
                int acumulaImpar = num[i];
                somaImpar = num[i] + acumulaImpar;
                acumulaImpar = 0;
            }
        }
        System.out.println(somaPar);
        System.out.println(somaImpar);
    }
}
