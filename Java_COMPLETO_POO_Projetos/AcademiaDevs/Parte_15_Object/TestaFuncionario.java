package Java_COMPLETO_POO_Projetos.AcademiaDevs.Parte_15_Object;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();

        f1.setNome("Jonas Hirata");
        f1.setSalario(3000);

        Funcionario f2 = new Funcionario();
        f2.setNome("Jonas Hirata");
        f2.setSalario(4000);

        System.out.println(f1 == f2);
        System.out.println(f1.equals(f2));
    }
}
