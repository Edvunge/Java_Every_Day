package books.cursoPraticoDeJava;

public class Pessoa1 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.genero = 'M';
        pessoa.idade =  29;
        pessoa.nome = "edvaldo vunge";

        pessoa.falar();

        System.out.println(" Idade = " + pessoa.idade + " Genero = " + pessoa.genero + " Nome = " + pessoa.nome + "...");
    }
}
