import java.util.Date;

public class Aluno extends Usuario {
    private String escola;

    public Aluno(String nome, String cpf, Date dataNascimento, int id, String escola) {
        super(nome, cpf, dataNascimento, id);
        this.escola = escola;
    }

    public boolean devolverLivro(Livro livro) {
        // Implementar a lógica para devolver o livro
        return false;
    }

    public boolean pegarLivro(Livro livro) {
        // Verificar se o aluno já atingiu o limite de livros emprestados
        if (livrosAlugados.size() < 5) {
            // Adicionar o livro à lista de livros alugados pelo aluno
            livrosAlugados.add(livro);
            return true;
        } else {
            System.out.println("O aluno já atingiu o limite de livros emprestados.");
            return false;
        }
    }
}