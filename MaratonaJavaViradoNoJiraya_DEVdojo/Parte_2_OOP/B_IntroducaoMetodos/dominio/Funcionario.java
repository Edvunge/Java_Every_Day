package MaratonaJavaViradoNoJiraya_DEVdojo.Parte_2_OOP.B_IntroducaoMetodos.dominio;

public class Funcionario {
    /*
Crie uma classe funcionario com os seguites atributos

nome
idade
salario // tres salarios devem ser guardados

Crie dois metodos

1. Para imprimir os dados
2. Para tirar a media dos salarios e imprimir o resultado
*/
    public String nome;
    public int idade;
    public double salario1;
    public double salario2;
    public double salario3;

    public void imprimirDados(String nome, int idade, double salario1, double salario2, double salario3) {
        this.nome = nome;
        this.idade = idade;
        this.salario1 = salario1;
        this.salario2 = salario2;
        this.salario3 = salario3;

        System.out.println("###########");
        System.out.println("Nome: "+ nome);
        System.out.println("idade: "+ idade);
        System.out.println("salario1: "+ salario1);
        System.out.println("salario2: "+ salario2);
        System.out.println("salario3: "+ salario3);
    }

    public void mediaDosSalarios(double salario1, double salario2, double salario3) {
        double media, resultado;
        media = (salario1 + salario2 + salario3)/3;
        System.out.printf("O resultado da media dos salarios: %.2f" , media);
    }
}
