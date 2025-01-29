package UdemyCourses.javaComOOP_MatheusBattisti.section04_condicionais;

import java.util.Scanner;

public class Exercicio05_verificacaoDeIntervaloComANO {
    /*
    Exercicio 5: Verificação de Intervalo com ANO

    Peça ao usuario para inserir um número.
    Verifique se o número esta no intervalo de 10 a 20, inclusive
    Se estiver, exiba "Dentro do intervalo". caso contrario, exiba "Fora de intervalo".
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = input.nextInt();

        if (num >= 10 && num <= 20) {
            System.out.println("DENTRO DO INTERVALO!");
        } else {
            System.out.println("FORA DO INTERVALO!");
        }
    }
}
