package aula1;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1.3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
		 * expressa em segundos e mostre-o expresso em horas, minutos e segundos.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite quant odurou o evento em segundos:\n ");
		int segundos = sc.nextInt();
		
		int horas = segundos/3600;
		int resthoras = segundos%3600;
		int minutos = resthoras/60;
		int segundo = resthoras%60;
		
		System.out.println("O evento durou em horas " + horas);
		System.out.println("O evento durou em minutos " + minutos);
		System.out.println("O evento durou em segundos" + segundo);
		
		
	}

}
