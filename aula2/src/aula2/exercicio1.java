package aula2;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double saldo = 200 , valorSaque;
		
		System.out.println("Qual valor voc� gostaria de sacar? ");
		valorSaque = ler.nextDouble();
		
		if(saldo > valorSaque) {
			System.out.println("Saque realizado com sucesso");
		}
		else {
			System.out.println("Voc� n�o tem saldo suficiente, vai precisar de cheque especial");
		}
	}
}