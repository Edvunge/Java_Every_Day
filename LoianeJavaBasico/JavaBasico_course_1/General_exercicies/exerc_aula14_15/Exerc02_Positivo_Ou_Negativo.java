package LoianeJavaBasico.JavaBasico_course_1.General_exercicies.exerc_aula14_15;

import java.util.Scanner;

public class Exerc02_Positivo_Ou_Negativo {
    // 2. Faça um Programa que peça um valor e mostre na tela se o valor é
    //positivo ou negativo.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = sc.nextInt();

        if(num > 0) {
            System.out.printf("\nO numero %d eh POSITIVO",num);
        } else {
            System.out.printf("\nO numero %d  NAO eh POSITIVO",num);
        }
        sc.close();
    }
}
