package UdemyCourses.CursoDeJavaOOPwithHelderAragao;

public class PessoaApp {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(1, "Helder");
        Pessoa pessoa2 = new Pessoa(2, "Ana");

        System.out.println(pessoa1.getNome() + " " + pessoa1.getCodigo());

        pessoa1.setNome("edvaldo");
        System.out.println("o meu nome: " + pessoa1.getNome());
    }
}
