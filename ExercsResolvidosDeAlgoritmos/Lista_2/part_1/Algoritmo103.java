package ExercsResolvidosDeAlgoritmos.Lista_2.part_1;

import java.util.Scanner;

public class Algoritmo103 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int anon, anoa;

        System.out.println("Entre com ano atual: ");
        anoa = input.nextInt();

        System.out.println("Entre com ano de nascimento: ");
        anon = input.nextInt();

        if (anon > anoa) {
            System.out.println("\nAno de nascimento Invalido");
        } else {
            System.out.printf("\nIdade: %d" , anoa-anon);
        }
        System.out.println("\n");
        input.close();
    }
}
