package JavaCompletoPOOprojetos.Exercicios.EXERCS_POO_3;

public class AppLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.autor = "David Goggins";
        livro1.Editora = "leya";
        livro1.genero = "bibliografico";
        livro1.titulo = "nao me podem magoar";
        livro1.numeroDePaginas = 390;
        livro1.milimetroPorFolha = 2.3;

        System.out.println("Autor: " + livro1.autor);
        System.out.println("Editora: " + livro1.Editora);
        System.out.println("Genero: " + livro1.genero);
        System.out.println("Titulo: " + livro1.titulo);
        System.out.println("Numero de paginas: " + livro1.numeroDePaginas);
        System.out.println("Milimetro por linha: " + livro1.milimetroPorFolha);
    }
}
