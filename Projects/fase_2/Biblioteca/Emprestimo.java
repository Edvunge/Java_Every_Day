package Projects.fase_2.Biblioteca;

import java.util.Calendar;
import java.util.Date;

public class Emprestimo {
    private static int proximoId = 1;

    private int id;
    private Usuario usuario;
    private Livro livro;
    private Date dataEmprestimo;
    private Date dataPrevistaDevolucao;
    private Date dataRealDevolucao;
    private Funcionario funcionarioResponsavel;
    private boolean devolvido;

    public Emprestimo(Usuario usuario, Livro livro, Funcionario funcionario) {
        this.id = proximoId++;
        this.usuario = usuario;
        this.livro = livro;
        this.funcionarioResponsavel = funcionario;
        this.dataEmprestimo = new Date();
        this.devolvido = false;

        Calendar cal = Calendar.getInstance();
        cal.setTime(dataEmprestimo);
        cal.add(Calendar.DAY_OF_MONTH, 15);
        this.dataPrevistaDevolucao = cal.getTime();
    }

    public int getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public Date getDataPrevistaDevolucao() {
        return dataPrevistaDevolucao;
    }

    public Date getDataRealDevolucao() {
        return dataRealDevolucao;
    }

    public Funcionario getFuncionarioResponsavel() {
        return funcionarioResponsavel;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void devolver() {
        this.dataPrevistaDevolucao = new Date();
        this.devolvido = true;
        livro.devolver();
    }

    public boolean isAtrasado() {
        if (devolvido) {
            return dataRealDevolucao.after(dataPrevistaDevolucao);
        }
        return new Date().after(dataPrevistaDevolucao);
    }

    public long getDiasAtraso() {
        if (!isAtrasado()) return 0;

        Date dataComparacao = devolvido ? dataRealDevolucao : new Date();
        long diferenca = dataComparacao.getTime() - dataPrevistaDevolucao.getTime();
        return diferenca / (1000 * 60 * 60 * 24);
    }

    @Override
    public String toString() {
        String statusStr = devolvido ? "DEVOLVIDO" : (isAtrasado() ? "ATRASADO" : "EMPRESTADO");
        return String.format("Emprestimo #%d - %s para %s [%s]",
                id, livro.getTitulo(), usuario.getNome(), statusStr);
    }
}
