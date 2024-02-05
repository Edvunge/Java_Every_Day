package Java_COMPLETO_POO_Projetos.AcademiaDevs.Parte_4_Encapsulamento;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();

        f.setNome("Rafael Cosentino");
        f.setSalario(2000);

        System.out.println("Nome: " + f.getNome());
        System.out.println("Salario: " + f.getSalario());
    }
}
