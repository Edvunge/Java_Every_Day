package LoianeJavaBasico.JavaBasico_course_1.General_exercicies.exerc_aula11_12_13;

import java.util.Scanner;

public class Exerc03_SomaDeUmNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 3. Faça um Programa que peça dois números e imprima a soma.
        int num1, num2;

        System.out.println("Digite um numero: ");
        num1 = sc.nextInt();

        System.out.println("Digite um segundo numero: ");
        num2 = sc.nextInt();

        int soma = (num1 + num2);
        System.out.println("O resultado da soma: " + soma);
        sc.close();
    }
}
