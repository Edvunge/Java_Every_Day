package LoianeJavaBasico.JavaBasicoCourse_1_.GeneralExercicies.exerc_aula16_17;

import java.util.Scanner;

public class Exerc13 {
    // 13. Faça um programa que peça dois números, base e expoente, calcule e
    //mostre o primeiro número elevado ao segundo número. Não utilize a
    //função de potência da linguagem.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int answer = 0;

        System.out.println("digite o primeiro numero: ");
        int num1 = input.nextInt();

        System.out.println("digite o seguindo numero: ");
        int num2 = input.nextInt();

        for (int i = 1; i <= num2; i++) {
            answer = answer * num1;
        }
        System.out.println(" Answer: " + answer);
    }
}
