package aula1;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro valor do ponto no plano");
		double px1 = sc.nextDouble();

		System.out.println("Digite o segundo valor do ponto no plano");
		double py1 = sc.nextDouble();

		System.out.println("Digite o terceiro valor do ponto no plano");
		double px2 = sc.nextDouble();
		
		System.out.println("Digite o quarto valor do ponto no plano");
		double py2 = sc.nextDouble();
		
		double d = (px2-px1)*(px2-px1) + (py2-py1)*(py2-py1);
		java.lang.Math.sqrt(d);
		
		System.out.println("Sua distancia é " + d);
	}

}
