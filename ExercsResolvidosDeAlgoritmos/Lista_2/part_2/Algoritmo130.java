package ExercsResolvidosDeAlgoritmos.Lista_2.part_2;

import java.util.Scanner;

public class Algoritmo130 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valor;

        System.out.println("\ndigite valor do produto: ");
        valor = input.nextByte();

        if (valor < 20) {
            System.out.println("\nValor de venda: " + valor*1.45);
        } else {
            System.out.println("\nValor de venda: " + valor*1.3);
        }
        System.out.println("\n");
    }
}
