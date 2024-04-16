package ExercsResolvidosDeAlgoritmos.Lista_2.part_1;

import java.util.Scanner;

public class Algoritmo111 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b;

        System.out.println("\nDigite 1 numero: ");
        a = input.nextDouble();

        System.out.println("\nDigite 1 numero: ");
        b = input.nextDouble();

        if (a > b) {
            System.out.println("\nmaior: " + a);
        } else {
            System.out.println("\nmaior: " + b);
        }
        System.out.println("\n");
        input.close();
    }
}
