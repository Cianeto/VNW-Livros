package vnw.back.livros;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GerenciadorUsuario {

    private List<Usuario> listaUsuarios = new ArrayList<>();

    public Optional<Usuario> encontrarUsuario(String cpf) {
        return listaUsuarios.stream()
                .filter(usuario -> usuario.getCpf().equals(cpf))
                .findFirst();
    }

    public void cadastrarUsuarios(String cpf, String nomeCompleto) {
        if (encontrarUsuario(cpf).isEmpty()) {
            listaUsuarios.add(new Usuario(nomeCompleto, cpf));
            System.out.println("Novo usuário cadastrado com sucesso!");
        } else {
            System.out.println("Usuário já cadastrado");
        }
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }
}
