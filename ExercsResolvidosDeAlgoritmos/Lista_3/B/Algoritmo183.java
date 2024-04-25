package ExercsResolvidosDeAlgoritmos.Lista_3.B;

import java.util.Scanner;

public class Algoritmo183 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        double numero;

        for(a = 1; a <= 10; a++) {
            System.out.println("\nDigite numero: ");
            numero = input.nextDouble();

            System.out.println("Quadrado: " + numero*2);
        }
        System.out.println("\n");
    }
}
