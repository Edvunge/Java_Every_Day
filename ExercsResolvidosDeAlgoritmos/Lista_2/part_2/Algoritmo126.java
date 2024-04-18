package ExercsResolvidosDeAlgoritmos.Lista_2.part_2;

import java.util.Scanner;

public class Algoritmo126 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x;

        System.out.println("\ndigite valor de X: ");
        x = input.nextDouble();

        if (x == 5) {
            System.out.println("\nO numero e o 5");
        } else {
            if (x == 200) {
                System.out.println("\nO numero e o 200");
            } else {
                if (x == 400) {
                    System.out.println("\nO numero e o 400");
                } else {
                    if (x >= 500 && x <= 1000) {
                        System.out.println("\ninteiro 500-1000");
                    } else {
                        System.out.println("\nFora do escopo");
                    }
                }
            }
        }
        System.out.println("\n");
    }
}
