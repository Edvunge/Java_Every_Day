package ZEDlistaDEexercicios.NiumaAulas.aula01;



import java.util.Scanner;
import static java.lang.System.exit;
import static java.lang.System.setOut;

import java.util.*;

public class Exerc01 {
    // 47. Faca um programa que apresente um menu de opcoes para
    // o calculo das seguintes

    // operacoes entre dois numeros:

    // adicao (opcao 1)
    // subtracao (opcao 2)
    // multiplicacao (opcao 3)
    // divisao (opcao 4).
    // saıda (opcao 5)

    //  O programa deve possibilitar ao usuario a
    //  escolha da operacao desejada, a exibicao do
    //  resultado e a volta ao menu de opcoes.
    //  O programa so termina quando for escolhida a
    //  opcao de saıda (opcao 5).
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int option = 3;
        int soma, num1, num2;
        int subt, mult, divi;

        do {
            System.out.println("\nDigite uma opcao: ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.print("\ndigite o primeiro numero: ");
                    num1 = input.nextInt();

                    System.out.print("digite o segundo numero: ");
                    num2 = input.nextInt();

                    soma = num1 + num2;
                    System.out.println(num1 + " + " + num2);
                    System.out.println("a soma eh: " + soma);
                    break;
                case 2:
                    System.out.print("\ndigite o primeiro numero: ");
                    num1 = input.nextInt();

                    System.out.print("digite o segundo numero: ");
                    num2 = input.nextInt();

                    // -9x + 3 = 9 *(-1)

                    if(num1 > num2)  {
                        subt = num1 - num2;
                        System.out.println(num1 + " - " + num2);
                        System.out.println("a subtracao eh: " + subt);
                    } else if (num2 > num1){
                        subt = num2 - num1;
                        System.out.println(num2 + " - " + num1);
                        System.out.println("a subtracao eh: " + subt);
                    } else {// 2 - 2
                        subt = num2 - num1;
                        System.out.println(num2 + " - " + num1);
                        System.out.println("a subtracao eh: " + subt);
                    }
                    break;
                case 3:
                    System.out.print("\ndigite o primeiro numero: ");
                    num1 = input.nextInt();

                    System.out.print("digite o segundo numero: ");
                    num2 = input.nextInt();

                    mult = num1 * num2;
                    System.out.println(num1 + " * " + num2);
                    System.out.println("a multiplicacao eh: " + mult);
                    break;
                case 4:
                    System.out.print("\ndigite o primeiro numero: ");
                    num1 = input.nextInt();

                    System.out.print("digite o segundo numero: ");
                    num2 = input.nextInt();

                    if (num2 == 0) {
                        System.out.print("num2 nao pode ser = 0");
                        System.out.println("digite o segundo numero novamente: ");
                        num2 = input.nextInt();

                        divi = num1 / num2;
                        System.out.println(num1 + " / " + num2);
                        System.out.println("a divi eh: " + divi);
                    } else {
                        divi = num1 / num2;
                        System.out.println(num1 + " / " + num2);
                        System.out.println("a divi eh: " + divi);
                    }
                    break;
                case 5:
                    System.out.println("opcao 5 - saida");
                    exit(0);
            }
        } while (option != 5);
        input.close();
    }
}
