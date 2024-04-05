package ZEDlistaDEexercicios.Lista_3_ComandosRepetetivos.Anexo41a60;

import java.util.Scanner;

import static java.lang.System.exit;

public class Exerc47 {
    // 47. Faca um programa que apresente um menu de opcoes para o calculo das seguintes
    // operacoes entre dois numeros:

    // * adicao (opcao 1)
    // * subtracao (opcao 2)
    // * multiplicacao (opcao 3)
    // * divisao (opcao 4).
    // * saıda (opcao 5)

    // O programa deve possibilitar ao usuario a escolha da operacao desejada, a exibicao do
    // resultado e a volta ao menu de opcoes. O programa so termina quando for escolhida a
    // opcao de saıda (opcao 5).
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int option = 0;
        int num1 = 0 , num2 = 0;
        int soma, subtracao, multiplicao, divisao;

        do {
            System.out.println("digite qualquer numero: ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Digite o primeiro valor: ");
                    num1 = input.nextInt();

                    System.out.println("Digite o segundo valor: ");
                    num2 = input.nextInt();

                    soma = num1 + num2;
                    System.out.println(num1 + " + " + num2);
                    System.out.println("Soma dos valores: " + soma);
                    break;
                case 2:
                    System.out.println("Digite o primeiro valor: ");
                    num1 = input.nextInt();

                    System.out.println("Digite o segundo valor: ");
                    num2 = input.nextInt();

                    if (num1 > num2) {
                        subtracao = num1 - num2;
                        System.out.println(num1 + " - " + num2);
                        System.out.println("Subtraccao dos valores: " + subtracao);
                    } else {
                        subtracao = num2 - num1;
                        System.out.println(num2 + " - " + num1);
                        System.out.println("Subtraccao dos valores: " + subtracao);
                    }
                    break;
                case 3:
                    System.out.println("Digite o primeiro valor: ");
                    num1 = input.nextInt();

                    System.out.println("Digite o segundo valor: ");
                    num2 = input.nextInt();

                    multiplicao = num1 * num2;
                    System.out.println(num1 + " * " + num2);
                    System.out.println("Multiplicacao dos valores: " + multiplicao);
                    break;
                case 4:
                    System.out.println("Digite o primeiro valor: ");
                    num1 = input.nextInt();

                    System.out.println("Digite o segundo valor: ");
                    num2 = input.nextInt();

                    if (num2 == 0) {
                        System.out.println("Digite novamente o segundo valor: ");
                        num2 = input.nextInt();

                        divisao = num1 / num2;
                        System.out.println(num1 + " / " + num2);
                        System.out.println("A Divisao dos valores: " + divisao);
                    }

                    divisao = num1 / num2;
                    System.out.println(num1 + " / " + num2);
                    System.out.println("A Divisao dos valores: " + divisao);
                    break;
                case 5:
                    System.out.println("opcao 5");
                    exit(0);
            }
        } while (option != 5);
        input.close();
    }
}
