package JavaCompletoPOOprojetos.Exercicios;

public class Livro_cls {
    /*
    4. Crie uma classe `Livro` com atributos título, autor e número de páginas.
    Adicione métodos para exibir as informações do livro.
    */
    public String titulo;
    public String autor;
    public int numerosDePaginas;

    void informacoesDoLivro(String titulo, String autor, int numerosDePaginas) {
        System.out.println("=====================| ARTIGOS LITERERIOS |======================\n");
        System.out.format("A/O Autor(a): %s \n",autor);
        System.out.format("O livro: %s\n",titulo);
        System.out.format("O numero de paginas: %d\n",numerosDePaginas);
        System.out.println("\n=====================|  |========================================");
    }
}
