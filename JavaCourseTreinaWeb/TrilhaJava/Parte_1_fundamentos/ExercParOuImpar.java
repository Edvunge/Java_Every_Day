package JavaCourseTreinaWeb.TrilhaJava.Parte_1_fundamentos;

import java.util.Scanner;

public class ExercParOuImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        Dado um valor inteiro N, complete o código abaixo de acordo com as condições:

        Se N for par, exiba no console: "Par";
        Se N for ímpar, exiba no console: "Ímpar".
        */
        System.out.println("Digite um numero: ");
        int N = input.nextInt();

        if(N % 2 == 0) {
            System.out.printf("O numero N: %d eh PAR!\n",N);
        } else {
            System.out.printf("O numero N: %d eh IMPAR!\n",N);
        }
        input.close();
    }
}
