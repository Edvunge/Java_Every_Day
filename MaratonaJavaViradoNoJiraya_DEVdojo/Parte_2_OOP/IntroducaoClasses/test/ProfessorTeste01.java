package MaratonaJavaViradoNoJiraya_DEVdojo.Parte_2_OOP.IntroducaoClasses.test;

import MaratonaJavaViradoNoJiraya_DEVdojo.Parte_2_OOP.IntroducaoClasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mestre Kami";
        professor.idade = 123;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.nome + " idade: " + professor.idade + " sexo: " + professor.sexo);
    }
}
