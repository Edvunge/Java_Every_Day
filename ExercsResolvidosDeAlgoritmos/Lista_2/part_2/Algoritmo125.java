package ExercsResolvidosDeAlgoritmos.Lista_2.part_2;

import java.util.Scanner;

public class Algoritmo125 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade;

        System.out.println("\ndigite sua idade: ");
        idade = input.nextInt();

        if (idade >= 65) {
            System.out.println("\nmaior de 65");
        } else {
            if (idade >= 18) {
                System.out.println("\nmaior de idade");
            } else {
                if (idade >= 18) {
                    System.out.println("\nmaior de idade");
                } else {
                    System.out.println("\nmenor de idade");
                }
            }
        }
        System.out.println("\n");
    }
}
