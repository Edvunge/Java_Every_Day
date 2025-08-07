package Projects.fase_2.Biblioteca;

enum StatusLivro {
    DISPONIVEL, EMPRESTADO, RESERVADO, MANUTENCAO
}

public class Livro {
    private String isbn;
    private String autor;
    private String titulo;
    private String editora;
    private int anoPublicacao;
    private String categoria;
    private StatusLivro status;
    private int totalExamplares;
    private int exemplaresDisponiveis;

    public Livro(String isbn, String titulo, String autor, String editora, int anoPublicacao, String categoria, int totalExamplares) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.categoria = categoria;
        this.totalExamplares = totalExamplares;
        this.exemplaresDisponiveis = exemplaresDisponiveis;
        this.status = StatusLivro.DISPONIVEL;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEditora() {
        return editora;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getCategoria() {
        return categoria;
    }

    public StatusLivro getStatus() {
        return status;
    }

    public int getTotalExamplares() {
        return totalExamplares;
    }

    public int getExemplaresDisponiveis() {
        return exemplaresDisponiveis;
    }

    public void setStatus(StatusLivro status) {
        this.status = status;
    }

    public boolean isDisponivel() {
        return exemplaresDisponiveis > 0 && status == StatusLivro.DISPONIVEL;
    }

    public boolean emprestar() {
        if (isDisponivel()) {
            exemplaresDisponiveis--;
            if (exemplaresDisponiveis == 0) {
                status = StatusLivro.EMPRESTADO;
            }
            return true;
        }
        return false;
    }

    public void devolver() {
        exemplaresDisponiveis++;
        if (status == StatusLivro.EMPRESTADO) {
            status = StatusLivro.DISPONIVEL;
        }
    }

    @Override
    public String toString() {
        return String.format("\uD83D\uDCDA %s - %s (%d) [%s] - Disponíveis: %d/%d",
                                          titulo, autor, anoPublicacao, categoria, exemplaresDisponiveis, totalExamplares);
    }
}
