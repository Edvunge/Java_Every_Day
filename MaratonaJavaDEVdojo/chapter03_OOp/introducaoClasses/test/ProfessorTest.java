package MaratonaJavaDEVdojo.chapter03_OOp.introducaoClasses.test;

import MaratonaJavaDEVdojo.chapter03_OOp.introducaoClasses.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "edvaldo vunge";
        professor.cpf = 123_233_4443;
        professor.matricula = "A00_2024";
        professor.rg = 22111;

        System.out.println("Nome do Professor: " + professor.nome);
        System.out.println("Matricula do Professor: " + professor.matricula);
        System.out.println("Cpf do Professor: " + professor.cpf);
        System.out.println("Rg do Professor: " + professor.rg);
    }
}
