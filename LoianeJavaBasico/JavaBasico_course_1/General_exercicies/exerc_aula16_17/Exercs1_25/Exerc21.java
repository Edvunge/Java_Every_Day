package LoianeJavaBasico.JavaBasico_course_1.General_exercicies.exerc_aula16_17;

import java.util.Scanner;

public class Exerc21 {
    //  21. Faça um programa que peça um número inteiro e determine se ele é
    //  ou não um número primo. Um número primo é aquele que é divisível
    //  somente por ele mesmo e por 1.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int numNumero = input.nextInt();

        if (numNumero % 1 == 0) {
            System.out.println("Eh Primo");
        } else {
            System.out.println("Nao Eh Primo");
        }
        input.close();
    }
}
