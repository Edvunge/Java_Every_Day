package MaratonaJavaViradoNoJirayaDEVdojo.Parte_2_OOP.B_IntroducaoMetodos.test;

import MaratonaJavaViradoNoJirayaDEVdojo.Parte_2_OOP.B_IntroducaoMetodos.dominio.Estudante;
import MaratonaJavaViradoNoJirayaDEVdojo.Parte_2_OOP.B_IntroducaoMetodos.dominio.ImpressoraEstudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante1.nome = "Midoriya";
        estudante1.idade = 15;
        estudante1.sexo = 'M';

        estudante2.nome = "Sakura";
        estudante2.idade = 16;
        estudante2.sexo = 'F';

        impressora.imprime(estudante1);
        impressora.imprime(estudante2);

    }
}
