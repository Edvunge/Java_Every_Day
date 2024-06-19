package books.cursoPraticoDeJava;

public class Pessoa {
    // Atributos (ESTADO)
    String nome;
    char genero;
    int idade;

    // construtor default para os objetos da classe Pessoa
    public Pessoa() {
    }

    // metodos (comportamentos)
    void falar() {
        System.out.println("Blá, Blá, Blá, ...");
    }
}
