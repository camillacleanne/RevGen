package aula1;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		/*
		 * 1. Fa�a um sistema que leia a idade de uma pessoa expressa em anos, 
		 * meses e dias e mostre-a expressa apenas em dias. 
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantos anos voce tem:\n ");		
		int anos = sc.nextInt();
		
		System.out.println("Digite a quantidade de meses voce tem:\n ");		
		int meses = sc.nextInt();
		
		System.out.println("Digite a quantidade de dias voce tem:\n ");		
		int dias = sc.nextInt();
		
		int resp = (anos * 365) + (meses * 30) + dias;
		
		System.out.println("Seu tempo de vida em dias � igual a " + resp);	
		
	}

}