package Java_COMPLETO_POO_Projetos.AcademiaDevs.Parte_1;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario func = new Funcionario();
        func.nome = "ana";
        func.salarioDoFuncionario = 789.98;

        Funcionario operador = new Funcionario();
        operador.nome = "celeste";
        operador.salarioDoFuncionario = 789.98;

        System.out.println("Dados do Funcionaria.\n\n");
        System.out.format("meu nome: %s , sou funcionaria 1 , salario: %.2f\n",func.nome ,func.salarioDoFuncionario);
        System.out.format("meu nome: %s , sou funcionaria 2 , salario: %.2f\n",operador.nome ,operador.salarioDoFuncionario);
    }
}
