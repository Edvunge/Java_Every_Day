package ExercsResolvidosDeAlgoritmos.Lista_2.part_2;

import java.util.Scanner;

public class Algoritmo127 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota1, nota2, media;
        String nome;

        System.out.println("\ndigite o seu nome: ");
        nome = input.next();

        System.out.println("\ndigite a 1 nota: ");
        nota1 = input.nextDouble();

        System.out.println("\ndigite a 2 nota: ");
        nota2 = input.nextDouble();

        media = (nota1 + nota2)/ 2;

        if (media >= 7) {
            System.out.println(nome + "  " + media + " AP");
        } else {
            if (media < 3) {
                System.out.println(nome + "  " + media + " RP");
            } else {
                System.out.println(nome + "  " + media + " PF");
            }
        }
        System.out.println("\n");
    }
}
