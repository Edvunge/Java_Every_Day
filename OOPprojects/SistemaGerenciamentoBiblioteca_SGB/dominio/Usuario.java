package OOPprojects.SistemaGerenciamentoBiblioteca_SGB.dominio;

public class Usuario {
    // nome, idade, altura, sexo, gostoLiterario
    public String nome;
    public int idade;
    public double altura;
    public String sexo;
    public String gostoLiterario;

    public Usuario(String nome, int idade, double altura, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.sexo = sexo;
    }
}
