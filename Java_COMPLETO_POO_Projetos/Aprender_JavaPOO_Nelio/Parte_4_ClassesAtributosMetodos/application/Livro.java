package Java_COMPLETO_POO_Projetos.Aprender_JavaPOO_Nelio.Parte_4_ClassesAtributosMetodos.application;

public class Livro {
    String nome;
    String descricao;
    String autor;
    String isbn;
    double preco;
    String dataPub;

    void dadosLivro() {
        System.out.println("Nome do livro: " + nome);
        System.out.println("Preco: " + preco);
        System.out.println("Autor " + autor);
        System.out.println("Data de Publicacao: " + dataPub + "\n");
    }
}
