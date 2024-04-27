package ExercsResolvidosDeAlgoritmos.Lista_2.part_3;

import java.util.Scanner;

public class Algoritmo135 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade;

        System.out.println("\nDigite idade: ");
        idade = input.nextInt();

        if (idade < 16) {
            System.out.println("\nNao Eleitor");
        } else {
            if (idade > 65) {
                System.out.println("\nEleitor facultativo");
            } else {
                System.out.println("\nEleitor Obrigatorio");
            }
        }
        System.out.println("\n");
    }
}
