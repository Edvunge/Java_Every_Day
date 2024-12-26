package books.JavaBasico_ConceitosIniciaisDeProgramacao.modulo10.project01;

import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        /*
        1. Calculadora Básica
        Descrição: Uma calculadora que realiza operações matemáticas simples
        (adição, subtração, multiplicação e divisão).

        Aprendizado: Variáveis, operadores aritméticos e controle de fluxo.

        Desafios: Implementar verificações de erros (como divisão por zero) e
        usar estruturas de repetição para fazer vários cálculos.
        */

        // add, sub, multiply, division

        Scanner input = new Scanner(System.in);

        // variables section
        int number_1, number_2;
        int add = 0, sub = 0, multiply = 0, division = 0;
        int y = 0;

        do {
            System.out.printf("\n====\tEscolha uma operação que deseja efetuar: \t====\n");
            System.out.println("|\t\tEscolha click 1 - (somar) , click 2 - (subtrair)");
            System.out.println("|\t\tEscolha click 3 - (multiplicar) , click 4 - (dividir)");
            String option = input.next();

            switch (option) {
                case "1": // soma

                    System.out.println("\nDigite o primeiro numero:  ");
                    number_1 = input.nextInt();

                    System.out.println("\nDigite o segundo numero:  ");
                    number_2 = input.nextInt();

                    add = number_1 + number_2;
                    System.out.printf("O valor %d + %d = %d ", number_1, number_2, add);
                    break;
                case "2": // subtracçao
                    System.out.println("\nDigite o primeiro numero:  ");
                    number_1 = input.nextInt();

                    System.out.println("\nDigite o segundo numero:  ");
                    number_2 = input.nextInt();

                    if (number_1 > number_2) {
                        sub = number_1 - number_2;
                        System.out.printf("O valor %d - %d = %d ", number_1, number_2, sub);
                    } else {
                        sub = number_2 - number_1;
                        System.out.printf("O valor %d - %d = %d ", number_2, number_1, sub);
                    }
                    break;
                case "3": // multiplicaçao
                    System.out.println("\nDigite o primeiro numero:  ");
                    number_1 = input.nextInt();

                    System.out.println("\nDigite o segundo numero:  ");
                    number_2 = input.nextInt();

                    multiply = number_1 * number_2;
                    System.out.printf("O valor %d * %d = %d ", number_1, number_2, multiply);
                    break;
                case "4": // divisao
                    System.out.println("\nDigite o primeiro numero:  ");
                    number_1 = input.nextInt();

                    System.out.println("\nDigite o segundo numero:  ");
                    number_2 = input.nextInt();

                    if (number_2 == 0) {
                        while (number_2 == 0) {
                            System.out.println("\nDigite novamente o segundo numero:  ");
                            number_2 = input.nextInt();
                        }
                        division = number_1 / number_2;
                        System.out.printf("O valor %d / %d = %d ", number_1, number_2, division);
                    } else {
                        division = number_1 / number_2;
                        System.out.printf("O valor %d / %d = %d ", number_1, number_2, division);
                    }
                    break;
                default:
                    System.out.println("\nInvalid Option");
            }
            System.out.println("\n\tQueres continuar a calcular: ");
            System.out.println("\tClick 1 - (para terminar) \tClick 0 - (para continuar)");
            y = input.nextInt();
        } while (y != 1);
    }
}
