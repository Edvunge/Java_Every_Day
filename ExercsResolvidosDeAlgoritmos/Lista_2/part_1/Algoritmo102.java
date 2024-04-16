package ExercsResolvidosDeAlgoritmos.Lista_2.part_1;

import java.util.Scanner;

public class Algoritmo102 {
    public static void main(String[] args) {
        // Entrar com um numero e imprimir uma das mensagens:
        // maior do que 20, igual a 20 ou menor do que 20.
        Scanner input = new Scanner(System.in);
        double numero;

        System.out.println("digite numero: ");
        numero = input.nextDouble();

        if (numero > 20) {
            System.out.println("\nmaior que 20");
        } else {
            if (numero < 20) {
                System.out.println("\nMenor que 20");
            } else {
                System.out.println("\nIgual a 20");
            }
        }
        System.out.println("\n");
        input.close();
    }
}
