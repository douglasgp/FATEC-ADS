package br.com.ilp010.aula23;

import java.time.LocalDateTime;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Estacionamento {

	private static final int VAGAS = 40;
	private static int livres = VAGAS;
	private static Scanner teclado = new Scanner(System.in);

	private static String[] placa = new String[VAGAS];
	private static LocalDateTime[] entrada = new LocalDateTime[VAGAS];
	private static LocalDateTime[] saida = new LocalDateTime[VAGAS];

	// programa principal se ocupa apenas do menu principal,
	// i.e., de sua exibi��o e do acionamento das op��es
	public static void main(String[] args) {
		int opcao = 0;
		do {
			// mostra menu de op��es
			opcao = menu();
			// processa op��o escolhida no menu
			switch (opcao) {
			case 'E': // aciona fun��o de entrada de ve�culo
				entradaVeiculo();
				break;
			case 'S':// aciona fun��o de sa�da de ve�culo
				saidaVeiculo();
				break;
			case 'C':// aciona fun��o de consulta de ve�culo
				consultaVeiculo();
				break;
			case 'M': // aciona fun��o de exibi��o do mapa das vagas
				mapaVagas();
				break;
			case '0': // sa�da do programa
				break;
			default:
				System.out.println("Opera��o Inv�lida!");
			}
		} while (opcao != '0'); // repete enquanto op��o diferente de sair
	}

	// fun��o que exibe um mapa das vagas,
	// mostrando os carros que est�o estacionados em cada uma
	public static void mapaVagas() {
		for (int l = 0; l < VAGAS / 10; l++) {
			for (int c = 0; c < 10; c++) {
				System.out.printf("%7d", 1 * 10 + c + 1);
				if ((c + 1) % 10 == 0) {
					System.out.println("");
				} else {
					System.out.println("|");
				}
			}
			for (int c = 0; c < 10; c++) {
				System.out.printf("%7s", placa[l * 10 + c] != null ? placa[c] : "");
				System.out.println((c + 1) % 10 == 0 ? "\n" : "|");
			}
		}
	}

	// fun��o que localiza um ve�culo estacionado,
	// indicado a vaga que ocupa e o hor�rio de entrada
	public static void consultaVeiculo() {
		String veiculo = lePlaca();
		try {
			int vaga = localizarVagaOcupada(veiculo);
			System.out.println("Vaga: " + (vaga + 1));
			System.out.println("Entrada: " + entrada[vaga]);
		} catch (RuntimeException re) {
			System.out.println("Ve�culo n�o localizado!");
		}
	}

	// fun��o que efetua a sa�da um ve�culo estacionado,
	// localizando a vaga que ocupa e calculando o tempo estacionado
	public static void saidaVeiculo() {
		String veiculo = lePlaca();
		try {
			int vaga = localizarVagaOcupada(veiculo);
			System.out.println("Vaga " + (vaga + 1) + " ==> " + veiculo);
			saida[vaga] = LocalDateTime.now();

			System.out.println("Eentrada: " + entrada[vaga]);
			System.out.println("Sa�da: " + saida[vaga]);
			// saida - entrada
			long horas = saida[vaga].getHour() - entrada[vaga].getHour();
			long minutos = saida[vaga].getMinute() - entrada[vaga].getMinute();
			if (minutos < 0) {
				horas--;
				minutos = 60 + minutos;
			}
			System.out.printf("Tempo : %02dH%02d (%d min)\n", horas, minutos, horas * 60 + minutos);
			saida[vaga] = null;
			entrada[vaga] = null;
			placa[vaga] = null;
			livres++;
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}

	// fun��o que efetua a entrada de um ve�culo,
	// localizando uma vaga livre e registrando o hor�rio de entrada
	public static void entradaVeiculo() {
		try {
			int vaga = localizarVagaLivre();
			String veiculo = lePlaca();
			System.out.println(veiculo + " ==> Vaga " + (vaga + 1));
			placa[vaga] = veiculo;
			entrada[vaga] = LocalDateTime.now();
			saida[vaga] = null;
			livres--;
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}

	// fun��o que localiza a vaga ocupada por um ve�culo
	public static int localizarVagaOcupada(String veiculo) {
		for (int i = 0; i < VAGAS; i++) {
			if (placa[i].equals(veiculo)) {
				return i;
			}
		}
		throw new RuntimeException("!! Ve�culo n�o encontrado !! ");
	}

	// fun��o que localiza uma vaga livre
	public static int localizarVagaLivre() {
		for (int i = 0; i < VAGAS; i++) {
			if (placa[i] == null) {
				return i;
			}
		}
		throw new RuntimeException("!! N�o tem vaga. Lotado!!");
	}

	// fun��o que l� uma placa de ve�culo
	public static String lePlaca() {
		String veiculo = "";
		do {
			System.out.println("Placa: ");
			veiculo = teclado.next();
		} while (veiculo.length() != 7);
		return veiculo.toUpperCase();
	}

	// fun��o que exibe o menu principal
	public static int menu() {
		System.out.println("= = = = = = = = = = = = = = = = = = = = =");
		System.out.println("= = = = = = =ESTACIONAMENTO = = = = = = =");
		System.out.println("= = = = = = = Vagas Livres " + livres);
		System.out.println();
		System.out.println("E : Entrada de ve�culo");
		System.out.println("S : Sa�da de Ve�culo");
		System.out.println("C : Consulta de Ve�culo");
		System.out.println("M : Mapa das Vagas");
		System.out.println("0 : Sair");
		System.out.println("");
		System.out.println("> ");
		return teclado.next().toUpperCase().charAt(0);
	}
}
