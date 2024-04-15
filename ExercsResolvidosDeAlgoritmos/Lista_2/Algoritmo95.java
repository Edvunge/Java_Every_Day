package ExercsResolvidosDeAlgoritmos.Lista_2;

import java.util.Scanner;

public class Algoritmo95 {
    public static void main(String[] args) {
        // Entrar com um numero e informar se ele eh ou nao divisivel por 5.
        Scanner input = new Scanner(System.in);
        int numero;

        System.out.println("\ndigite um numero: ");
        numero = input.nextInt();

        if (numero % 5 == 0) {
            System.out.println("\neh divisivel por 5");
        } else {
            System.out.println("\nnao eh divisivel por 5");
        }
        System.out.println("\n");
    }
}
