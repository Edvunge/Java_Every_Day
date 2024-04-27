package ExercsResolvidosDeAlgoritmos.Lista_2.part_3;

import java.util.Scanner;

public class Algoritmo136 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade;
        String nome;

        System.out.println("\nEntre com o nome: ");
        nome = input.next();

        System.out.println("\nEntre com a sua idade: ");
        idade = input.nextInt();

        if (idade <= 10) {
            System.out.println("\n" + nome + " pagara R$ 30.00");
        } else {
            if (idade <= 29) {
                System.out.println("\n" + nome + " pagara R$ 60.00");
            } else {
                if (idade <= 45) {
                    System.out.println("\n" + nome + " pagara R$ 120.00");
                } else {
                    if (idade <= 59) {
                        System.out.println("\n" + nome + " pagara R$ 150.00");
                    } else {
                        if (idade <= 65) {
                            System.out.println("\n" + nome + " pagara R$ 250.00");
                        } else {
                            System.out.println("\n" + nome + " pagara R$ 400.00");
                        }
                    }
                }
            }
        }
        System.out.println("\n");
    }
}
