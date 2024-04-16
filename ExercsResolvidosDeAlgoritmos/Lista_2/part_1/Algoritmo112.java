package ExercsResolvidosDeAlgoritmos.Lista_2.part_1;

import java.util.Scanner;

public class Algoritmo112 {
    public static void main(String[] args) {
        // Entrar com dois numeros e imprimir o menor numero
        Scanner input = new Scanner(System.in);
        double a, b;

        System.out.println("\nDigite 1 numero: ");
        a = input.nextDouble();

        System.out.println("\nDigite 2 numero: ");
        b = input.nextDouble();

        if (a < b) {
            System.out.println("\nmenor: " + a);
        } else {
            System.out.println("\nmenor: " + b);
        }
        System.out.println("\n");
    }
}
