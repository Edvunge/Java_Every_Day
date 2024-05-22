package OOPprojects.SistemaGerenciamentoBiblioteca_SGB.dominio;

public class Livro {
    // titulo, autor, editora, numero de pagns, genero, isbn
    public String titulo;
    public Autor autor;
    public String editora;
    public int numeroDePaginas;
    public String genero;
    public int isbn;

    public Livro(String titulo, Autor autor, String editora, int numeroDePaginas, String genero, int isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.numeroDePaginas = numeroDePaginas;
        this.genero = genero;
        this.isbn = isbn;
    }



}
