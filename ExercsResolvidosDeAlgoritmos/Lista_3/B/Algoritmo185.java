package ExercsResolvidosDeAlgoritmos.Lista_3.B;

import java.util.Scanner;

public class Algoritmo185 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        double numero;

        for (a = 1; a <= 15; a++) {
            System.out.println("\nDigite numero: ");
            numero = input.nextDouble();

            if (numero >= 0) {
                System.out.println("\nRaiz: " + Math.sqrt(numero));
            } else {
                System.out.println("\nNao faço raiz de numero negativo");
            }
        }
        System.out.println("\n");
    }
}
