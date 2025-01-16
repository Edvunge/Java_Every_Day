package MaratonaJavaDEVdojo.chapter03_OOp.introducaoClasses.test;

import MaratonaJavaDEVdojo.chapter03_OOp.introducaoClasses.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.idade = 29;
        estudante.matricula = "A00_2025";
        estudante.nome = "edvaldo vunge";

        System.out.println("nome do estudante: " + estudante.nome);
        System.out.println("matricula do estudante: " + estudante.matricula);
        System.out.println("idade do estudante: " + estudante.idade);
    }
}
