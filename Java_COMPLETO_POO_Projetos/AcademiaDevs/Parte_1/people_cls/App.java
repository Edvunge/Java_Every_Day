package Java_COMPLETO_POO_Projetos.AcademiaDevs.Parte_1.people_cls;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Joao");
        pessoa.setIdade(47);
        pessoa.setAltura(2.23f);

        System.out.format(
                "Nome: %s, idade = %d e %.2f",
                pessoa.getNome(),
                pessoa.getIdade(),
                pessoa.getAltura()
        );
    }
}
