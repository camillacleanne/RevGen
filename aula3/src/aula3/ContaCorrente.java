package aula3;

public class ContaCorrente {
	//tipificar parametros da classe ContaCorrente
	String nome;
	String numConta;
	String agencia;
	String pix;
	Double saldo;

	void mostrarExtrato() {
		//exibir parametros populados no metodo
		System.out.println(nome);
		System.out.println(numConta);
		System.out.println(agencia);
		System.out.println(pix);
		System.out.println(saldo);
	}
}
