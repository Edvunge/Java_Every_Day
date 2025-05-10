package AulasDoYoutube.broCode.oop.javaCourse2023.part00_exercs.exerc01_metodosClasses;

public class Pessoa {
    public String nome;
    public int idade;

    /*
    Crie uma classe `Pessoa` com atributos `nome` e `idade`,
    e métodos `fazerAniversario` (que aumenta a idade em 1) e `apresentar` (que imprime o nome e a idade da pessoa).
    Implemente um método `main` para criar um objeto `Pessoa`, chamar os métodos e verificar o resultado.
    */

    void fazerAniversario(int idade) {
        this.idade = idade+1;
    }

    void apresentar(String nome, int idade) {

        System.out.println("Nome: " + nome + " Idade: " + idade);
    }
}
