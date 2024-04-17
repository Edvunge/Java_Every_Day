package ExercsResolvidosDeAlgoritmos.Lista_2.part_2;

import java.util.Scanner;

public class Algoritmo116 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;

        System.out.println("\nDigite 1 numero: ");
        a = input.nextByte();

        System.out.println("\nDigite 2 numero: ");
        b = input.nextByte();

        System.out.println("\nDigite 3 numero: ");
        c = input.nextByte();

        if (a > b) {
            if (a > c) {
                System.out.println("\nmaior: " + a);
            } else {
                System.out.println("\nmaior: " + c);
            }
        } else {
            if (b > c) {
                System.out.println("\nmaior: " + b);
            } else {
                System.out.println("\nmaior: " + c);
            }
        }
        System.out.println("\n");
    }
}
