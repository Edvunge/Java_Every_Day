package Java_COMPLETO_POO_Projetos.AcademiaDevs.Parte_1;

public class TestaMetodosFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        // double com return parametro tipo double
        System.out.println("\n====== ACESSANDO SALARIO DO FUNCIONARIO: ======");
         double aumento = funcionario.aumentarSalario(23.4);
        System.out.format("O seu salario depois do aumento\n     passa a ser %.2f\n",aumento);

        // chamando o metodo vazio e sem retorno
        System.out.println("\n====== ACESSANDO DADOS DO FUNCIONARIO: ======");
        funcionario.consultarDadosFuncionario("edvaldo");
    }
}
