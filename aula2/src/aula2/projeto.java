package aula2;

import java.util.Scanner;

public class projeto {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		// escopo de vari�veis

		String nomeUsuario = "jess", usuarioInputado;

		System.out.println("Digite seu usu�rio");
		usuarioInputado = ler.next();

		for (int tentativas = 0; tentativas < 3; tentativas++) {
			if (nomeUsuario.equals(usuarioInputado)) {

				boolean sair = true;

				while (sair) {
					System.out.println("Bem vinde a Pizzaria" + "\n");

					System.out.println("|=======================================|");
					System.out.println("| Pizzaria da Villa");
					System.out.println("| Menu");
					System.out.println("|");
					System.out.println("| 1 - Cadastro de Clientes");
					System.out.println("| 2 - Cadastro de Produtos");
					System.out.println("| 3 - Iniciar Pedido (On ou Televenda");
					System.out.println("| 4 - M�todo de Pagamento");
					System.out.println("| 5 - Gerar Cupom");
					System.out.println("| 6 - Sair");
					System.out.println("|");
					System.out.println("|======================================|" + "\n");
					System.out.println("Qual seria a op��o desejada ?");
					int opcao = ler.nextInt();

					switch (opcao) {
					case 1:
						System.out.println(
								"Voc� escolheu o Cadastro de Clientes - Em instantes voc� ser� redirecionado para faz�-lo");
						break;
					case 2:
						System.out.println("Voc� escolheu o Cadastro de Produtos");
						break;
					case 3:
						System.out.println("Voc� escolheu Iniciar Pedido");
						break;
					case 4:
						System.out.println("Voc� escolheu a Forma de pagamento - D�bito e Cr�dito");
						break;
					case 5:
						System.out.println("Voc� escolheu o Gerar Cupom - Olha o desconto a� !");
						break;
					case 6:
						System.out.println("Obrigada pela prefer�ncia");
						sair = false;
						break;
					default:
						System.out.println("Op��o invalida");
					}
					System.out.println("saiu");
				}
			}

			else {
				System.out.println("Usuario incorreto, tente novamente");
				usuarioInputado = ler.next();
			}
		}

	}

}
