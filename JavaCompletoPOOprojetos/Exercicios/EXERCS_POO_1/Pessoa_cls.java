package JavaCompletoPOOprojetos.Exercicios;

public class Pessoa_cls {
    /*
    2. Crie uma classe `Pessoa` com atributos nome e idade.
    Adicione um método para exibir uma mensagem de saudação com o nome da pessoa.
    */
    public String nome;
    public int idade;

    void exibirMensagem(String nome, int idade){
        System.out.format("Ola %s voce tem %d anos , nao parece",nome ,idade);
    }
}