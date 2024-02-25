package LoianeJavaBasico.JavaBasico_course_1.General_exercicies.exerc_aula16_17;

import java.util.Scanner;

public class Exerc10 {
    // 10. Faça um programa que receba dois números inteiros e gere os
    //números inteiros que estão no intervalo compreendido por eles.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("digite o primeiro numero: ");
        int num1 = input.nextInt();

        System.out.println("digite o seguindo numero: ");
        int num2 = input.nextInt();

        for (int i = num1; i < num2; i++) {
            System.out.printf(" %d ",i);
        }
        input.close();
    }
}
