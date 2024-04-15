package ExercsResolvidosDeAlgoritmos.Lista_2;

import java.util.Scanner;

public class Algoritmo91 {
    public static void main(String[] args) {
        // Construir um algoritmo que leia dois valores numericos inteiros e efetue a adicao;
        // caso o resultado seja maior que 10, apresenta-lo.
        Scanner input = new Scanner(System.in);
        int num1, num2, soma;

        System.out.println("\n\nDigite 1 numero: ");
        num1 = input.nextInt();

        System.out.println("\n\nDigite 2 numero: ");
        num2 = input.nextInt();

        soma = num1 + num2;
        if (soma > 10) {
            System.out.println("\nSoma: " + soma);
        }
        System.out.println("\n");
    }
}
