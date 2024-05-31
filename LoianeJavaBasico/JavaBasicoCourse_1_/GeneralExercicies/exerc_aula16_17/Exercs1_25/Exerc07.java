package LoianeJavaBasico.JavaBasicoCourse_1_.GeneralExercicies.exerc_aula16_17;

import java.util.Scanner;

public class Exerc07 {
    /*
    7. Faça um programa que leia 5 números e informe o maior número.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num = new int[5];
        int maxNum = 0;

        System.out.println("Digite o primeiro.");
        num[0] = input.nextInt();

        System.out.println("Digite o segundo numero..");
        num[1] = input.nextInt();

        System.out.println("Digite o terceiro numero.");
        num[2] = input.nextInt();

        System.out.println("Digite o quarto numero..");
        num[3] = input.nextInt();

        System.out.println("Digite o quinto numero.");
        num[4] = input.nextInt();

        for (int i = 0; i < 5; i++) {
            if (num[i] > maxNum)
                maxNum = num[i];
        }

        System.out.printf("o maior numero: %d",maxNum);
    }
}
