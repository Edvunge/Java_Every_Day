package MaratonaJavaViradoNoJirayaDEVdojo.Parte_2_OOP.B_IntroducaoMetodos.test;

import MaratonaJavaViradoNoJirayaDEVdojo.Parte_2_OOP.B_IntroducaoMetodos.dominio.Pessoa;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Mestre Jiraya");
        pessoa.setIdade(70);
        pessoa.imprime();
    }
}
