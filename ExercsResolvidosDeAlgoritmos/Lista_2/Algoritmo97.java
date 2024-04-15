package ExercsResolvidosDeAlgoritmos.Lista_2;

import java.util.Scanner;

public class Algoritmo97 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;

        System.out.println("\ndigite um numero: ");
        numero = input.nextInt();

        if (numero % 10 == 0) {
            System.out.println("\nmultiplo de 10");
        } else {
            if (numero % 2 == 0) {
                System.out.println("\nmultiplo de 2");
            } else {
                if (numero % 5 == 0) {
                    System.out.println("\nmultiplo de 5");
                } else {
                    System.out.println("\nnao eh multiplo de 2 nem de 5");
                }
            }
        }
        System.out.println("\n");
        input.close();
    }
}
