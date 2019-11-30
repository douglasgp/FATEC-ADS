package br.com.ied001;
import br.com.ied001.ordenacao.*;
public class TimeProcess {
	public static void main(String[] args) {
		
		int quantidade = 20;
		int[] vetor = new int[quantidade];

		vetor = GeraNumero.geraInt(quantidade);
		
		for(int i = 0; i < vetor.length; i++) {			
			System.out.println((i+1)+"º: "+vetor[i]);
		}
	}
}
