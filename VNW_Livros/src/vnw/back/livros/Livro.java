package vnw.back.livros;
/*
 * 	Organização de livros: nome do livro, nome do autor, data de publicação, alugado ou não.

	Usuários: Os usuários deverão consultar os livros disponíveis para aluguel.

	Usuários precisam de nome, cpf, email e telefone para serem registrados no sistema de aluguel. 

	Usuários não cadastrados não podem alugar livros. 

	Cada usuário poderá ficar com o livro por 2 semanas.
*/
public class Livro {

	String nome;
	String autor;
	String dataDePublic;
	boolean alugado;
	
	public Livro(String nome, String autor, String dataDePublic, boolean alugado) {
		super();
		this.nome = nome;
		this.autor = autor;
		this.dataDePublic = dataDePublic;
		this.alugado = alugado;
	}
	
	public Livro() {}
}
