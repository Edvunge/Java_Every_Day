package ExercsResolvidosDeAlgoritmos.Lista_3.B;

import java.util.Scanner;

public class Algoritmo187 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base, expo, pot, i;

        System.out.println("\nDigite a base inteira e maior do que 1: ");
        base = input.nextInt();

        System.out.println("\nDigite expoente inteiro maior que 1:");
        expo = input.nextInt();

        if ( base >= 2 && expo > 1) {
            pot = 1;
            for ( i = 1; i <= expo; i++) {
                pot = pot * base;
            }
            System.out.printf("\npotencia: ", pot);
        } else {
            System.out.println("\nNao satisfazem");
        }
        System.out.printf("\n");
    }
}
