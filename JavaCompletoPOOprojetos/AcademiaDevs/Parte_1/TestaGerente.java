package JavaCompletoPOOprojetos.AcademiaDevs.Parte_1;

public class TestaGerente {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.salario = 1000;

        System.out.println("Salario: " + g.salario);

        System.out.println("Aumentando o salario em 10% ");
        g.aumentaSalario();

        System.out.println("Salario: " + g.salario);

        System.out.println("Aumentando o salario em 30%  ");
        g.aumentaSalario(0.3);

        System.out.println("Salario: " + g.salario);
    }
}
