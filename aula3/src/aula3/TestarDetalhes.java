package aula3;

public class TestarDetalhes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instanciar classe pessoa para criar um novo objeto tipo pessoa
		pessoa detalhes = new pessoa();
		
		//populando dados
		detalhes.nome ="samanta";
		detalhes.endereco ="rua nova e velha";
		detalhes.cep=12349873;
		detalhes.tel="999988888";
		detalhes.email="samantha@catmail.com";
		
		//exibir metodo
		detalhes.mostrarDetalhes();
		
		
	}

}
