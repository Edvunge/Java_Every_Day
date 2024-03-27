package CompleteIntensiveJava_AppliedToPractice.section_2_aprofundamentoPoo;

import CompleteIntensiveJava_AppliedToPractice.section_1_fundamentos.oop.introducaoclasses.Pessoa;

public class IntroduacaoObjectos {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.name = "edvaldo";
        pessoa.idade = 27;
        pessoa.email = "email@pontocom";

        System.out.println("nome: " + pessoa.name);
        System.out.println("idade: " + pessoa.idade);
        System.out.println("email: " + pessoa.email);
    }
}
