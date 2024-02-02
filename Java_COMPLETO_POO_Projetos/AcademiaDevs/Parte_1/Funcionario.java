package Java_COMPLETO_POO_Projetos.AcademiaDevs.Parte_1;

public class Funcionario {
    String nome;
    double salarioDoFuncionario;


    // ================================================================ METHODOS
    double aumentarSalario(double valor){
        // code here
        return this.salarioDoFuncionario = valor;
    }

    void consultarDadosFuncionario(String nome) {
        // code here
        System.out.format("Nome Do Funcionario: %s ",nome);
    }
}
