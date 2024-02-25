package LoianeJavaBasico.JavaBasico_course_1.General_exercicies.exerc_aula16_17;

import java.util.Scanner;

public class Exerc22 {
    // 22. Altere o programa de cálculo dos números primos, informando, caso o
    //número não seja primo, por quais número ele é divisível.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int numNumero = input.nextInt();

        if (numNumero % 1 == 0) {
            System.out.println("Eh Primo");
        } else {
            if (numNumero % 2 == 0) {
                //System.out.println("");
            }
            System.out.println("Nao Eh Primo");
        }
        input.close();
    }
}
