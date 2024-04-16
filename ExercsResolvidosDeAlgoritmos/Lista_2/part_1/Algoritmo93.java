package ExercsResolvidosDeAlgoritmos.Lista_2.part_1;

import java.util.Scanner;

public class Algoritmo93 {
    public static void main(String[] args) {
        // Entrar com um numero e imprimir a raiz quadrada do numero caso ele seja positivo e o quadrado
        // do numero caso ele seja negativo.
        Scanner input = new Scanner(System.in);
        double numero;

        System.out.println("\ndigite um numero: ");
        numero = input.nextDouble();

        if (numero > 0) {
            System.out.println("raiz: " + Math.sqrt(numero));
        } else {
            if (numero < 0) {
                System.out.println("\nQuadrado: " + numero*2);
            }
        }
        System.out.println("\n");
        input.close();
    }
}
