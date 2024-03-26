package ZEDlistaDEexercicios.Lista_3_ComandosRepetetivos.Anexo21a40;

import java.util.Scanner;

public class Exerc21 {
    public static void main(String[] args) {
        // 21. Faça um programa que receba dois números. Calcule e mostre:
        //      A soma dos números pares desse intervalo de números, incluindo os números digitados;
        //      A multiplicação dos números ı́mpares desse intervalo, incluindo os digitados;
        Scanner input = new Scanner(System.in);

        double soma = 0.0, multiplicacao = 0.0;

        System.out.println("Digite um numero: ");
        int num = input.nextInt();

        System.out.println("Digite um numero: ");
        int num1 = input.nextInt();

        for (int i = num; i < num1; i++) {
            if ((i % 2 == 0) || (num % 2 == 0) || (num1 % 2 == 0)) {
                // pares
                soma += i;
                soma += num1;
                soma += num;
            } else {
                // impares
                multiplicacao *= i;
                multiplicacao *= num1;
                multiplicacao *= num;
            }
        }

        System.out.println("A soma dos numeros pares: " + soma);
        System.out.println("A multiplicacao dos numeros impares: " + multiplicacao);
        input.close();
    }
}
