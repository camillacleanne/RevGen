package aula3;

public class pessoa {
	// tipificar parametros da classe pessoa
	String nome;
	String endereco;
	long cep;
	String tel;
	String email;

	void mostrarDetalhes() {
		// exibir parametros populados no metodo
		System.out.println("**********INFORMA��ES DO CLIENTE*********");
		System.out.println("O NOME DO CLIENTE �:"+nome);
		System.out.println("O ENDERE�O DA PESSOA CLIENTE �:"+endereco);
		System.out.println("O ENDERE�O DA PESSOA CLIENTE �:"+cep);
		System.out.println("O TELEFONE DA PESSOA CLIENTE �:"+tel);
		System.out.println("O EMAIL DA PESSOA CLIENTE �:"+email);
	}

}
