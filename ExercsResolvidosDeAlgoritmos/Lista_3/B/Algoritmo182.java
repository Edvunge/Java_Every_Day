package ExercsResolvidosDeAlgoritmos.Lista_3.B;

import java.util.Scanner;

public class Algoritmo182 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        double numero;

        for (a = 1; a <= 10; a++) {
            System.out.println("\nDigite numero: ");
            numero = input.nextInt();

            System.out.println("Metade: " + numero/2);
        }
        System.out.println("\n");
    }
}
