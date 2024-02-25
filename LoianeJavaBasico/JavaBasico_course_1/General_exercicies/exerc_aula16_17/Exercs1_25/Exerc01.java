package LoianeJavaBasico.JavaBasico_course_1.General_exercicies.exerc_aula16_17;

import java.util.Scanner;

public class Exerc01 {
    /*
    1. Faça um programa que peça uma nota, entre zero e dez. Mostre uma
    mensagem caso o valor seja inválido e continue pedindo até que o
    usuário informe um valor válido.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        do {
            System.out.println("Digite uma nota: ");
            num = input.nextInt();

            if (num < 0 || num > 10) {
                System.out.println("Nota inválida. Digite novamente.");
            } else {
                System.out.println("Nota válida.");
            }
        } while (num < 0 || num > 10);

        input.close();
    }
}
