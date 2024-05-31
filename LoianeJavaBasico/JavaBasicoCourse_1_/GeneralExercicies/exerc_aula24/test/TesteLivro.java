package LoianeJavaBasico.JavaBasicoCourse_1_.GeneralExercicies.exerc_aula24.test;

import LoianeJavaBasico.JavaBasicoCourse_1_.GeneralExercicies.exerc_aula24.dominio.Livro;

public class TesteLivro {
    public static void main(String[] args) {
        Livro kindle = new Livro();
        kindle.autor = "penelas santana";
        kindle.genero = "romance tragico";
        kindle.numrPaginas = 340;
        kindle.titulo = "o mundo nao desaba quando termina uma relacao";

        System.out.println("o autor: " + kindle.autor);
        System.out.println("o genero: " + kindle.genero);
        System.out.println("o numero de paginas: " + kindle.numrPaginas);
        System.out.println("o titulo: " + kindle.titulo);
    }
}
