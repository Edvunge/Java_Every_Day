package ExercsResolvidosDeAlgoritmos.Lista_3.B;

import java.util.Scanner;

public class Algoritmo184 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        double numero;

        for (a = 1; a <= 8; a++) {
            System.out.println("\nDigite numero: ");
            numero = input.nextDouble();
            if (numero > 0) {
                System.out.println("\nLogaritmo: " + Math.log(numero)/Math.log(10));
            } else {
                System.out.println("\nNao fao logaritmo de numero negativo");
            }
            System.out.println("\n");
        }
    }
}
