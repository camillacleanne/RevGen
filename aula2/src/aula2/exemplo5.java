package aula2;

import java.util.Scanner;

public class exemplo5 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int continua = 1;

		while (continua == 1) {

			System.out.println("Digite o primeiro numero");
			int numeroA = ler.nextInt();

			System.out.println("Digite o segundo numero");
			int numeroB = ler.nextInt();

			System.out.println("Digite a opera��o desejada 1-Soma, 2-Subtra��o, 3-Divis�o e 4-Multiplica��o");
			int operador = ler.nextInt();

			double valorFinal = 0;
			if (operador == 1) {
				valorFinal = (numeroA + numeroB);
			}

			else if (operador == 2) {
				valorFinal = (numeroA - numeroB);
			}

			else if (operador == 3) {
				valorFinal = (numeroA / numeroB);
			}

			else {
				valorFinal = (numeroA * numeroB);
			}

			System.out.println("Valor final " + valorFinal);

			System.out.println("Voc� deseja continuar a opera��o digite 1-Sim ou 2-Nao");
			continua = ler.nextInt();
		}
		System.out.println("volte sempre");
	}
}