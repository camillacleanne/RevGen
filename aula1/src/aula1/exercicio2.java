package aula1;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		/*2. Faça um sistema que leia a idade de uma pessoa expressa em 
		 * dias e mostre-a expressa em anos, meses e dias. 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de dias de vida voce tem");
		
		int dias = sc.nextInt();
		
		int ano = (dias/365);
		int anoResto = dias%365;		
		
		int mes = anoResto/30;
		int qtdDia = anoResto%30;
		
		
		System.out.println("Sua idade em anos é " + ano);
		System.out.println("Sua idade em meses é " + mes);
		System.out.println("Sua idade em dias é " + qtdDia);
		

	}

}