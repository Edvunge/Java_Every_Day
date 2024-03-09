package JavaCompletoPOOprojetos.Exercicios;

public class TestaPessoa {
    public static void main(String[] args) {
        Pessoa_cls pessoa = new Pessoa_cls();
        pessoa.nome = "edvaldo vunge";
        pessoa.idade = 28;

        pessoa.exibirMensagem(pessoa.nome, pessoa.idade);
    }
}
