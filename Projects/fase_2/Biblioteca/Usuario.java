package Projects.fase_2.Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Usuario extends Pessoa {
    private String matricula;
    private List<Emprestimo> emprestimos;
    private boolean ativo;

    public Usuario(String nome, String cpf, String email, String matricula) {
        super(nome, cpf, email);
        this.matricula = matricula;
        this.emprestimos = new ArrayList<>();
        this.ativo = true;
    }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public List<Emprestimo> getEmprestimos() { return emprestimos; }

    public boolean isAtivo() { return ativo; }
    public void setAtivo(boolean ativo) { this.ativo = ativo; }

    public void adicionarEmprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
    }

    public boolean podeEmprestar() {
        long emprestimosAtivos = emprestimos.stream()
                .filter(e -> !e.isDevolvido())
                .count();
        return ativo && emprestimosAtivos < 3;
    }

    @Override
    public String getTipo() {
        return "Usuário";
    }
}
