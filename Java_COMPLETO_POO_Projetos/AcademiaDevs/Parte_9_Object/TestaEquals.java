package Java_COMPLETO_POO_Projetos.AcademiaDevs.Parte_9_Object;

public class TestaEquals {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.setNome("Jonas Hirata");
        f1.setSalario(3000);

        Funcionario f2 = new Funcionario();
        f2.setNome("Jonas Hirata");
        f2.setSalario(3000);

        System.out.println(f1 == f2);
        System.out.println(f1.equals(f2));
    }
}
