package vnw.back.livros;

import java.util.ArrayList;

public class Gerenciador {
	
	public static void startBiblioteca() {
		ArrayList<Livro> biblioteca = new ArrayList<Livro>();
		
	}
	
	public static void adicionarLivrosTemplate(ArrayList<Livro> biblioteca) {
		biblioteca.add(new Livro("Romeu e Julieta", "Shakespeare", "1597", false));
		biblioteca.add(new Livro("O Código da Vinci", "Dan Brown", "2003", false));
		biblioteca.add(new Livro("Pense e Enriqueça", "Napoleon Hill", "1937", false));
		biblioteca.add(new Livro("O Senhor dos Anéis", "J. R. R. Tolkien", "1954", false));
		biblioteca.add(new Livro("Harry Potter e a Pedra Filosofal", "J. K. Rowling", "1997", false));
	}
}
