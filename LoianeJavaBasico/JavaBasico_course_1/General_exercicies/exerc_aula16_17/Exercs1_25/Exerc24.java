package LoianeJavaBasico.JavaBasico_course_1.General_exercicies.exerc_aula16_17;

import java.util.Scanner;

public class Exerc24 {
    // 24. Faça um programa que calcule o mostre a média aritmética de N
    //notas.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double media = 0.0, soma = 0.0;

        System.out.println("Digite um numero: ");
        int numN = input.nextInt();

        for (int i = 0; i < numN; i++) {
            soma += i;
        }

        media = (soma/numN);
        System.out.println("A media: " + media);
        input.close();
    }
}
