package ExercsResolvidosDeAlgoritmos.Lista_2.part_3;

import java.util.Scanner;

public class Algoritmo134 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade;
        System.out.println("\nEntre com a idade: ");
        idade = input.nextInt();

        if (idade < 5) {
            System.out.println("\nNao existe categaria para essa idade");
        } else {
            if (idade <= 7) {
                System.out.println("\nCategoria Infantil A");
            } else {
                if (idade <= 10) {
                    System.out.println("\nCategoria Infantil B");
                } else {
                    if (idade <= 13) {
                        System.out.println("\nCategoria Juvenil A");
                    } else {
                        if (idade <= 17) {
                            System.out.println("\nCategoria Juvenil B");
                        } else {
                            System.out.println("\nCategoria Senior");
                        }
                    }
                }
            }
        }
        System.out.println("\n");
        input.close();
    }
}
