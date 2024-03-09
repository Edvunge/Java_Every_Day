package JavaCompletoPOOprojetos.Exercicios;

public class TestaLivro {
    public static void main(String[] args) {
        Livro_cls livro = new Livro_cls();
        livro.titulo = "Harry Potter";
        livro.autor = "JK. Rolling";
        livro.numerosDePaginas = 2000;

        livro.informacoesDoLivro(livro.titulo, livro.autor, livro.numerosDePaginas);
    }
}
