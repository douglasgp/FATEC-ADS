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
	// i.e., de sua exibição e do acionamento das opções
	public static void main(String[] args) {
		int opcao = 0;
		do {
			// mostra menu de opções
			opcao = menu();
			// processa opção escolhida no menu
			switch (opcao) {
			case 'E': // aciona função de entrada de veículo
				entradaVeiculo();
				break;
			case 'S':// aciona função de saída de veículo
				saidaVeiculo();
				break;
			case 'C':// aciona função de consulta de veículo
				consultaVeiculo();
				break;
			case 'M': // aciona função de exibição do mapa das vagas
				mapaVagas();
				break;
			case '0': // saída do programa
				break;
			default:
				System.out.println("Operação Inválida!");
			}
		} while (opcao != '0'); // repete enquanto opção diferente de sair
	}

	// função que exibe um mapa das vagas,
	// mostrando os carros que estão estacionados em cada uma
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

	// função que localiza um veículo estacionado,
	// indicado a vaga que ocupa e o horário de entrada
	public static void consultaVeiculo() {
		String veiculo = lePlaca();
		try {
			int vaga = localizarVagaOcupada(veiculo);
			System.out.println("Vaga: " + (vaga + 1));
			System.out.println("Entrada: " + entrada[vaga]);
		} catch (RuntimeException re) {
			System.out.println("Veículo não localizado!");
		}
	}

	// função que efetua a saída um veículo estacionado,
	// localizando a vaga que ocupa e calculando o tempo estacionado
	public static void saidaVeiculo() {
		String veiculo = lePlaca();
		try {
			int vaga = localizarVagaOcupada(veiculo);
			System.out.println("Vaga " + (vaga + 1) + " ==> " + veiculo);
			saida[vaga] = LocalDateTime.now();

			System.out.println("Eentrada: " + entrada[vaga]);
			System.out.println("Saída: " + saida[vaga]);
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

	// função que efetua a entrada de um veículo,
	// localizando uma vaga livre e registrando o horário de entrada
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

	// função que localiza a vaga ocupada por um veículo
	public static int localizarVagaOcupada(String veiculo) {
		for (int i = 0; i < VAGAS; i++) {
			if (placa[i].equals(veiculo)) {
				return i;
			}
		}
		throw new RuntimeException("!! Veículo não encontrado !! ");
	}

	// função que localiza uma vaga livre
	public static int localizarVagaLivre() {
		for (int i = 0; i < VAGAS; i++) {
			if (placa[i] == null) {
				return i;
			}
		}
		throw new RuntimeException("!! Não tem vaga. Lotado!!");
	}

	// função que lê uma placa de veículo
	public static String lePlaca() {
		String veiculo = "";
		do {
			System.out.println("Placa: ");
			veiculo = teclado.next();
		} while (veiculo.length() != 7);
		return veiculo.toUpperCase();
	}

	// função que exibe o menu principal
	public static int menu() {
		System.out.println("= = = = = = = = = = = = = = = = = = = = =");
		System.out.println("= = = = = = =ESTACIONAMENTO = = = = = = =");
		System.out.println("= = = = = = = Vagas Livres " + livres);
		System.out.println();
		System.out.println("E : Entrada de veículo");
		System.out.println("S : Saída de Veículo");
		System.out.println("C : Consulta de Veículo");
		System.out.println("M : Mapa das Vagas");
		System.out.println("0 : Sair");
		System.out.println("");
		System.out.println("> ");
		return teclado.next().toUpperCase().charAt(0);
	}
}
