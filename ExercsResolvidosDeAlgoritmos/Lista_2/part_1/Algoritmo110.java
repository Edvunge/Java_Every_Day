package ExercsResolvidosDeAlgoritmos.Lista_2.part_1;

import java.util.Scanner;

public class Algoritmo110 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b;

        System.out.println("\nDigite 1 numero: ");
        a = input.nextDouble();

        System.out.println("\nDigite 2 numero: ");
        b = input.nextDouble();

        if (a == b) {
            System.out.println("\nIguais");
        } else {
            System.out.println("\ndiferentes");
        }
        System.out.println("\n");
    }
}
