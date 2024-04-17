package ExercsResolvidosDeAlgoritmos.Lista_2.part_2;

import java.util.Scanner;

public class Algoritmo118 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c, aux;

        System.out.println("\ndigite 1 numero: ");
        a = input.nextDouble();

        System.out.println("\ndigite 2 numero: ");
        b = input.nextDouble();

        System.out.println("\ndigite 3 numero: ");
        c = input.nextDouble();

        if (a > b) {
            aux = a;
            a = b;
            b = aux;
        }

        if (a > c) {
            aux = a;
            a = c;
            c = aux;
        }

        if (b > c) {
            aux = b;
            b = c;
            c = aux;
        }

        System.out.println("Ordem Crescente: " + a + " " + b + " " + c);
        System.out.println("\n");
    }
}
