package LoianeJavaBasico.JavaBasicoCourse_1_.GeneralExercicies.exerc_aula14_15;

import java.util.Scanner;

public class Exerc06 {
    public static void main(String[] args) {
        /*
        6. Faça um Programa que leia três números e mostre o maior deles.
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double num1 = input.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double num2 = input.nextDouble();

        System.out.println("Digite o terceiro numero: ");
        double num3 = input.nextDouble();


        if (num1 > num2 && num1 > num3 && num2 > num3){
            System.out.println(num1);
        } else if (num2 > num1 && num3 < num2 && num1 > num3){
            System.out.println(num2);
        } else if (num3 > num1 && num3 > num2 && num2 > num1){
            System.out.println(num3);
        }
        input.close();
    }
}
