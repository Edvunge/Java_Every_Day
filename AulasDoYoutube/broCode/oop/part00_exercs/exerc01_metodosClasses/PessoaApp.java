package AulasDoYoutube.broCode.oop.part00_exercs.exerc01_metodosClasses;

public class PessoaApp {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "edvaldo";
        pessoa.idade = 28;

        pessoa.apresentar(pessoa.nome, pessoa.idade);

        System.out.println();

        pessoa.fazerAniversario(pessoa.idade);

        pessoa.apresentar(pessoa.nome, pessoa.idade);

    }
}
