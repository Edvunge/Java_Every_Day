package ExercsResolvidosDeAlgoritmos.Lista_2.part_1;

import java.util.Scanner;

public class Algoritmo114 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b;

        System.out.println("\nDigite o 1 numero: ");
        a = input.nextDouble();

        System.out.println("\nDigite o 2 numero: ");
        b = input.nextDouble();

        if (a > b) {
            System.out.println("\n" + a + " " + b);
        } else {
            System.out.println("\n" + b + " " + a);
        }
        System.out.println("\n");
        input.close();
    }
}
