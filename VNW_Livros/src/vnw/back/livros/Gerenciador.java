package vnw.back.livros;

import java.util.ArrayList;
import java.util.Scanner;

public class Gerenciador {
	
	public static void startBiblioteca() {
		ArrayList<Livro> biblioteca = new ArrayList<Livro>();
		
		GerenciadorUsuario gerenciadorUsuario = new GerenciadorUsuario();
		
		Scanner input = new Scanner(System.in);
		adicionarLivrosTemplate(biblioteca);
		int opt;
		
		System.out.println("Bem-vindo à biblioteca");
		
		while(true) {
			try {
				
				System.out.println("\nOpcao 1: Cadastrar Usuário \nOpcao 2: Pesquisar por usuário \nOpcao 3: \nOpcao 4: \nOpcao 0: Encerrar");
				opt = input.nextInt();
				input.nextLine();
				
				switch(opt) {
				case 1:
                    System.out.println("Insira seu CPF: ");
                    String cpf = input.nextLine();

                    System.out.println("Insira seu nome completo: ");
                    String nomeCompleto = input.nextLine();

                    gerenciadorUsuario.cadastrarUsuarios(cpf, nomeCompleto);
                    break;
                case 2:
                    input.nextLine();
                    System.out.println("Digite o CPF: ");
                    cpf = input.nextLine();

                    String usuarioCadastrado = gerenciadorUsuario.encontrarUsuario(cpf).isPresent()?
                            "Usuário Encontrado" :
                            "Usuário não cadastrado";

                    System.out.println(usuarioCadastrado);
                    break;
				case 3:
					
					break;
				case 4:
					
					break;
				case 0:
					input.close();
					return;
				}
				
				
			} catch(Exception e) {System.err.println(e.getMessage());}
		}
	}
	
	public static void adicionarLivrosTemplate(ArrayList<Livro> biblioteca) {
		biblioteca.add(new Livro("Romeu e Julieta", "Shakespeare", "1597", false));
		biblioteca.add(new Livro("O Código da Vinci", "Dan Brown", "2003", false));
		biblioteca.add(new Livro("Pense e Enriqueça", "Napoleon Hill", "1937", false));
		biblioteca.add(new Livro("O Senhor dos Anéis", "J. R. R. Tolkien", "1954", false));
		biblioteca.add(new Livro("Harry Potter e a Pedra Filosofal", "J. K. Rowling", "1997", false));
	}
}
