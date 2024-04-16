package ExercsResolvidosDeAlgoritmos.Lista_2.part_1;

import java.util.Scanner;

public class Algoritmo94 {
    public static void main(String[] args) {
        // Entrar com um numero e imprimir uma das mensagens : eh multiplo de 3 ou nao e multiplo de 3
        Scanner input = new Scanner(System.in);
        int numero;

        System.out.println("digite um numero: ");
        numero = input.nextInt();

        if (numero % 3 == 0) {
            System.out.println("\nmultiplo de 3");
        } else {
            System.out.println("\nnao multiplo de 3.");
        }
        System.out.println("\n");
    }
}
