package JavaCompletoPOOprojetos.AcademiaDevs.Parte_14_Exceptions;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();

        try {
            f.aumentaSalario(-1000);
        } catch (IllegalArgumentException e) {
            System.out.println("Houve uma IllegalArgumentException ao aumentar o salario");
        }
    }
}
