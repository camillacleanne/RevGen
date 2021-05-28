package aula3;

public class TestarLivros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Livros livro1= new Livros();
		
		livro1.nome = "CSS";
		livro1.autor = "Generatis";
		livro1.genero = "Programacao";
		livro1.tipoDeMidia = "Fisica";
		livro1.prefacio = "teste";
		livro1.anoDePublicacao = "2021";
		livro1.editora = "Antena";
		livro1.idioma = "portugues";
		livro1.isbn = "456";
		livro1.edicao = "0";
		
		//exibir metodo
		livro1.exibirLivro();
	}

}
