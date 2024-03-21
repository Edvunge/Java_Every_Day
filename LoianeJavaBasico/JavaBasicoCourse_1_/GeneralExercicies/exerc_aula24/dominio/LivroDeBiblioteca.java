package LoianeJavaBasico.JavaBasicoCourse_1_.GeneralExercicies.exerc_aula24.dominio;

public class LivroDeBiblioteca {
    public int numDeSerie;
    public static void main(String[] args) {
        Livro livroDeBiblioteca = new Livro();
        LivroDeBiblioteca livroDeBiblioteca1 = new LivroDeBiblioteca();
        livroDeBiblioteca.autor = "ed";
        livroDeBiblioteca.titulo = "a arte do nada";
        livroDeBiblioteca.numrPaginas = 234;
        livroDeBiblioteca.genero = "reflexao";
        livroDeBiblioteca1.numDeSerie = 3332;

        System.out.println("o autor: " + livroDeBiblioteca.autor);
        System.out.println("o genero: " + livroDeBiblioteca.genero);
        System.out.println("o numero de paginas: " + livroDeBiblioteca.numrPaginas);
        System.out.println("o titulo: " + livroDeBiblioteca.titulo);
        System.out.println("o numero de serie: "+ livroDeBiblioteca1.numDeSerie);
    }
}
