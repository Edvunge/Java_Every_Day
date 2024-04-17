package ExercsResolvidosDeAlgoritmos.Lista_2.part_2;

import java.util.Scanner;

public class Algoritmo117 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c = 0.0, maior = 0.0;

        System.out.println("\ndigite 1 numero: ");
        a = input.nextDouble();

        System.out.println("\ndigite 1 numero: ");
        b = input.nextDouble();

        System.out.println("\ndigite 1 numero: ");
        c = input.nextDouble();

        if (a > b) {
            maior = a;
        } else {
            maior = c;
        }
        System.out.println("maior: " + maior);
        System.out.println("\n");
    }
}
