package MaratonaJavaViradoNoJiraya_DEVdojo.Parte_2_OOP.B_IntroducaoMetodos.test;

import MaratonaJavaViradoNoJiraya_DEVdojo.Parte_2_OOP.B_IntroducaoMetodos.dominio.Funcionario;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "edvaldo";
        funcionario.idade = 10;
        funcionario.salario1 = 3455.56;
        funcionario.salario2 = 5444.67;
        funcionario.salario3 = 1122.45;

        funcionario.imprimirDados(funcionario.nome, funcionario.idade, funcionario.salario1, funcionario.salario2, funcionario.salario3);
        funcionario.mediaDosSalarios(funcionario.salario1, funcionario.salario2, funcionario.salario3);
    }
}
