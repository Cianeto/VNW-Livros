package vnw.back.livros;

public class Usuario {
    private String nomeCompleto;
    private String cpf;
    private int qtdAlugueis = 0;

    public Usuario (String nomeCompleto, String cpf) {
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
    }

    public String getNomeCompleto() {
		return nomeCompleto;
	}
    public String getCpf() {
		return cpf;
	}
    public int getQtdAlugueis() {
		return qtdAlugueis;
	}
	public void setqtdAlugueis(int qtdAlugueis) {
		if(qtdAlugueis <= 2) {
			this.qtdAlugueis = qtdAlugueis;
		}else {
			System.out.println("Limite máximo de aluguéis de livros atingidos!");
		}
	}
}
