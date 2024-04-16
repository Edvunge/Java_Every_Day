package ExercsResolvidosDeAlgoritmos.Lista_2.part_1;

import java.util.Scanner;

public class Algoritmo90 {
    public static void main(String[] args) {
        // Entrar com um numero e imprimi-lo caso seja maior que 20
        Scanner input = new Scanner(System.in);
        double numero;

        System.out.println("\n\nDigite numero: ");
        numero = input.nextDouble();

        if (numero > 20) {
            System.out.println("numero: " + numero);
        }
        System.out.println("\n");
    }
}
