package LoianeJavaBasico.JavaBasicoCourse_1_.GeneralExercicies.exerc_aula16_17;

import java.util.Scanner;

public class Exerc18 {
    // 18. Faça um programa que, dado um conjunto de N números, determine o
    //menor valor, o maior valor e a soma dos valores.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maxValue = 0, minValue = 0, soma = 0;

        System.out.println("Digite um numero: ");
        int numN = input.nextInt();

        for (int j = 0; j < numN; j++) {
            if (j > numN) {
                maxValue++;
            } else {
                minValue++;
            }
            soma += j;
        }

        System.out.println("o maior valor: " + maxValue);
        System.out.println("o menor valor: " + minValue);
        System.out.println("A soma: " + soma);
        input.close();
    }
}
