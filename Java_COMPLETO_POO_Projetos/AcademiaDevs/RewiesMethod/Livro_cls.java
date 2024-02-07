package Java_COMPLETO_POO_Projetos.AcademiaDevs.RewiesMethod;

public class Livro_cls {
    String nome;
    String descricao;
    double valor;
    String isbn;
    Autor_cls autor;

    void mostrarDetalhes() {
        String mensagem = "Mostrando detalhes do livro ";
        System.out.println(mensagem);
        System.out.println("Nome: " + nome);
        System.out.println("Descricao: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN" + isbn);
        System.out.println("---");
    }
}
