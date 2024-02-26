package Java_COMPLETO_POO_Projetos.Aprender_JavaPOO_Nelio.Parte_4_ClassesAtributosMetodos.application;

public class Principal {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.nome = "B Linux";
        livro.descricao = "livro sobre linux";
        livro.autor = "edvaldo vunge";
        livro.isbn = "93949";
        livro.preco = 45.5;
        livro.dataPub = "20/042017";

        livro.dadosLivro();
    }
}
