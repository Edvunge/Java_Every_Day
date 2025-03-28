package books.K19_treinamentos.k11_OrientacaoObjetos_Em_Java.sect03_OO.exerciciosComplementares;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario();
        func1.nome = "Da Costa";
        func1.salario = 220.34;

        Funcionario func2 = new Funcionario();
        func2.nome = "Antonio";
        func2.salario = 1222.21;

        System.out.println("Dados do Funcionario 1");
        System.out.println("Nome: " + func1.nome);
        System.out.println("Salario: " + func1.salario);

        System.out.println("-------------------------");
        System.out.println("Dados do Funcionario 2");
        System.out.println("Nome: " + func2.nome);
        System.out.println("Salario: " + func2.salario);
    }
}
