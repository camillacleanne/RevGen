package aula1;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*2.Fa?a um sistema que leia as 3 notas de um aluno e calcule a m?dia final deste aluno. 
		 * Considerar que a m?dia ? ponderada e que o peso das notas ?: 2,3 e 5, respectivamente.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota");
		double nota1  = sc.nextDouble();
		
		System.out.println("Digite a segunda nota");
		double nota2  = sc.nextDouble();
		
		System.out.println("Digite a terceira nota");
		double nota3  = sc.nextDouble();
		
		double mediap = (nota1*2)+(nota2*3)+(nota3*5)/nota1+nota2+nota3;
		
		System.out.println("Sua media ? " + mediap);
	}

}
