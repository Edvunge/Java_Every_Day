package LoianeJavaBasico.JavaBasico_course_1.General_exercicies.exerc_aula16_17;

import java.util.Scanner;

public class Exerc08 {
    public static void main(String[] args) {
        // 8. Faça um programa que leia 5 números e informe a soma e a média
        //dos números.
        Scanner input = new Scanner(System.in);
        int[] num = new int[5];
        double soma = 0, media = 0;

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

        for (int j = 0; j < 5; j++) {
            soma += num[j];
        }

        media = (soma/5);

        System.out.printf("A sua soma e de: %.2f",soma);
        System.out.printf("A sua media e de: %.2f",media);
    }
}
