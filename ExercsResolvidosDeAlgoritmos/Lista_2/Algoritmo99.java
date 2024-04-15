package ExercsResolvidosDeAlgoritmos.Lista_2;

import java.util.Scanner;

public class Algoritmo99 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, c;

        System.out.println("\ndigite um numero com 3 algorismos: ");
        numero = input.nextInt();

        c = numero / 100;

        if (c % 2 == 0 ) {
            System.out.println("\no algorismo das centenas e par" + c);
        } else {
            System.out.println("\no algorismo das centenas e impar" + c);
        }
        System.out.println("\n");
        input.close();
    }
}
