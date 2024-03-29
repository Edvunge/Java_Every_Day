package JavaCompletoPOOprojetos.AcademiaDevs.RewiesExtras;

public class CadastroDeLivros {
    public static void main(String[] args) {
        Autor_cls autor = new Autor_cls();
        autor.nome = "Rodrigo Turini";
        autor.email = "rodrigo.turini@caelum.com.br";
        autor.cpf = "123.456.789.10";


        Livro_cls livro = new Livro_cls();
        livro.nome = "Java 8 Pratico";
        livro.descricao = "Novos recursos da linguagem";
        livro.valor = 59.90;
        livro.isbn = "978-85-66250-46-6";

        livro.autor = autor;
        livro.mostrarDetalhes();

        Autor_cls outroAutor = new Autor_cls();
        outroAutor.nome = "Paulo Silveira";
        outroAutor.email = "paulo.silveira2caelum.com.br";
        outroAutor.cpf = "123.456.789.10";

        Livro_cls outroLivro = new Livro_cls();
        outroLivro.nome = "logica de programacao";
        outroLivro.descricao = "crie seus primeiros programas";
        outroLivro.valor = 59.90;
        outroLivro.isbn = "978-85-66250-54-0";

        outroLivro.autor = outroAutor;
        outroLivro.mostrarDetalhes();
    }
}
