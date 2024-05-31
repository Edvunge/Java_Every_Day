package LoianeJavaBasico.JavaBasicoCourse_1_.GeneralExercicies.exerc_aula14_15;

import java.util.Scanner;

public class Exerc01_MaiorEntreDoisNumeros {
    // 1. Faça um Programa que peça dois números e imprima o maior deles.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        int num2 = sc.nextInt();

        if(num1 > num2) {
            System.out.println("\nO maior numero eh: " + num1);
        } else {
            System.out.println("\nO maior numero eh: " + num2);
        }
        sc.close();
    }
}
