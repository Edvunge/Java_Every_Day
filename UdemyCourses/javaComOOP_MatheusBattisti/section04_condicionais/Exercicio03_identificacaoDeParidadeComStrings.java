package UdemyCourses.javaComOOP_MatheusBattisti.section04_condicionais;

import java.util.Scanner;

public class Exercicio03_identificacaoDeParidadeComStrings {
    /*
    Exercicio 3: Identificação de Paridade com Strings

    Peça ao usuario para inserir um numero.
    Verifique se o numero é par ou impar, e exiba a palavra "Par" ou "Impar".
    Use uma String para armazenar o resultado e exibi-la.

    Depois de avaliar o numero, tu vai colocar se é par ou impar em uma var.
    */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira um numero: ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("NUMERO PAR");
        } else {
            System.out.println("NUMERO IMPAR");
        }
    }
}
