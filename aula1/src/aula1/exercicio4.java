package aula1;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 4. Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e
		 * calcule a seguinte express�o:
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro n�mero inteiro");
		int a = sc.nextInt();
		
		System.out.println("Digite o segundo n�mero inteiro");
		int b = sc.nextInt();
		
		System.out.println("Digite o terceiro n�mero inteiro");
		int c = sc.nextInt();
		
		int r = (a*a)+(2*a*b)+(b*b);
		int s = (b*b) + (2*b*c) + (c*c);
		int d = (r+s)/2;
		
		System.out.println("O valor de R � " + r);
		System.out.println("O valor de S � " + s);
		System.out.println("O valor de D � " + d);
	}

}
